package GFGRegularProblem;
import java.util.*;
/* K closest elements
* Given a sorted array of unique elements in increasing order, arr[] of n integers, and a value x. Find the K closest elements to x in arr[].
Keep the following points in mind:
If x is present in the array, then it need not be considered.
If two elements have the same difference as x, the greater element is prioritized.
If sufficient elements are not present on the right side, take elements from the left and vice versa.
Example 1:
Input:
n = 13
arr[] = {12, 16, 22, 30, 35, 39, 42,
         45, 48, 50, 53, 55, 56}
k = 4, x = 35
Output: 39 30 42 45
Explanation:
First closest element to 35 is 39.
Second closest element to 35 is 30.
Third closest element to 35 is 42.
And fourth closest element to 35 is 45.
Example 2:
Input:
n = 5
arr[] = {1, 2, 3, 6, 10}
k = 3, x = 4
Output: 3 6 2
Explanation:
First closest element is 3.
There are two elements 2 and 6 for which
the difference with 4 is same i.e. 2.
So first take greatest number 6
then the lower number 2.
Your Task:
You don't need to read input or print anything. Complete the function printKClosest() which takes arr[], n, k, and x as input parameters and returns an array of integers containing the K closest elements to x in arr[].
Expected Time Complexity: O(log n + k)
Expected Auxiliary Space: O(k)
Constraints:
1 ≤ n ≤ 105
1 ≤ k ≤ n
1 ≤ x ≤ 106
1 ≤ arr[i] ≤ 106
* */


// User function Template for Java

class KClosestElements {
    int binarySearch(int[] arr, int low, int high, int x) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    int[] printKClosest(int[] arr, int n, int k, int x) {
        int position = binarySearch(arr, 0, n - 1, x);
        int left = position - 1, right = position, i = 0;
        int[] res = new int[k];

        if(right < n && arr[right] == x)
            right++;

        while(k > 0 && left >= 0 && right < n) {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);

            if(leftDiff < rightDiff)
                res[i++] = arr[left--];

            else if(leftDiff > rightDiff)
                res[i++] = arr[right++];

            else {
                if(arr[right] > arr[left])
                    res[i++] = arr[right++];
                else
                    res[i++] = arr[left--];
            }

            k--;
        }

        while(k > 0 && left >= 0) {
            res[i++] = arr[left--];
            k--;
        }

        while(k > 0 && right < n) {
            res[i++] = arr[right++];
            k--;
        }

        return res;
    }
}
public class GFG_May21 {
    public static void main(String[] args) {
        KClosestElements sol = new KClosestElements();

        // Test Case 1
        int n1 = 13;
        int[] arr1 = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int k1 = 4;
        int x1 = 35;
        int[] result1 = sol.printKClosest(arr1, n1, k1, x1);
        System.out.println("Output for Test Case 1: " + Arrays.toString(result1));

        // Test Case 2
        int n2 = 5;
        int[] arr2 = {1, 2, 3, 6, 10};
        int k2 = 3;
        int x2 = 4;
        int[] result2 = sol.printKClosest(arr2, n2, k2, x2);
        System.out.println("Output for Test Case 2: " + Arrays.toString(result2));

        // Add more test cases if necessary
    }
}
