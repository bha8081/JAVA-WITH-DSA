// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class PersonAge {
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }  else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your age is"+isElligible(age));

    }
}
