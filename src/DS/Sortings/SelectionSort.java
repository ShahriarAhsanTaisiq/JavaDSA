package DS.Sortings;

import java.util.Scanner;

public class SelectionSort {

    // time complexity O(n^2)

    //display the sorted list.
    public static void printArray(int arr[]){
        System.out.println("Sorted list with selection sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String [] args){

//        int[] arr = {7,9,6,4,5,2,1};

        Scanner inputS = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = inputS.nextInt();

        int [] arr =  new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i< n; i++){
            arr[i] =  inputS.nextInt();
        }

        //selection sort
        for (int i=0; i<arr.length; i++){
            int min = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            //swapping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
     printArray(arr);
    }
}
