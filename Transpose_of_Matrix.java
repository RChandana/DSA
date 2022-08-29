public class Lab_1_Transpose_Matrix {
    static final int n = 3;
    static void transpose(int M[][], int N[][]) {
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                N[i][j] = M[j][i];
    }   
