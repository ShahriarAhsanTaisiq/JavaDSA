package GFGRegularProblem;
/* Exit Point in a Matrix
* Given a matrix of size n x m with 0’s and 1’s, you enter the matrix at cell (0,0) in left to right direction. Whenever you encounter a 0 you retain it in the same direction, else if you encounter a 1 you have to change the direction to the right of the current direction and change that 1 value to 0, you have to find out from which index you will leave the matrix at the end.
Example 1:
Input:
n = 3, m = 3
matrix = {{0, 1, 0},
          {0, 1, 1},
          {0, 0, 0}}
Output:
{1, 0}
Explanation:
Enter the matrix at (0, 0)
-> then move towards (0, 1) ->  1 is encountered
-> turn right towards (1, 1)  -> again 1 is encountered
-> turn right again towards (1, 0)
-> now, the boundary of matrix will be crossed ->hence, exit point reached at 1, 0..
Example 2:
Input:
n = 1, m = 2
matrix = {{0, 0}}
Output:
{0, 1}
Explanation:
Enter the matrix at cell (0, 0).
Since the cell contains a 0, we continue moving in the same direction.
We reach cell (0, 1), which also contains a 0. So, we continue moving in the same direction, we exit the matrix from cell (0, 1).
Your Task:
You don't need to read or print anything. Your task is to complete the function FindExitPoint() which takes the matrix as an input parameter and returns a list containing the exit point.
Expected Time Complexity: O(n * m) where n = number of rows and m = number of columns.
Expected Space Complexity: O(1)
Constraints:
1 <= n, m <= 100
* */
class ExitPointOfMatrix {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;

        int i = 0, j = 0, di = 0, dj = 1;
        while(i>=0 && i<n && j>=0 && j<m){
            if(matrix[i][j]==1){
                matrix[i][j]=0;
                int temp=di;
                di=dj;
                dj=-temp;
            }
            result[0]=i;
            result[1]=j;
            i+=di;
            j+=dj;
        }
        return result;
    }
}
public class GFG_26April {
    public static void main(String[] args) {
        ExitPointOfMatrix solution = new ExitPointOfMatrix();

        // Example 1
        int n1 = 3, m1 = 3;
        int[][] matrix1 = {{0, 1, 0}, {0, 1, 1}, {0, 0, 0}};
        int[] exitPoint1 = solution.FindExitPoint(n1, m1, matrix1);
        System.out.println("Exit Point for Example 1: [" + exitPoint1[0] + ", " + exitPoint1[1] + "]");

        // Example 2
        int n2 = 1, m2 = 2;
        int[][] matrix2 = {{0, 0}};
        int[] exitPoint2 = solution.FindExitPoint(n2, m2, matrix2);
        System.out.println("Exit Point for Example 2: [" + exitPoint2[0] + ", " + exitPoint2[1] + "]");
    }
}
