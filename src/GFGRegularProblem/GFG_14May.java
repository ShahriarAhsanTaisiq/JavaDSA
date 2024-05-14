package GFGRegularProblem;

import java.util.*;

/*Path With Minimum Effort
* You are a hiker preparing for an upcoming hike. You are given heights[][], a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find the route with minimum effort.

Note: A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
Example 1:
Input:
row = 3
columns = 3
heights = [[1,2,2],[3,8,2],[5,3,5]]
Output:
2
Explaination:
The route 1->3->5->3->5 has a maximum absolute difference of 2 in consecutive cells. This is better than the route 1->2->2->2->5, where the maximum absolute difference is 3.
Example 2:
Input:
row = 2
columns = 2
heights = [[7,7],[7,7]]
Output:
0
Explaination:
Any route from the top-left cell to the bottom-right cell has a maximum absolute difference of 0 in consecutive cells.
Your Task:
You don't need to read input or print anything. Your task is to complete the function MinimumEffort() which takes intergers rows, columns, and the 2D array heights[][]  and returns the minimum effort required to travel from the top-left cell to the bottom-right cell.
Expected Time Complexity: O(rowsxcolumns)
Expected Space Complexity: O(rowsxcolumns)

Constraints:
1 <= rows, columns <= 100
rows == heights.length
columns == heights[i].length
0 <= heights[i][j] <= 106
* */
class PathWithMinEffort {
    static class Cell {
        int row, col, effort;

        Cell(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
    }

    public  int MinimumEffort(int rows, int columns, int[][] heights) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] effort = new int[rows][columns];
        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.effort));

        pq.offer(new Cell(0, 0, 0));
        effort[0][0] = 0;

        while (!pq.isEmpty()) {
            Cell current = pq.poll();

            if (current.row == rows - 1 && current.col == columns - 1) {
                return current.effort;
            }

            for (int[] dir : directions) {
                int newRow = current.row + dir[0];
                int newCol = current.col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                    int newEffort = Math.max(current.effort, Math.abs(heights[newRow][newCol] - heights[current.row][current.col]));

                    if (newEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = newEffort;
                        pq.offer(new Cell(newRow, newCol, newEffort));
                    }
                }
            }
        }

        return 0;  // In case we never reach the bottom-right cell, though guaranteed by problem constraints.
    }
}

public class GFG_14May {
    public static void main(String[] args) {
        PathWithMinEffort ob = new PathWithMinEffort();
        int rows1 = 3;
        int columns1 = 3;
        int[][] heights1 = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(ob.MinimumEffort(rows1, columns1, heights1));  // Output: 2

        int rows2 = 2;
        int columns2 = 2;
        int[][] heights2 = {{7, 7}, {7, 7}};
        System.out.println(ob.MinimumEffort(rows2, columns2, heights2));  // Output: 0
    }
}
