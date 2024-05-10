package GFGRegularProblem;

import java.util.*;

/*Combination Sum II
* Given an array of integers arr, the length of the array n, and an integer k, find all the unique combinations in arr where the sum of the combination is equal to k. Each number can only be used once in a combination.
Example 1:
Input:
n = 5, k = 7
arr[] = { 1, 2, 3, 3, 5 }
Output:
{ { 1, 3, 3 }, { 2, 5 } }
Explanation:
1 + 3 + 3 = 7
2 + 5 = 7
Example 2:
Input:
n = 6, k = 35
arr[] = { 5, 10, 15, 20, 25, 30 }
Output:
{ { 5,10, 20 }, { 5, 30 }, { 10, 25 }, { 15, 20 } }
Explanation:
5 + 10 + 20 = 35
5 + 30 = 35
10 + 25 = 35
15 + 20 = 35
Your Task:
You don't need to read input or print anything. Your task is to complete the function CombinationSum2() which takes arr[],n, and k as input parameters and returns all the unique combinations.
Constraints:
1 <= n <= 100
1 <= arr[i] <= 50
1 <= k <= 30
let p = number of elements, at maximum, can sum up to the given value k.
Expected Time Complexity: O(2min(n,p))
Expected Auxiliary Space: O(n)
* */
class CombinationSum
{
    void solve(int ind, int arr[], int n, int k, List<List<Integer>> res, List<Integer> ds)
    {
        if(k == 0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }

        if(ind < n && arr[ind] <= k)
        {
            for(int i = ind; i < n; i++)
            {
                if(i > ind && arr[i] == arr[i - 1])
                    continue;

                ds.add(arr[i]);
                solve(i + 1, arr, n, k - arr[i], res, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public List<List<Integer>> CombinationSum2(int arr[], int n, int k)
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        Arrays.sort(arr);
        solve(0, arr, n, k, res, ds);

        return res;
    }
}
public class GFG_10May {
    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();

        // Test case 1
        int[] arr1 = {1, 2, 3, 3, 5};
        int n1 = 5, k1 = 7;
        List<List<Integer>> result1 = solution.CombinationSum2(arr1, n1, k1);
        System.out.println("Test Case 1:");
        printResult(result1);

        // Test case 2
        int[] arr2 = {5, 10, 15, 20, 25, 30};
        int n2 = 6, k2 = 35;
        List<List<Integer>> result2 = solution.CombinationSum2(arr2, n2, k2);
        System.out.println("\nTest Case 2:");
        printResult(result2);
    }

    private static void printResult(List<List<Integer>> result) {
        for (List<Integer> combination : result) {
            System.out.print("{ ");
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println("}");
        }
    }
}
