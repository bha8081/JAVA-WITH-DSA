import java.util.Scanner;

public class MarksDemo {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//
//        marks[0] = 95;
//        marks[1] = 86;
//        marks[2] = 79;
//
//        System.out.println(marks[2]);
//
//        for(int i=1; i<3; i++) {
//            System.out.println(marks[i]);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size.");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
