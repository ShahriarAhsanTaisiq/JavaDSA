package DS;
/* Ancestors in Binary Tree
* Given a Binary Tree and an integer target. Find all the ancestors of the given target.
Note:
The ancestor of node x is node y, which is at the upper level of node x, and x is directly connected with node y. Consider multiple levels of ancestors to solve this problem.
In case there are no ancestors available, return an empty list.
Examples:

Input:
         1
       /   \
      2     3
    /  \    /  \
   4   5  6   8
  /
 7
target = 7
Output: [4 2 1]
Explanation: The given target is 7, if we go above the level of node 7, then we find 4, 2 and 1. Hence the ancestors of node 7 are 4 2 and 1
Input:
        1
      /   \
     2     3
target = 1
Output: [ ]
Explanation: Since 1 is the root node, there would be no ancestors. Hence we return an empty list.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(height of tree)

Constraints:
1 ≤ no. of nodes ≤ 103
1 ≤ data of node ≤ 104
* */

import java.util.ArrayList;

class Node7July{
    int data;
    Node7July left, right;
    Node7July(int data){
        this.data = data;
        left = right = null;
    }
}
class AncestorOfBTree{
    public ArrayList<Integer> Ancestors(Node7July root, int target){
        ArrayList<Integer> result = new ArrayList<>();
        findAncestors(root, target,result);
        return result;
    }

    private boolean findAncestors(Node7July root, int target, ArrayList<Integer> result) {
        if (root == null){
            return false;
        }
        if (root.data == target){
            return true;
        }
        if (findAncestors(root.left,target,result) || findAncestors(root.right, target, result)){
            result.add(root.data);
            return true;
        }
        return false;
    }
}
public class AncestorsInBinaryTree {
    public static void main(String[] args) {
        // Creating the binary tree from the example
        Node7July root = new Node7July(1);
        root.left = new Node7July(2);
        root.right = new Node7July(3);
        root.left.left = new Node7July(4);
        root.left.right = new Node7July(5);
        root.right.left = new Node7July(6);
        root.right.right = new Node7July(8);
        root.left.left.left = new Node7July(7);

        AncestorOfBTree solution = new AncestorOfBTree();
        int target = 7;
        ArrayList<Integer> result = solution.Ancestors(root, target);
        System.out.println(result); // Output: [4, 2, 1]
    }
}
