package Basics.Recursion;

// Print x^n (Stack height = n)
class PowerCal{
    int calculatePow(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int xPownM1=calculatePow(x,n-1);
        int xPow = x*xPownM1;
        return xPow;
    }
}

// Print x^n (Stack height = log n)
class PowOfXn{
    int calPow(int x, int n){
        if (n==0) return 1;
        if (x==0) return 0;
        if(n%2==0)
            return calPow(x,n/2)*calPow(x,n/2);
        else
            return calPow(x,n/2)*calPow(x,n/2)*x;
    }
}
public class PowerCalculation {
    public static void main(String [] args) {
        PowerCal obj = new PowerCal();
        int x = 5, n = 3;
        System.out.println("Power of " +x+" over "+n+ " is (n): " +obj.calculatePow(x,n));

        PowOfXn obj2 = new PowOfXn();
        System.out.println("Power of " +x+" over "+n+ " is (log(n)): " +obj2.calPow(x,n));
    }
}
