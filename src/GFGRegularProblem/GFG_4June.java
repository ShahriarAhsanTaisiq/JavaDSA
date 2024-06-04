package GFGRegularProblem;
/*Binary representation of next number
* Given a binary representation in the form of a string(s) of a number n, the task is to find a binary representation of n+1.
Note: Output binary string should not contain leading zeros.
Example 1:
Input: s = "10"
Output: 11
Explanation: "10" is the binary representation of 2 and binary representation of 3 is "11"
Example 2:
Input: s = "111"
Output: 1000
Explanation: "111" is the binary representation of 7 and binary representation of 8 is "1000"
Your Task:
You don't need to read input or print anything. Complete the function binaryNextNumber()which takes s as input parameter and returns the string.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n) to store resultant string

Constraints:
1 <= n <= 105
* */
class BinaryRep {
    String binaryNextNumber(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                ans = "0" + ans;;
                if(i == 0) {
                    return "1" + ans;
                }
            } else {
                ans = s.substring(0, i) + "1" + ans;
                break;
            }
        }
        ans = ans.replaceAll("^[0]*", "");
        return ans;
    }
}
public class GFG_4June {
    public static void main(String[] args) {
        BinaryRep solution = new BinaryRep();

        // Test case 1
        String s1 = "10";
        String result1 = solution.binaryNextNumber(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1); // Expected: 11

        // Test case 2
        String s2 = "111";
        String result2 = solution.binaryNextNumber(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2); // Expected: 1000

        // Test case 3
        String s3 = "1";
        String result3 = solution.binaryNextNumber(s3);
        System.out.println("Input: " + s3);
        System.out.println("Output: " + result3); // Expected: 10
    }
}
