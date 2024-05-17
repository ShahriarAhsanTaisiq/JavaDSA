package GFGRegularProblem;
/*Find Pair Given Difference

* Given an array arr[] of size n and an integer x, return 1 if there exists a pair of elements in the array whose absolute difference is x, otherwise, return -1.
Example 1:
Input:
n = 6
x = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output:
1
Explanation:
Pair (2, 80) have absolute difference of 78.
Example 2:
Input:
n = 5
x = 45
arr[] = {90, 70, 20, 80, 50}
Output:
-1
Explanation:
There is no pair with absolute difference of 45.
Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes integers n, x, and an array arr[] as input parameters and returns 1 if the required pair exists, return -1 otherwise.
Expected Time Complexity: O(n* Log(n)).
Expected Auxiliary Space: O(1).

Constraints:
1<=n<=106
1<=arr[i]<=106
0<=x<=105
* */

import java.util.*;

class FindPairsOfGivenDifference {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i =0;
        int j = 1;
        while(j < n && i < n){
            if(arr[j]-arr[i] == x && i != j)return 1;
            else if(arr[j]-arr[i] < x)j++;
            else {
                i++;
            }
        }
        return -1;
    }
}
public class GFG_17May {
    public static void main(String[] args) {
        FindPairsOfGivenDifference solution = new FindPairsOfGivenDifference();

        // Test Case 1
        int n1 = 6;
        int x1 = 78;
        int[] arr1 = {5, 20, 3, 2, 5, 80};
        System.out.println(solution.findPair(n1, x1, arr1)); // Expected output: 1

        // Test Case 2
        int n2 = 5;
        int x2 = 45;
        int[] arr2 = {90, 70, 20, 80, 50};
        System.out.println(solution.findPair(n2, x2, arr2)); // Expected output: -1

        // Additional Test Case 3
        int n3 = 5;
        int x3 = 10;
        int[] arr3 = {1, 8, 30, 40, 100};
        System.out.println(solution.findPair(n3, x3, arr3)); // Expected output: 1

        // Additional Test Case 4
        int n4 = 4;
        int x4 = 0;
        int[] arr4 = {10, 10, 10, 10};
        System.out.println(solution.findPair(n4, x4, arr4)); // Expected output: 1

        // Additional Test Case 5
        int n5 = 4;
        int x5 = 1;
        int[] arr5 = {1, 2, 3, 4};
        System.out.println(solution.findPair(n5, x5, arr5)); // Expected output: 1

        // Edge Case Test
        int n6 = 2;
        int x6 = 100000;
        int[] arr6 = {1, 100001};
        System.out.println(solution.findPair(n6, x6, arr6)); // Expected output: 1

        // Edge Case with large input values
        int n7 = 3;
        int x7 = 100000;
        int[] arr7 = {1, 100000, 100001};
        System.out.println(solution.findPair(n7, x7, arr7)); // Expected output: 1
    }
}
