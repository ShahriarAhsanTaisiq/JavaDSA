package GFGRegularProblem;

import java.util.ArrayList;
import java.util.List;

/*Reverse Level Order Traversal
*Given a binary tree of size n, find its reverse level order traversal. ie- the traversal must begin from the last level.
Example 1:

Input :
        1
      /   \
     3     2

Output:
3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \
   40  60

Output:
40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10
Your Task:
You don't need to read input or print anything. Complete the function reverseLevelOrder() which takes the root of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
Constraints:
1 ≤ n ≤ 10^4
* */
class Node7May {
    int data;
    Node7May left, right;

    Node7May(int item) {
        data = item;
        left = right = null;
    }
}
class ReverseTheLevelOrderOfTree {
    List<List<Integer>> list;

    public ArrayList<Integer> reverseLevelOrder(Node7May node) {
        list = new ArrayList<>();
        traverse(node, 0);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int num : list.get(i)) {
                res.add(num);
            }
        }
        return res;
    }

    private void traverse(Node7May node, int level) {
        if (node == null)
            return;

        if (list.size() == level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(node.data);

        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }
}
public class GFG_7May {
    public static void main(String[] args) {
        ReverseTheLevelOrderOfTree tree = new ReverseTheLevelOrderOfTree();
        // Creating the binary tree
        Node7May root = new Node7May(10);
        root.left = new Node7May(20);
        root.right = new Node7May(30);
        root.left.left = new Node7May(40);
        root.left.right = new Node7May(60);
        // Getting the reverse level order traversal
        ArrayList<Integer> reverseLevelOrder = tree.reverseLevelOrder(root);

        // Printing the reverse level order traversal
        System.out.println("Reverse Level Order Traversal:");
        for (int num : reverseLevelOrder) {
            System.out.print(num + " ");
        }
    }
}
