package Basics.String;

import java.util.Scanner;

public class DeleteString {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email address: ");
        String email = input.next();
        String username = "";

        for (int i = 0; i<email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }
            else
                username += email.charAt(i);
        }
        System.out.println("User name is: " +username);
    }
}
