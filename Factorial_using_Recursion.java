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


// T(n) = T(n-1) + 3    (3 is for three constant operations like multiplication, subtraction and checking the value of n in each recursive call.) 

// = T(n-2) + 6 (Second recursive call) 
// = T(n-3) + 9 (Third recursive call) 
// .
// . 
// . 
// . 
// = T(n-k) + 3k 
// till, k = n 
// Then, = T(n-n) + 3n 
//           = T(0) + 3n 
//           = 1 + 3n
// Therefore, 
// The time complexity is O(n).
