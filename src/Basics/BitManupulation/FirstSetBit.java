package Basics.BitManupulation;
// Find First set Bits
import java.util.Scanner;

class Solution{
    int getFirstSetBit(int n){
        int pos = 1;
        if(n==0) return 0;
        while(n>0){
            if((n&1)==1) return pos;
            n>>=1; //right shift
            pos++;
        }
        return pos;
    }
}
public class FirstSetBit {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        Solution obj = new Solution();
        System.out.println("First position of set bits is: "+ obj.getFirstSetBit(n));
    }
}
