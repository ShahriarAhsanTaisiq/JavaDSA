package DS.Arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the size of column: ");
        int column = input.nextInt();

        // 2D array initialization
        int[][]numbers = new int[row][column];
        //taking array input
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Enter the value for "+ i+","+j +" position.");
               numbers[i][j] = input.nextInt();
            }
        }
        // display the array
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
