package GFGRegularProblem;

/* Geek and its Game of Coins
* Given three numbers n, x, and y, Geek and his friend are playing a coin game. In the beginning, there are n coins. In each move, a player can pick x, y, or 1 coin. Geek always starts the game. The player who picks the last coin wins the game. The task is to determine whether Geek will win the game or not if both players play optimally.
Example 1:
Input:
n = 5
x = 3
y = 4
Output:
1
Explanation:
There are 5 coins, every player can pick 1 or 3 or 4 coins on his/her turn. Geek can win by picking 3 coins in first chance. Now 2 coins will be left so his friend will pick one coin and now Geek can win by picking the last coin.
Example 2:
Input:
n = 2
x = 3
y = 4
Output:
0
Explanation:
Geek picks 1 coin and then his friend picks 1 coin.
Your Task:
You don't need to read input or print anything. Complete the function findWinner() which takes n, x, and y as input parameters and returns 1 if Geek can win otherwise 0.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
Constraints:
1 ≤ n, x, y ≤ 105

* */
class GeekAndGameOfCoin {
    public static int findWinner(int n, int x, int y) {
        // Array to store if the position with i coins is winning (1) or losing (0)
        int[] dp = new int[n + 1];

        // Base case: If there are no coins left, it's a losing position
        dp[0] = 0;

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            // Check if any of the moves leave the opponent in a losing position
            if (i - 1 >= 0 && dp[i - 1] == 0) {
                dp[i] = 1;
            } else if (i - x >= 0 && dp[i - x] == 0) {
                dp[i] = 1;
            } else if (i - y >= 0 && dp[i - y] == 0) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }

        // The result is whether n coins is a winning position
        return dp[n];
    }
}
public class GFG_29May {
    public static void main(String[] args) {
        int n1 = 5, x1 = 3, y1 = 4;
        System.out.println("Test Case 1: " + GeekAndGameOfCoin.findWinner(n1, x1, y1)); // Expected output: 1

        int n2 = 2, x2 = 3, y2 = 4;
        System.out.println("Test Case 2: " + GeekAndGameOfCoin.findWinner(n2, x2, y2)); // Expected output: 0

        int n3 = 7, x3 = 2, y3 = 3;
        System.out.println("Test Case 3: " + GeekAndGameOfCoin.findWinner(n3, x3, y3)); // Expected output: 1

        int n4 = 10, x4 = 4, y4 = 6;
        System.out.println("Test Case 4: " + GeekAndGameOfCoin.findWinner(n4, x4, y4)); // Expected output: 1
    }
}
