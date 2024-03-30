package Basics.Recursion;

public class Factorial {
    public static int calculateFactorial(int n){
        if(n==0 || n==1)
            return 1;
        return n * calculateFactorial(n-1);
    }
    public static void main(String [] args){
        int n=5;
        System.out.println("Factorial of "+n+" is: "+calculateFactorial(n));
    }
}
