import java.util.Scanner;

public class GraterAndLessThen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of A : ");
        int a = sc.nextInt();

        System.out.println("Enter Value of B : ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A Equal to B");
        } else {
            if (a > b) {
                System.out.println("A is Greater");
            } else {
                System.out.println("A is lesser");
            }
        }
    }
}
