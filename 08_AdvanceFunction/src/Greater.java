// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Greater {
    public static int getGreater(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number.");
        int a = sc.nextInt();

        System.out.println("Enter Second Number. ");
        int b = sc.nextInt();

        System.out.println("Greater value is' "+getGreater(a, b));
    }
}
