package GFGRegularProblem;
/*Minimum Cost To Make Two Strings Identical
* Given two strings x and y, and two values costX and costY, the task is to find the minimum cost required to make the given two strings identical. You can delete characters from both the strings. The cost of deleting a character from string X is costX and from Y is costY. The cost of removing all characters from a string is the same.

Example 1:

Input: x = "abcd", y = "acdb", costX = 10
       costY = 20.
Output: 30
Explanation: For Making both strings
identical we have to delete character
'b' from both the string, hence cost
will be = 10 + 20 = 30.
Example 2:

Input : x = "ef", y = "gh", costX = 10
        costY = 20.
Output: 60
Explanation: For making both strings
identical, we have to delete 2-2
characters from both the strings, hence
cost will be = 10 + 10 + 20 + 20 = 60.
Your Task:
You don't need to read or print anything. Your task is to complete the function findMinCost() which takes both strings and the costs as input parameters and returns the minimum cost.

Expected Time Complexity: O(|x|*|y|)
Expected Space Complexity: O(|x|*|y|)

Constraints:
1 ≤ |x|, |y| ≤ 1000
1<= costX, costY <= 105
* */
class MinimumCostToMakeIdentical {
    public int findMinCost(String x, String y, int costX, int costY) {
        int m = x.length();
        int n = y.length();

        // DP array
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i * costX;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j * costY;
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + costX, dp[i][j - 1] + costY);
                }
            }
        }

        return dp[m][n];
    }
}
public class GFG_26May {
    public static void main(String[] args) {
        MinimumCostToMakeIdentical sol = new MinimumCostToMakeIdentical();

        // Test case 1
        String x1 = "abcd";
        String y1 = "acdb";
        int costX1 = 10;
        int costY1 = 20;
        System.out.println(sol.findMinCost(x1, y1, costX1, costY1)); // Expected output: 30

        // Test case 2
        String x2 = "ef";
        String y2 = "gh";
        int costX2 = 10;
        int costY2 = 20;
        System.out.println(sol.findMinCost(x2, y2, costX2, costY2)); // Expected output: 60
    }
}
