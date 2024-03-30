package Basics.Fibonacci;
// N th fibonacci number
/*Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.
Note: for the reference of this question take first fibonacci number to be 1.

Example 1:
Input:
n = 2
Output:
1
Explanation:
1 is the 2nd number of fibonacci series.
Example 2:

Input:
n = 5
Output:
5
Explanation:
5 is the 5th number of fibonacci series.*/
import java.util.Scanner;

class Solution{
    int nthFib(int n){
        int [] fib = new int[n+1];
        fib[0]=0;
        fib[1]=1;

        for (int i=2; i<=n; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
public class NthFibonacciSeries {
    public static void main (String [] args){
        System.out.println("Enter the value of n for find series: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Solution obj = new Solution();
        System.out.println(n+" th fibonacci number is: "+ obj.nthFib(n));

    }
}
