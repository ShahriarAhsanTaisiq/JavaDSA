package Basics.String;

import java.util.Scanner;
public class ReverseStringWithStringBuilder {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        StringBuilder sb = new StringBuilder(str);

        // another
//        StringBuilder sb = new StringBuilder(input.nextLine());
//        sb.append(input.nextLine());

        //Reverse String
        for (int i =0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1- i; // for "hello"; front= 0 and back = 5-1-0 = 4

            //check the character
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // swap the char in string
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
