package Basics.Recursion.MidLevel;

import java.util.HashSet;

//print all the Unique subsequences of a string "aaaa"
class UniqueSub{
    void printSubsequences(String str, int indx, String newString, HashSet<String> set){
        if(indx==str.length()){
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currentChar = str.charAt(indx);
        //to be subsequences
        printSubsequences(str,indx+1,newString+currentChar,set);

        // not to be
        printSubsequences(str, indx+1, newString,set);

    }
}
public class UniqueSubseq {
    public static void main(String[] args) {
        UniqueSub obj = new UniqueSub();
        HashSet<String> set = new HashSet<>();
        obj.printSubsequences("aaaa",0,"",set);

    }
}
