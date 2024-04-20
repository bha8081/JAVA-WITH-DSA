import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the any number. ");
        int a = sc.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= a-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
