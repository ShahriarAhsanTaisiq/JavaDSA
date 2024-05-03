package GFGRegularProblem;
/* K distance from root

* Given a binary tree having n nodes and an integer k. Print all nodes that are at distance k from the root (root is considered at distance 0 from itself). Nodes should be printed from left to right.
Example 1:
Input:
k = 0
      1
    /   \
   3     2
Output:
1
Explanation:
1 is the only node which is 0 distance from the root 1.
Example 2:

Input:
k = 3
        1
       /
      2
       \
        1
      /  \
     5    3
Output:
5 3
Explanation:
5 and 3 are the nodes which are at distance 3 from the root 3.
Here, returning 3 5 will be incorrect.
Your Task:
You don't have to take input. Complete the function Kdistance() that accepts root node and k as parameters and returns the value of the nodes that are at a distance k from the root.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Height of the Tree).
Constraints:
1 <= n <= 10^4
0 <= k <= 30
* */

import java.util.ArrayList;

class Node3May {
    int data;
    Node3May left, right;

    Node3May(int item) {
        data = item;
        left = right = null;
    }
}

class Tree3May {
    ArrayList<Integer> result = new ArrayList<>();

    // Function to print nodes at distance k from the root
    ArrayList<Integer> Kdistance(Node3May root, int k) {
        if (root == null)
            return result;

        if (k == 0) {
            result.add(root.data);
            return result;
        }

        // Recur for left and right subtrees with k-1 distance
        Kdistance(root.left, k - 1);
        Kdistance(root.right, k - 1);

        return result;
    }
}

public class GFG_3May {
    public static void main(String[] args) {
        // Example 1
        Tree3May tree1 = new Tree3May();
        Node3May root1 = new Node3May(1);
        root1.left = new Node3May(3);
        root1.right = new Node3May(2);

        int k1 = 0;
        ArrayList<Integer> result1 = tree1.Kdistance(root1, k1);
        System.out.println("Example 1 Output: ");
        for (int val : result1) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Example 2
        Tree3May tree2 = new Tree3May();
        Node3May root2 = new Node3May(1);
        root2.left = new Node3May(2);
        root2.left.right = new Node3May(1);
        root2.left.right.left = new Node3May(5);
        root2.left.right.right = new Node3May(3);

        int k2 = 3;
        ArrayList<Integer> result2 = tree2.Kdistance(root2, k2);
        System.out.println("Example 2 Output: ");
        for (int val : result2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
