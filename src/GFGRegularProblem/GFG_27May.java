package GFGRegularProblem;
/*Longest subsequence-1

*Given an integer array a[] of size n, find the length of the longest subsequence such that the absolute difference between adjacent elements is 1.

Example 1:

Input:
n = 7
a[] = {10, 9, 4, 5, 4, 8, 6}
Output:
3
Explaination:
The three possible subsequences of length 3 are {10, 9, 8}, {4, 5, 4}, and {4, 5, 6}, where adjacent elements have a absolute difference of 1. No valid subsequence of greater length could be formed.
Example 2:

Input:
n = 5
a[] = {1, 2, 3, 4, 5}
Output:
5
Explaination:
All the elements can be included in the valid subsequence.
Your Task:
You do not need to read input. Your task is to complete the function longestSubseq() which takes integer n and array a[] as input parameters and returns the length of the longest subsequence where the absolute difference of adjacent elements is 1.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 103
1 ≤ a[i] ≤ 103
* */




class LongestSubsequence {
    public static int longestSubseq(int n, int[] a) {
        // code here
        int dp[]= new int[n];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(a[i]-a[j])==1){

                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans=0;
        for(int u=0;u<n;u++){
            if(dp[u]>ans)ans=dp[u];
        }
        return ans+1;
    }
}
public class GFG_27May {
    public static void main(String[] args) {
        LongestSubsequence solution = new LongestSubsequence();

        // Test case 1
        int[] a1 = {10, 9, 4, 5, 4, 8, 6};
        int n1 = a1.length;
        System.out.println("Test Case 1: " + solution.longestSubseq(n1, a1)); // Expected output: 3

        // Test case 2
        int[] a2 = {1, 2, 3, 4, 5};
        int n2 = a2.length;
        System.out.println("Test Case 2: " + solution.longestSubseq(n2, a2)); // Expected output: 5

        // Test case 3
        int[] a3 = {1, 3, 5, 7, 9};
        int n3 = a3.length;
        System.out.println("Test Case 3: " + solution.longestSubseq(n3, a3)); // Expected output: 1
    }
}
