package Pattern;

import java.util.Scanner;

public class InvertedHalfPyramidNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a (row): ");
        int a = input.nextInt();

        for(int i=a; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
