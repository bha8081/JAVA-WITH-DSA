import java.util.Scanner;

public class UserDemoNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Value: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sun of the Value: " +sum);
    }
}
