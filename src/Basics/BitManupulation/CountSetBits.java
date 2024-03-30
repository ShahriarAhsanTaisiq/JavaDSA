package Basics.BitManupulation;

import java.util.Scanner;

//Count number of set bits in an integer
class CountBits{
    int setBits(int num){
        int count = 0;
        while(num > 0){
            if((num & 1)!=0){
                count++;
            }
            num >>=1; // right shift the number by 1 bit.
        }
        return count;
    }
}
public class CountSetBits {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        CountBits obj = new CountBits();
        System.out.println("Number of set bits are: "+ obj.setBits(n));
    }
}
