package Basics.String;

import java.util.Scanner;

public class CumalativeLength {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int totalLength = 0;

        String [] arr = new String[size];

        for (int i = 0 ; i< size; i++){
            System.out.println("Enter elements of " + (i+1) + " index");
            arr [i] = input.next();
            totalLength += arr[i].length();
        }
        System.out.println("Length of the array string: " + totalLength);

    }
}
