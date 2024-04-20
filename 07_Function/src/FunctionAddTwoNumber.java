// Make a function to add 2 numbers and return the sum.

import java.util.Scanner;

public class FunctionAddTwoNumber {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of two number -> "+sum);
    }
}
