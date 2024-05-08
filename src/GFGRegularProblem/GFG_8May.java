package GFGRegularProblem;

import java.util.*;

/* Root to Leaf Paths
* Given a Binary Tree of nodes, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.
Example 1:
Input:
       1
    /     \
   2       3
Output:
1 2
1 3
Explanation:
All possible paths:
1->2
1->3
Example 2:
Input:
         10
       /    \
      20    30
     /  \
    40   60
Output:
10 20 40
10 20 60
10 30
Your Task:
Your task is to complete the function Paths() which takes the root node as an argument and returns all the possible paths. (All the paths are printed in new lines by the driver's code.)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(height of the tree)
Constraints:
1<=n<=104
* */
class Node8May {
    int data;
    Node8May left, right;

    Node8May(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class RootToLeafPath{
    public static ArrayList<ArrayList<Integer>> Paths(Node8May root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(root, path, result);
        return result;
    }

    private static void findPaths(Node8May node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (node == null)
            return;

        path.add(node.data);

        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            findPaths(node.left, path, result);
            findPaths(node.right, path, result);
        }

        path.remove(path.size() - 1);
    }
}
public class GFG_8May {
    public static void main(String[] args) {
        // Example 1
        Node8May root1 = new Node8May(1);
        root1.left = new Node8May(2);
        root1.right = new Node8May(3);

        System.out.println("Example 1:");
        ArrayList<ArrayList<Integer>> paths1 = RootToLeafPath.Paths(root1);
        printPaths(paths1);

        // Example 2
        Node8May root2 = new Node8May(10);
        root2.left = new Node8May(20);
        root2.right = new Node8May(30);
        root2.left.left = new Node8May(40);
        root2.left.right = new Node8May(60);

        System.out.println("\nExample 2:");
        ArrayList<ArrayList<Integer>> paths2 = RootToLeafPath.Paths(root2);
        printPaths(paths2);
    }

    private static void printPaths(ArrayList<ArrayList<Integer>> paths) {
        for (ArrayList<Integer> path : paths) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i));
                if (i < path.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
