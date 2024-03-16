package Pattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a (row): ");
        int a = input.nextInt();
        System.out.println("Enter the value of b (column): ");
        int b = input.nextInt();

        for (int i = 1 ; i <= a ; i++){
            for (int j = 1 ; j <= b ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
