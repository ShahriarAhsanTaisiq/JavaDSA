package Basics;
import java.util.Scanner;
public class test{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        double ans = a*b/a-b;
        double ans2 = (a*b)/(a-b);
        System.out.println(ans);
        System.out.println(ans2);
    }
}