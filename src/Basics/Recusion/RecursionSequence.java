package Basics.Recusion;

public class RecursionSequence {
    public static void main (String [] args){
        int n=5, k=1;
        long ans=0;
        long mod = 1000000007;
        for(int i=1; i<=n; i++){
            long sum = 1;
            for (int j=1; j<=i; j++){
                sum = (sum*k)%mod;
                //System.out.println("Sum value is: " + sum);
                k++;
                //System.out.println("Value of k: "+ k);
            }
            ans= (ans+sum)%mod;
        }
        System.out.println(ans);
    }
}
