package Basics.BitManupulation;

import java.util.Scanner;

public class UpdateBits {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operation 1 for Set and  0 for Clear: ");
        int operation = input.nextInt();

        int n = 5;
        int pos = 1;
        int bitMask =  1 << pos;

        if (operation == 1){
            // in case of update 0 to 1 (Set Operation)
            int newNumber = n | bitMask;
            System.out.println(newNumber);
        }
        else {
            // in case of update 1 to 0 (Clear Operation)
            int newNumber = ~bitMask & n;
            System.out.println(newNumber);
        }

    }
}
