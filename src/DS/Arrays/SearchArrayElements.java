package DS.Arrays;

import java.util.Scanner;

public class SearchArrayElements {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int [] num = new int[size];

        //take the input for the array
        for (int i=0; i<size; i++){
            System.out.println("Enter the " + (i+1) + "th element of array: ");
            num[i] = input.nextInt();
        }

        System.out.println("Enter the search element: ");
        int target = input.nextInt();

        boolean found = false; // Flag to indicate if the target is found

        for (int i=0; i<num.length; i++){
            // Linear Search
            if (num[i] == target){
                System.out.println(target + " found at index "+ i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the array.");
        }
    }
}
