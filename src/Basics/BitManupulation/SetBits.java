package Basics.BitManupulation;

public class SetBits { //replace 0 to 1
    public static void main (String [] args){
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber =  n | bitMask;
        System.out.println(newNumber);
    }
}
