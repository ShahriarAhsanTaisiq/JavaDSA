package GFGRegularProblem;

import java.util.*;

/*Find the Highest number
* Given an integer array a[] of size n, find the highest element of the array. The array will either be strictly increasing or strictly increasing and then strictly decreasing.
Note: a[i] != a[i+1]
Example 1:
Input:
11
1 2 3 4 5 6 5 4 3 2 1
Output:
6
Explanation:
Highest element of array a[] is 6.
Example 2:
Input:
5
1 2 3 4 5
Output:
5
Explanation:
Highest element of array a[] is 5.
Your Task:
You don't need to read or print anything. Your task is to complete the function findPeakElement() which takes the array a[] as the input parameter and returns the highest element of the array.
Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)
Constraints:
2 <= n <= 106
1 <= a[i] <= 106

* */
class HighestNumber {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int left =0;
        int right = a.size()-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(a.get(mid)>a.get(mid+1)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return a.get(left);
    }
}
public class GFG_18May {
    public static void main(String[] args) {
        HighestNumber solution = new HighestNumber();

        // Example 1: Strictly increasing and then strictly decreasing array
        List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1);
        System.out.println("Peak element in array1: " + solution.findPeakElement(array1)); // Expected output: 6

        // Example 2: Strictly increasing array
        List<Integer> array2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Peak element in array2: " + solution.findPeakElement(array2)); // Expected output: 5

        // Additional test case 1: Strictly increasing and then strictly decreasing array with different values
        List<Integer> array3 = Arrays.asList(1, 3, 5, 7, 8, 9, 8, 7, 6, 5, 4, 2);
        System.out.println("Peak element in array3: " + solution.findPeakElement(array3)); // Expected output: 9

    }
}
