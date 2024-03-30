package Basics.Recursion.MidLevel;

// Find the first and last occurrence of an elements in a string

class CharOccurrence{
    static int first = -1;
    static int last = -1;
    void findOccurrence(String str, int indx, char element){
        if (indx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(indx);
        if(current==element){
            if (first==-1){
                first = indx;
            }
            else{
                last=indx;
            }
        }
        findOccurrence(str,indx+1,element);
    }
}
public class CharOccurrenceInString {
    public static void main(String [] args){
        String str = "fabcdgsaadfgafe";
        CharOccurrence obj = new CharOccurrence();
        obj.findOccurrence(str,0,'a');

    }
}
