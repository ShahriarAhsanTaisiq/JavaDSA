package GFGRegularProblem;
/*Minimum cost to fill given weight in a bag
* Given an array cost[] of positive integers of size n and an integer w, where cost[i] represents the cost of an i kg packet of oranges, the task is to find the minimum cost to buy exactly w kg of oranges. The cost array has a 1-based indexing. If buying exactly w kg of oranges is impossible, then return -1.
Note:
1. cost[i] = -1 means that i kg packet of orange is unavailable.
2. It may be assumed that there is an infinite supply of all available packet types.
Example 1:
Input:
n = 5
cost[] = {20, 10, 4, 50, 100}
w = 5
Output:
14
Explanation:
Purchase the 2kg packet for 10 coins and the 3kg packet for 4 coins to buy 5kg of oranges for 14 coins.
Example 2:
Input:
n = 5
cost[] = {-1, -1, 4, 3, -1}
w = 5
Output:
-1
Explanation:
It is not possible to buy 5 kgs of oranges.
Your Task:
You don't need to read input or print anything. Complete the function minimumCost() which takes integers n and w, and integer array cost[] as input parameters and returns the minimum cost to buy exactly w kg of oranges, If buying exactly w kg of oranges is impossible, then return -1.
Expected Time Complexity: O(n*w)
Expected Auxiliary Space: O(n*w)
Constraints:
1 ≤ n, w ≤ 2*102
1 ≤ cost[i] ≤ 105
cost[i] ≠ 0
* */
class MinCostToFillWeight {
    public static int minimumCost(int n, int w, int[] cost) {
        int[] dp = new int[w + 1];

        // Initialize dp array
        for (int i = 1; i <= w; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        // Fill dp array
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i && cost[j - 1] != -1 && dp[i - j] != Integer.MAX_VALUE) {
                    dp[i] = Math.max(0, Math.min(dp[i], dp[i - j] + cost[j - 1]));
                }
            }
        }

        // Return the answer
        return dp[w] == Integer.MAX_VALUE ? -1 : dp[w];
    }
}
public class GFG_28May {
    public static void main(String[] args) {
        MinCostToFillWeight solution = new MinCostToFillWeight();

        // Test case 1
        int[] cost1 = {20, 10, 4, 50, 100};
        int w1 = 5;
        System.out.println("Test Case 1: " + solution.minimumCost(5, w1, cost1));  // Expected output: 14

        // Test case 2
        int[] cost2 = {-1, -1, 4, 3, -1};
        int w2 = 5;
        System.out.println("Test Case 2: " + solution.minimumCost(5, w2, cost2));  // Expected output: -1
    }
}
