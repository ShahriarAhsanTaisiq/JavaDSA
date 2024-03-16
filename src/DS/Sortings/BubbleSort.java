package DS.Sortings;

import java.util.Scanner;

public class BubbleSort {
    // time complexity O(n^2)

    //display the sorted list.
    public static void printArray(int arr[]){
        System.out.println("Sorted list with bubble sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int [] arr =  new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i< n; i++){
            arr[i] =  input.nextInt();
        }

        // bubble sort
        for (int i=0; i< arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){

                if (arr[j] > arr[j+1]){
                    //swap the array elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //call the print function
        printArray(arr);
    }
}
