package DS.Arrays;

public class BasicSyntax {
    public static void main (String[] args) {

        // dataType [] arrayName = new dataType [ size ] ; or
        // dataType arrayName [] = new dataType [ size ] ;
//        int [] marks = new int[5]; //correct
         // int marks [] = new int[5]; //correct
        int marks [] = {5,4,7,2,8}; //correct

        for (int i = 0; i <= marks.length-1 ; i++)
            System.out.print(marks[i] + " ");
    }

}
