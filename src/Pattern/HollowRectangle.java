package Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a (row): ");
        int a = input.nextInt();
        System.out.println("Enter the value of b (column): ");
        int b = input.nextInt();

        for (int i =1 ; i<= a; i++){
            for(int j=1 ; j<= b; j++){
                if (i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
