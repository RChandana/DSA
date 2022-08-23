import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact = 1, i;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(i = 1; i <= num; i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of " + num + " is " + fact);
    }
}
