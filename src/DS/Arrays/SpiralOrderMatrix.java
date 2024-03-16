package DS.Arrays;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the size of column: ");
        int column = input.nextInt();

        // 2D array initialization
        int[][] matrix = new int[row][column];
        //taking array input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the value for " + i + "," + j + " position.");
                matrix[i][j] = input.nextInt();
            }
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int colStart = 0;
        int colEnd = column-1;
        System.out.println("Spiral Matrix: ");
        while(rowStart<=rowEnd && colStart<=colEnd){

            for (int c=colStart; c<=colEnd; c++){
                System.out.print(matrix[rowStart][c] + " ");
            }
            rowStart++;

            for (int r = rowStart; r<=rowEnd; r++ ){
                System.out.print(matrix[r][colEnd] + " ");
            }
            colEnd--;

            for (int c= colEnd; c>=colStart; c--){
                System.out.print(matrix[rowEnd][c]+" ");
            }
            rowEnd--;

            for (int r = rowEnd; r>=rowStart; r--){
                System.out.print(matrix[r][colStart]+" ");
            }
            colStart++;
        }
        System.out.println();
    }
}
