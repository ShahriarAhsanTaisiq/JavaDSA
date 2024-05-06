package GFGRegularProblem;
/*Print all nodes that don't have sibling
* Given a Binary Tree of n nodes, find all the nodes that don't have any siblings. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order (Increasing).
Two nodes are said to be siblings if they are present at the same level, and their parents are the same.
Note: The root node can not have a sibling so it cannot be included in our answer.
Example 1:
Input :
       37
      /
    20
    /
  113
Output:
20 113
Explanation:
Nodes 20 and 113 dont have any siblings.

Example 2:

Input :
       1
      / \
     2   3

Output:
-1
Explanation:
Every node has a sibling.
Your Task:
You don't need to read input or print anything. Complete the function noSibling() which takes the root of the tree as input parameter and returns a list of integers containing all the nodes that don't have a sibling in sorted order. If all nodes have a sibling, then the returning list should contain only one element -1.

Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(Height of the tree)
Constraints:
1 ≤ n ≤ 104
*
* */

import java.util.ArrayList;
import java.util.Collections;

class Node6May
{
    int data;
    Node6May left, right;

    Node6May(int item)
    {
        data = item;
        left = right = null;
    }
}
class NodeNotSibling {
    ArrayList<Integer> noSibling(Node6May node)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        inorder(al,node);
        Collections.sort(al);
        if(al.size()==0)
        {
            al.add(-1);
            return al;
        }
        return al;
    }

    static void inorder(ArrayList<Integer> al , Node6May root)
    {
        if(root==null)
            return;

        inorder(al,root.left);

        if(root.left!=null && root.right==null)
        {
            al.add(root.left.data);
        }
        else if(root.left==null && root.right!=null)
        {
            al.add(root.right.data);
        }

        inorder(al,root.right);
    }
}
public class GFG_6May {
    public static void main(String[] args) {
        // Create the binary tree
        Node6May root1 = new Node6May(37);
        root1.left = new Node6May(20);
        root1.left.left = new Node6May(113);

        // Create an instance of the Tree class
        NodeNotSibling tree = new NodeNotSibling();

        // Call the noSibling method to find nodes without siblings
        ArrayList<Integer> result1 = tree.noSibling(root1);

        // Print the result
        System.out.println("Example 1:");
        System.out.println("Input :");
        System.out.println("       37");
        System.out.println("      /   ");
        System.out.println("    20");
        System.out.println("    /   ");
        System.out.println("  113 ");
        System.out.println("Output:");
        for (int val : result1) {
            System.out.print(val + " ");
        }
        System.out.println("\n");

        // Create another binary tree
        Node6May root2 = new Node6May(1);
        root2.left = new Node6May(2);
        root2.right = new Node6May(3);

        // Call the noSibling method again
        ArrayList<Integer> result2 = tree.noSibling(root2);

        // Print the result
        System.out.println("Example 2:");
        System.out.println("Input :");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("Output:");
        for (int val : result2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
