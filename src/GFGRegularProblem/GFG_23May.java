package GFGRegularProblem;
/*K-Palindrome
* Given a string str of length n, find if the string is K-Palindrome or not. A k-palindrome string transforms into a palindrome on removing at most k characters from it.
Example 1:
Input: str = "abcdecba"
n = 8, k = 1
Output: 1
Explaination: By removing 'd' or 'e'
we can make it a palindrome.
Example 2:
Input: str = "abcdefcba"
n = 9, k = 1
Output: 0
Explaination: By removing a single
character we cannot make it a palindrome.
Your Task:
You do not need to read input or print anything. Your task is to complete the function kPalindrome() which takes string str, n, and k as input parameters and returns 1 if str is a K-palindrome else returns 0.
Expected Time Complexity: O(n*n)
Expected Auxiliary Space: O(n*n)
Constraints:
1 ≤ n, k ≤ 103
* */

import java.util.*;

class KPalindrome {
    private int findAns(int s, int e , String str,int dp[][]){
        if(s>=e)return 0;
        if(dp[s][e]!=-1)return dp[s][e];

        if(str.charAt(s)==str.charAt(e))
            return dp[s][e]= findAns(s+1,e-1,str,dp);
        else
            return dp[s][e]= 1+Math.min( findAns(s+1,e,str,dp) , findAns(s,e-1,str,dp));

    }
    public int kPalindrome(String str, int n, int k) {
        int dp[][] = new int[n][n];
        for(int i[]: dp) Arrays.fill(i,-1);
        return findAns(0,str.length()-1,str,dp)>k?0:1;

    }
}
public class GFG_23May {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String str = scanner.nextLine();

        KPalindrome solution = new KPalindrome();
        int result = solution.kPalindrome(str, n, k);
        System.out.println(result);

        scanner.close();
    }

}
