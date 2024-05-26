package GFGRegularProblem;
/*You and your books

* You have n stacks of books. Each stack of books has some nonzero height arr[i] equal to the number of books on that stack ( considering all the books are identical and each book has a height of 1 unit ). In one move, you can select any number of consecutive stacks of books such that the height of each selected stack of books arr[i] <= k. Once such a sequence of stacks is chosen, You can collect any number of books from the chosen sequence of stacks.
What is the maximum number of books that you can collect this way?

Example 1

Input
8 1
3 2 2 3 1 1 1 3
Output
3
Explanation
We can collect maximum books from consecutive stacks numbered 5, 6, and 7 having height less than equal to K.
Example 2

Input
8 2
3 2 2 3 1 1 1 3
Output
4
Explanation
We can collect maximum books from consecutive stacks numbered 2 and 3 having height less than equal to K.
Your Task:
You don't have to read input or print anything. Your task is to complete the function max_Books() which takes the integer arr, n, and k returns the maximum number of books you can collect.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 105
1 <= k <= 109
1 <= arr[i] <= 109
* */
class YouAndYourBooks {
    long max_Books(int arr[], int n, int k) {
        long curr = 0;
        long maxi = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                curr += arr[i];
                maxi = Math.max(maxi, curr);
            } else {
                curr = 0;
            }
        }
        return maxi;
    }
}

public class GFG_25May {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {3, 2, 2, 3, 1, 1, 1, 3};
        int n1 = 8;
        int k1 = 1;
        testMaxBooks(arr1, n1, k1, 3); // Expected output: 3

        // Test case 2
        int[] arr2 = {3, 2, 2, 3, 1, 1, 1, 3};
        int n2 = 8;
        int k2 = 2;
        testMaxBooks(arr2, n2, k2, 4); // Expected output: 4

        // Additional test cases
        int[] arr3 = {1, 2, 3, 4, 5};
        int n3 = 5;
        int k3 = 3;
        testMaxBooks(arr3, n3, k3, 6); // Expected output: 6 (sum of first two elements: 1 + 2 + 3)

        int[] arr4 = {5, 5, 5, 5};
        int n4 = 4;
        int k4 = 5;
        testMaxBooks(arr4, n4, k4, 20); // Expected output: 20 (sum of all elements)

        int[] arr5 = {5, 4, 3, 2, 1};
        int n5 = 5;
        int k5 = 2;
        testMaxBooks(arr5, n5, k5, 3); // Expected output: 3 (sum of the last two elements: 2 + 1)
    }

    private static void testMaxBooks(int[] arr, int n, int k, long expected) {
        YouAndYourBooks books = new YouAndYourBooks();
        long result = books.max_Books(arr, n, k);
        System.out.println("Test result: " + result + " (Expected: " + expected + ")");
    }
}
