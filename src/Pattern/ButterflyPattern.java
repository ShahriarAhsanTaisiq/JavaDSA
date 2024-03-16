package Pattern;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a(row) : ");
        int a = input.nextInt();
        int space;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            space = 2*(a-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=a; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            space = 2*(a-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
