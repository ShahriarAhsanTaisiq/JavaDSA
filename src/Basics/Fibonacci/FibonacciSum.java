package Basics.Fibonacci;
// Fibonacci Sum
//Given a number positive number N, find value of f0 + f1 + f2 + . + fN where fi indicates ith Fibonacci number.
//        Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
//        Since the answer can be very large, answer modulo 1000000007 should be returned.
//
//        Example 1:
//        Input:
//        N = 3
//        Output:
//        4
//        Explanation:
//        0 + 1 + 1 + 2  = 4

import java.util.Scanner;

class FiboSum{
    int fibSum(int n){
        if(n<=0) return 0;
        int fibN2 = fib(n+2);
        return fibN2-1;
    }
    int fib(int n){
        int a=0, b=1;
        for (int i=2; i<=n; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }
}
public class FibonacciSum {
    public static void main(String[] args) {

        System.out.print("Enter the value of n for find series: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        FiboSum obj = new FiboSum();
        System.out.println("Fibonacci sum of "+ n + " is: "+ obj.fibSum(n));

    }
}
