// Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value. ");
        int n1 = sc.nextInt();

        System.out.println("Enter second value. ");
        int n2 = sc.nextInt();

        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 -n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    }
}
