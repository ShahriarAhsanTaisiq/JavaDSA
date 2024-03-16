package DS.Sortings;

import java.util.Scanner;

public class InsertionSort {

    // time complexity O(n^2)
    //display the sorted list.
    public static void printArray(int arr[]){
        System.out.println("Sorted list with insertion sort: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
    }
    public static void main (String [] args){

       // int[] arr = {7,9,6,4,5,2,1};

        Scanner inputS = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = inputS.nextInt();

        int [] arr =  new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i< n; i++){
            arr[i] =  inputS.nextInt();
        }
        // insertion sort
        for (int i=1; i<arr.length; i++){
          int current = arr[i];
          int j = i-1;
          while(j>=0 && current < arr[j]){
              arr[j+1] = arr[j];
              j--;
          }
          //placement
            arr[j+1] = current;
        }

        printArray(arr);
    }
}
