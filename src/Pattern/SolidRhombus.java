package Pattern;

import java.util.Scanner;

public class SolidRhombus {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
