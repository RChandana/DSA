import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = multiplication(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int multiplication(int num){
        if (num >= 1){                                
            return num * multiplication(num - 1);                          // O(1)   
        }
        else
            return 1;
    }
}
