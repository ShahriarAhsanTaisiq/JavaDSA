package GFGRegularProblem;
/*Remaining String
* Given a string s without spaces, a character ch and an integer count. Your task is to return the substring that remains after the character ch has appeared count number of times.
Note:  Assume upper case and lower case alphabets are different. “”(Empty string) should be returned if it is not possible, or the remaining substring is empty.

Examples:

Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng
Explanation: The remaining substring of s after the 3rd
occurrence of 'i' is "ng", hence the output is ng.
Input: s = "Thisisdemostri", ch = 'i', count = 3
Output: ""
Explanation: The 3rd occurence of 'i' is at the last index. In this case the remaining substring is empty, hence we return empty string.
Input: s = "abcd", ch = 'x', count = 2
Output: ""
Explanation: The character x is not present in the string, hence we return empty string.
Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(1)

Constraints:
1<= s.length()<=105
1<=count<=s.length()
s[i] is both upper case and lower case
* */

class RemainStr{
    public String printString(String s, char ch, int count){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                count--;
            }
            if (count == 0 && i < s.length()-1){
                return s.substring(i+1);
            }
        }
        return "";
    }
}
public class RemainingString {
    public static void main(String[] args) {
        RemainStr remainStr = new RemainStr();

        // Test case 1
        String s1 = "Thisisdemostring";
        char ch1 = 'i';
        int count1 = 3;
        System.out.println("Test case 1: " + remainStr.printString(s1, ch1, count1)); // Output: "ng"

        // Test case 2
        String s2 = "Thisisdemostri";
        char ch2 = 'i';
        int count2 = 3;
        System.out.println("Test case 2: " + remainStr.printString(s2, ch2, count2)); // Output: ""

        // Test case 3
        String s3 = "abcd";
        char ch3 = 'x';
        int count3 = 2;
        System.out.println("Test case 3: " + remainStr.printString(s3, ch3, count3)); // Output: ""

        // Additional test cases
        // Test case 4
        String s4 = "hellohellohello";
        char ch4 = 'o';
        int count4 = 2;
        System.out.println("Test case 4: " + remainStr.printString(s4, ch4, count4)); // Output: "hellohello"

        // Test case 5
        String s5 = "abcabcabc";
        char ch5 = 'b';
        int count5 = 3;
        System.out.println("Test case 5: " + remainStr.printString(s5, ch5, count5)); // Output: "c"

        // Test case 6
        String s6 = "xyzxyzxyz";
        char ch6 = 'y';
        int count6 = 5;
        System.out.println("Test case 6: " + remainStr.printString(s6, ch6, count6)); // Output: ""
    }
}
