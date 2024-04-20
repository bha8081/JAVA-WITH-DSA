import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number.");
        int a = sc.nextInt();

        System.out.println("Enter the second number.");
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}