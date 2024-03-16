package Basics.BitManupulation;

public class Bits {
    public static void main (String [] args){
        int n = 5; // 0101
        int pos = 2;
        int bitMask =  1<<pos;

        if ((bitMask & n) == 1){
            System.out.println("Bit was 1");
        }
        else {
            System.out.println("Bit was 0");
        }
    }
}
