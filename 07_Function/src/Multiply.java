// Make a function to multiply 2 numbers and return the product.

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        int multi = a * b;

        System.out.println("Multiply of the two number is -> "+multi);
    }
}
