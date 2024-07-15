package GFGRegularProblem;
/*Segregate 0s and 1s
* Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1
* */

import java.util.Arrays;

class Segregate{
    void segregate0and1(int [] arr){
        int count0 = 0, count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++){
            arr[i] = 0;
        }
        for (int i = count0; i < arr.length; i++){
            arr[i] = 1;
        }
    }
}
public class Segregate0sAnd1s {
    public static void main(String[] args) {
        Segregate segregate = new Segregate();

        int[] arr1 = {0, 0, 1, 1, 0};
        segregate.segregate0and1(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));

        int[] arr2 = {1, 1, 1, 1};
        segregate.segregate0and1(arr2);
        System.out.println("Output: " + Arrays.toString(arr2));

        int[] arr3 = {0, 1, 0, 1, 0, 1, 1, 0};
        segregate.segregate0and1(arr3);
        System.out.println("Output: " + Arrays.toString(arr3));
    }
}
