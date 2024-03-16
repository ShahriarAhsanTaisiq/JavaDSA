package Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int a = 0, sum = 1;
        System.out.print(a + " ");

        if (n>1){
            for (int i=2; i<=n; i++){
                System.out.print( sum + " ");

                int temp = sum;
                sum = a + sum;
                a = temp;

            }
            System.out.println();
        }
    }
}
