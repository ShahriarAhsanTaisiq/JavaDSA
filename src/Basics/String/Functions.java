package Basics.String;

public class Functions {
    public static void main (String [] args){

        //concatenation
        String firstName = "Shahriar Ahsan";
        String lastName = " Taisiq";

        String fullName = firstName + lastName;
        System.out.println(fullName);

        //length
        System.out.println(fullName.length());

        // charAt()
        for (int i = 0; i< fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");;
        }
        System.out.println();

        //compareTo()
        String s1 = "Taisiq";
        String s2 = "Taisiq";

        if (s1.compareTo(s2) == 0){
            // comapareTo() return three value
            // s1 > s2 => +ve value
            // s1 == s2 => 0
            // s1< s2 => -ve value
            System.out.println("Same String..");
        }
        else
            System.out.println("Not same..");


        //substring(beginIndex, endingIndex)

        String subStr = fullName.substring(15);
        System.out.println("Substring from fullname "+subStr);


        //parseInt
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        //ToString
        int n = 12345;
        String str2 = Integer.toString(n);
        System.out.println(str2);

    }
}
