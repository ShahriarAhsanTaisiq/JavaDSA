package Basics.BitManupulation;

import java.util.Scanner;

public class BitWiseOddEven {
    public static void main (String [] args){
//        int [] arr = {3,6,5,23,20,1,2};
//        int n=7;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int [] arr =  new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i< n; i++){
            arr[i]=input.nextInt();
        }

        // Bit wise odd even
        for (int i=0; i<n; i++){
            if ((arr[i] & 1) == 0){
                System.out.println(arr[i] + " is even number.");
            }
            else
                System.out.println(arr[i] + " is odd number.");
        }

    }
}
