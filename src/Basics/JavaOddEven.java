package Basics;

import java.util.Scanner;

public class JavaOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        if (a%2==0)
            System.out.println(a+" is an Even number");
        else
            System.out.println(a+ " is a odd number");
    }
}
