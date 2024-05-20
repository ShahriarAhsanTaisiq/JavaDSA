package GFGRegularProblem;
/*Modular Exponentiation for large numbers
* Implement pow(x, n) % M.
In other words, for a given value of x, n, and M, find  (xn) % M.
Example 1:
Input:
x = 3, n = 2, m = 4
Output:
1
Explanation:
32 = 9. 9 % 4 = 1.
Example 2:
Input:
x = 2, n = 6, m = 10
Output:
4
Explanation:
26 = 64. 64 % 10 = 4.
Your Task:
You don't need to read or print anything. Your task is to complete the function PowMod() which takes integers x, n, and M as input parameters and returns xn % M.
Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)
Constraints:
1 ≤ x, n, M ≤ 109
* */
class ModularExponentiation {
    public long PowMod(long x, long n, long m) {
        // Code here
        if (n == 0) return 1 % m;
        long result = 1;
        x = x % m;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % m;
            }
            n = n >> 1;
            x = (x * x) % m;
        }
        return result;
    }
}

public class GFG_20May {
    public static void main(String[] args) {
        ModularExponentiation solution = new ModularExponentiation();

        // Test case 1
        long x1 = 3, n1 = 2, m1 = 4;
        long result1 = solution.PowMod(x1, n1, m1);
        System.out.println("Result for (3^2) % 4: " + result1);  // Expected output: 1

        // Test case 2
        long x2 = 2, n2 = 6, m2 = 10;
        long result2 = solution.PowMod(x2, n2, m2);
        System.out.println("Result for (2^6) % 10: " + result2);  // Expected output: 4
    }
}
