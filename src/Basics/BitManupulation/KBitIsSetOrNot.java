package Basics.BitManupulation;

import java.util.Scanner;
class CheckKBits{
    boolean checkBits(int n, int k){
        int bitMask = 1<<k; // left shift by k position
        return (bitMask & n)!=0;
    }
}
public class KBitIsSetOrNot {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of k th position: ");
        int k = input.nextInt();

        CheckKBits obj = new CheckKBits();
        System.out.println("Number of set bits are: "+ obj.checkBits(n,k));
    }
}
