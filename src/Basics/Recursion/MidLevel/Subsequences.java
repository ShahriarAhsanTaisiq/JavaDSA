package Basics.Recursion.MidLevel;

// print all subsequence from a string
class Solution{
    void printSubsequences(String str, int indx, String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(indx);
        //to be subsequences
        printSubsequences(str,indx+1,newString+currentChar);

        // not to be
        printSubsequences(str, indx+1, newString);

    }
}
public class Subsequences {
    public static void main (String [] args){
        Solution obj = new Solution();
        obj.printSubsequences("abc",0," ");

    }
}
