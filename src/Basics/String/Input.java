package Basics.String;

import java.util.Scanner;

public class Input {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
//        String name = input.nextLine(); //for line a word input
        String name = input.nextLine(); //for line input.
        System.out.println(name);
    }
}
