package Pattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a (row): ");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}

