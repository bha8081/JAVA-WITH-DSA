// Enter 3 Number from the user & make a function to print their average.

import java.util.Scanner;

public class AverageOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number. ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number. ");
        int b = sc.nextInt();

        System.out.println("Enter Thread Number. ");
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.println("Sum Of Three Number -> "+average);
    }
}
