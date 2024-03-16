package Pattern;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a (row) for Inverted Half Pyramid : ");
        int a = input.nextInt();

        for (int i=a; i>=1 ; i--){
            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
