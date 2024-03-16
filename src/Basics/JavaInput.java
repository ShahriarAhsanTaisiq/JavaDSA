package Basics;

import java.util.Scanner;
public class JavaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String name = input.next(); // only take input for the first token
        /* int -> nextInt()
        * float -> nextFloat()
        * double -> nextDouble()
        */
        String name = input.nextLine(); // take input for a line

        System.out.println("User Name is : " + name);
    }
}