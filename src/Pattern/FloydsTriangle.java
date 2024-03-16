package Pattern;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a (row): ");
        int a = input.nextInt();
        int num =  1;
        for (int i =1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
