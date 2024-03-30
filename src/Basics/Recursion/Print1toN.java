package Basics.Recursion;

// Print 1 to n
public class Print1toN {
    //print 1 to 10 with recursion
    public static void printNum(int n){
        if (n==11)
            return;
        System.out.print(n + " ");
        printNum(n+1);
    }
    public static void main (String [] args){
        int n= 1;
        printNum(n);
    }
}
