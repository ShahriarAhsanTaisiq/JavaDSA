package Pattern;

import java.util.Scanner;

public class InvertedHalfPyramid180Rotate {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a (Row): ");
        int a = input.nextInt();

        for (int i=1; i<=a; i++){
            // inner loop for space
            for (int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            //inner loop for start
            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
