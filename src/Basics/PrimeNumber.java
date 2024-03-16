package Basics;

import java.util.Scanner;

public class PrimeNumber {
    //function for checking the prime number
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i =2; i<=Math.sqrt(n); i++){

            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for check is the number prime: ");
        int num = input.nextInt();
        //call the isPrime function
        if(isPrime(num))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }

}
