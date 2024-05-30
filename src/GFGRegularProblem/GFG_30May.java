package GFGRegularProblem;
/*String Subsequence

* Given two strings, s1 and s2, count the number of subsequences of string s1 equal to string s2.
Return the total count modulo 1e9+7.
Example 1:
Input: s1 = geeksforgeeks, s2 = gks
Output: 4
Explaination: We can pick characters from s1 as a subsequence from indices {0,3,4}, {0,3,12}, {0,11,12} and {8,11,12}.So total 4 subsequences of s1 that are equal to s2.
Example 2:
Input: s1 = problemoftheday, s2 = geek
Output: 0
Explaination: No subsequence of string s1 is equal to string s2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function countWays() which takes the string s1 and s2 as input parameters and returns the number of subsequences of s1 equal to s2.
Expected Time Complexity: O(n*m)  [n and m are lengths of the strings s1 and s2]
Expected Auxiliary Space: O(n*m)     [n and m are lengths of the strings s1 and s2]
Constraints:
1 ≤ n, m ≤ 500  [n and m are lengths of the strings s1 and s2]
* */
class StringSubsequence {
    private static final int MOD = 1000000007;

    public static int countWays(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j] % MOD;
                }
            }
        }

        return dp[n][m];
    }
}
public class GFG_30May {
    public static void main(String[] args) {
        // Example 1
        String s1_1 = "geeksforgeeks";
        String s2_1 = "gks";
        System.out.println("Test Case 1: " + StringSubsequence.countWays(s1_1, s2_1)); // Expected output: 4

        // Example 2
        String s1_2 = "problemoftheday";
        String s2_2 = "geek";
        System.out.println("Test Case 2: " + StringSubsequence.countWays(s1_2, s2_2)); // Expected output: 0

        // Additional test cases
        String s1_3 = "abcabc";
        String s2_3 = "abc";
        System.out.println("Test Case 3: " + StringSubsequence.countWays(s1_3, s2_3)); // Expected output: 7
    }
}
