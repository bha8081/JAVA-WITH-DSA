import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a-1 || j == 0 || j == b-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
