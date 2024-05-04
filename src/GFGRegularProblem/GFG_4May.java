package GFGRegularProblem;

/*Construct Binary Tree from Inorder and Postorder

* Given inorder and postorder traversals of a binary tree(having n nodes) in the arrays in[] and post[] respectively. The task is to construct a binary tree from these traversals.
Driver code will print the preorder traversal of the constructed tree.
Example 1:
Input:
n = 8
in[] = {4, 8, 2, 5, 1, 6, 3, 7}
post[] = {8, 4, 5, 2, 6, 7, 3, 1}
Output:
1 2 4 8 5 3 6 7
Explanation:
For the given postorder and inorder traversal of tree the  resultant binary tree will be
          1
       /      \
     2        3
   /  \      /  \
  4   5    6   7
   \
    8
Example 2:
Input:
n = 5
in[] = {9, 5, 2, 3, 4}
post[] = {5, 9, 3, 4, 2}
Output:
2 9 5 4 3
Explanation:
The  resultant binary tree will be
           2
        /     \
       9      4
        \     /
         5   3
Your Task:
You do not need to read input or print anything. Complete the function buildTree() which takes the inorder, postorder traversals and the number of nodes in the tree as input parameters and returns the root node of the newly constructed Binary Tree.

Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 103
1 <= in[i], post[i] <= 106
* */

class Node4May {
    int data;
    Node4May left, right;

    Node4May(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class BinaryTreeFromInorderPostorder {
    // Function to return a tree created from postorder and inorder traversals.
    Node4May buildTree(int in[], int post[], int n) {
        // Call helper function to build the tree recursively.
        return buildTreeHelper(in, post, 0, n - 1, 0, n - 1);
    }

    // Helper function to recursively build the tree.
    Node4May buildTreeHelper(int in[], int post[], int inStart, int inEnd, int postStart, int postEnd) {
        // Base case: if start index of inorder traversal exceeds end index, return null.
        if (inStart > inEnd)
            return null;

        // The last element of postorder traversal is the root of the current subtree.
        Node4May root = new Node4May(post[postEnd]);

        // Find the index of root in inorder traversal.
        int rootIndexInorder = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.data) {
                rootIndexInorder = i;
                break;
            }
        }
        // Calculate the size of left subtree.
        int leftSubtreeSize = rootIndexInorder - inStart;

        // Recursively build left and right subtrees.
        root.left = buildTreeHelper(in, post, inStart, rootIndexInorder - 1, postStart, postStart + leftSubtreeSize - 1);
        root.right = buildTreeHelper(in, post, rootIndexInorder + 1, inEnd, postStart + leftSubtreeSize, postEnd - 1);

        return root;
    }
}
public class GFG_4May {
    static void preorder(Node4May root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderPostorder treeBuilder = new BinaryTreeFromInorderPostorder();

        // Example 1:
        int[] inorder1 = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] postorder1 = {8, 4, 5, 2, 6, 7, 3, 1};
        int n1 = inorder1.length;
        Node4May root1 = treeBuilder.buildTree(inorder1, postorder1, n1);
        System.out.println("Preorder traversal of the constructed tree (Example 1):");
        preorder(root1);
        System.out.println();

        // Example 2:
        int[] inorder2 = {9, 5, 2, 3, 4};
        int[] postorder2 = {5, 9, 3, 4, 2};
        int n2 = inorder2.length;
        Node4May root2 = treeBuilder.buildTree(inorder2, postorder2, n2);
        System.out.println("Preorder traversal of the constructed tree (Example 2):");
        preorder(root2);
        System.out.println();
    }
}
