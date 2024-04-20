import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Value.");
        int a = sc.nextInt();

        System.out.println("Entre Second Value.");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A is equal to the B.");
        } else if (a > b) {
            System.out.println("A is greater then B.");
        } else {
            System.out.println("A is less then B.");
        }

    }
}
