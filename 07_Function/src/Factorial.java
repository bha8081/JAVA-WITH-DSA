// Find the factorial of a number.

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n) {
//        loop
        if (n < 0) {
            System.out.println("Invalid Number.");
            return;
        }
        int factorial = 1;

        for (int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");
        int n = sc.nextInt();

        System.out.println("Factorial of given number is -> ");
        printFactorial(n);
    }

}
