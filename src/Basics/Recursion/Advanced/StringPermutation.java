package Basics.Recursion.Advanced;

//Print all permutation of a String

class Permutation{
    void printPerm(String str,String permutation){
        if(str.isEmpty()){
            System.out.print(permutation+ ", ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,permutation+currChar);
        }
    }
}
public class StringPermutation {
    public static void main(String [] args){
        String str = "abc";
        Permutation obj = new Permutation();
        obj.printPerm(str,"");
    }
}
