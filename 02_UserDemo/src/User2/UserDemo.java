package User2;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Value: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Value: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of the total value : "+sum);
    }
}
