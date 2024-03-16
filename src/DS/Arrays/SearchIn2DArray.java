package DS.Arrays;

import java.util.Scanner;

public class SearchIn2DArray {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the size of column: ");
        int column = input.nextInt();

        // 2D array initialization
        int[][]matrix = new int[row][column];
        //taking array input
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Enter the value for "+ i+","+j +" position.");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the searching value: ");
        int target = input.nextInt();
        boolean found = false;
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (matrix[i][j] == target){
                    found = true;
                    System.out.println(target + "element found at index "+ i +","+ j +".");
                }
            }
        }
        if (!found)
            System.out.println(target+ "elements not found!!");
    }
}
