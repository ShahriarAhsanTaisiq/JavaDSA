package GFGRegularProblem;

/*Kadane's Algorithm
* Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.

Examples:
Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
Input: arr[] = [-1, -2, -3, -4]
Output: -1
Explanation: Max subarray sum is -1 of element (-1)
Input: arr[] = [5, 4, 7]
Output: 16
Explanation: Max subarray sum is 16 of element (5, 4, 7)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
-107 ≤ arr[i] ≤ 107
1 ≤ arr.length ≤ 106
* */

class MaximumSubarraySum{
    long maxSubarraySum(int[] arr) {
        int result = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > result){
                result = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return result;
    }
}
public class KadanesAlgorithm {
    public static void main(String[] args) {
        MaximumSubarraySum maximumSubarraySum = new MaximumSubarraySum();

        int[] arr1 = {1, 2, 3, -2, 5};
        System.out.println("Maximum subarray sum is: " + maximumSubarraySum.maxSubarraySum(arr1));

        int[] arr2 = {-1, -2, -3, -4};
        System.out.println("Maximum subarray sum is: " + maximumSubarraySum.maxSubarraySum(arr2));

        int[] arr3 = {5, 4, 7};
        System.out.println("Maximum subarray sum is: " + maximumSubarraySum.maxSubarraySum(arr3));

        int[] arr4 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maximumSubarraySum.maxSubarraySum(arr4));
    }
}
