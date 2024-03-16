package DS.Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of arrays: ");
        int size = input.nextInt();

        // intialization of array
        int[] marks = new int [size];

        //take the input into the array
        for (int i = 0; i < size; i++){
            System.out.println("Enter the value of "+ (i+1) + " no elements: ");
            marks[i] = input.nextInt();
        }
        //shows the array elements
        for (int i=0; i<size; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
