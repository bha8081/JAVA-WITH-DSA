import java.util.Scanner;

public class TakeUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String userInput = sc.nextLine();
        System.out.println("Your Name is ' " +userInput);
    }
}
