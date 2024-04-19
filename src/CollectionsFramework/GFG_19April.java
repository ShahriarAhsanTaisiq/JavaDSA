package CollectionsFramework;
/* Find missing in second array
Given two arrays a of size n and b of size m, the task is to find numbers which are present in the first array, but not present in the second array.
Example 1:
Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 10}
b[] = {2, 3, 1, 0, 5}
Output:
4 10
Explanation:
4 and 10 are present in first array, but not in second array.
Example 2:
Input:
n = 5, m = 5
a[] = {4, 3, 5, 9, 11}
b[] = {4, 9, 3, 11, 10}
Output:
5
Explanation:
Second array does not contain element 5.
Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function findMissing() that takes array a, array b, integer n, and integer m as parameters and returns an array that contains the missing elements and the order of the elements should be the same as they are in array a.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(m).

Constraints:
1 ≤ n, m ≤ 10^5
-10^9 ≤ A[i], B[i] ≤ 10^9
*/

import java.util.ArrayList;
import java.util.HashSet;
class MissingInSecondArray
{
    ArrayList<Integer> findMissing(int[] a, int[] b, int n, int m)
    {
        HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }
        ArrayList<Integer> missingElements = new ArrayList<>();
        for (int num : a) {
            if (!setB.contains(num)) {
                missingElements.add(num);
            }
        }
        return missingElements;
    }
}
//Driver Class
public class GFG_19April {
    public static void main(String[] args) {
        MissingInSecondArray solution = new MissingInSecondArray();

        // Example 1
        int[] a1 = {1, 2, 3, 4, 5, 10};
        int[] b1 = {2, 3, 1, 0, 5};
        int n1 = 6, m1 = 5;
        ArrayList<Integer> result1 = solution.findMissing(a1, b1, n1, m1);
        System.out.println("Example 1:");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] a2 = {4, 3, 5, 9, 11};
        int[] b2 = {4, 9, 3, 11, 10};
        int n2 = 5, m2 = 5;
        ArrayList<Integer> result2 = solution.findMissing(a2, b2, n2, m2);
        System.out.println("Example 2:");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
