package GFGRegularProblem;

/* Paths to reach origin
* You are standing on a point (x, y) and you want to go to the origin (0, 0) by taking steps either left or down i.e. from each point you are allowed to move either in (x-1, y) or (x, y-1). Find the number of paths from point to origin.

Example 1:
Input:
x = 3, y = 0
Output:
1
Explanation: Path used was -  (3,0)  --> ( 2,0) --> (1,0) --> (0,0).We can see that there is no other path than this, so we return 1.
Example 2:
Input:
x = 3, y = 6
Output:
84
Explanation:
There are total 84 possible paths.
Your Task:
Since this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function ways() that takes integer x and y as parameters and returns the total number of paths from point(x,y) to the origin(0,0) % 1000000007.
Expected Time Complexity: O(x*y).
Expected Auxiliary Space: O(x*y).
Constraints:
0 ≤ x, y ≤ 500*/
class PathToOrigin {
    public int ways(int x, int y) {
        int mod = 1000000007;
        int[][] DP = new int[x + 1][y + 1];

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    DP[i][j] = 1;
                } else {
                    DP[i][j] = (DP[i - 1][j] + DP[i][j - 1]) % mod;
                }
            }
        }
        return DP[x][y];
    }
}
public class GFG_24April {
    public static void main(String[] args) {
        PathToOrigin solution = new PathToOrigin();

        int x1 = 3, y1 = 0;
        System.out.println("Example 1: " + solution.ways(x1, y1)); // Output: 1

        int x2 = 3, y2 = 6;
        System.out.println("Example 2: " + solution.ways(x2, y2)); // Output: 84
    }
}
