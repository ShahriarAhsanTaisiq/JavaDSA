package Basics.Recusion;

// Print sum of first n natural numbers
public class SumOfNaturalNumbers {

    public static void printSum(int i,int n, int sum){

        if (n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1,n,sum);
    }
    public static void main (String [] args){
        int i=1,n=10, sum=0;
        printSum(i,n,sum);
    }
}
