public class Lab_1_Transpose_Matrix {
    static final int n = 3;
    static void transpose(int M[][], int N[][]) {
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                N[i][j] = M[j][i];
    }
    
    public static void main (String[] args){
        int M[][] = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
     
        int N[][] = new int[n][n], i, j;
     
        transpose(M, N);
