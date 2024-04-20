//Take a matrix as input from the user.Search for a given number x and print the indices at which it occurs.

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Number.");
        int row = sc.nextInt();

        System.out.println("Enter Columns Number.");
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        //input
        //row
        for(int i=0; i<row; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //Take input
        System.out.println("Enter Number. ");
        int x = sc.nextInt();

        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                //compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j +")");
                }
            }
        }
    }
}
