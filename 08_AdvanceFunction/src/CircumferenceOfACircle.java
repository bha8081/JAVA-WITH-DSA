import java.util.Scanner;

public class CircumferenceOfACircle {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value.");
        Double r = sc.nextDouble();
        System.out.println(getCircumference());
    }
}
