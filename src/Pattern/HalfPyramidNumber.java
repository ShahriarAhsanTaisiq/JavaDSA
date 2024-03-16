package Pattern;

import java.util.Scanner;

public class HalfPyramidNumber {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a (row): ");
        int a =  input.nextInt();
        for(int i=1; i<=a; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
