package Pattern;

import java.util.Scanner;

public class J_0_1Triangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a (row) : ");
        int a = input.nextInt();

        for (int i =1; i<=a; i++){
            for (int j=1;j<=i; j++){
                if((i+j)%2 == 0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }

    }
}
