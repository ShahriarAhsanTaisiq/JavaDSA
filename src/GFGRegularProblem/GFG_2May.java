package GFGRegularProblem;
import java.util.*;
/*Serialize and deserialize a binary tree

*Serialization is to store a tree in an array so that it can be later restored and deserialization is reading tree back from the array. Complete the functions
serialize() : stores the tree into an array a and returns the array.
deSerialize() : deserializes the array to the tree and returns the root of the tree.
Note: Multiple nodes can have the same data and the node values are always positive integers. Your code will be correct if the tree returned by deSerialize(serialize(input_tree)) is same as the input tree. Driver code will print the in-order traversal of the tree returned by deSerialize(serialize(input_tree)).
Example 1:
Input:
      1
    /   \
   2     3
Output:
2 1 3
Example 2:

Input:
         10
       /    \
      20    30
    /   \
   40  60
Output:
40 20 60 10 30
Your Task:
The task is to complete two functions serialize which takes the root node of the tree as input and stores the tree into an array and deSerialize which deserializes the array to the original tree and returns the root of it.
Expected Time Complexity: O(Number of nodes).
Expected Auxiliary Space: O(Number of nodes).
Constraints:
1 <= Number of nodes <= 10^4
1 <= Data of a node <= 10^9
*
*/
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    // Serialization
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> level = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node p = q.poll();
            if (p == null) {
                level.add(-1);
            } else {
                level.add(p.data);
                q.add(p.left);
                q.add(p.right);
            }
        }
        return level;
    }

    // Deserialization
    public Node deSerialize(ArrayList<Integer> a) {
        if (a == null || a.size() == 0 || a.get(0) == -1)
            return null;

        Node root = new Node(a.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < a.size()) {
            Node p = q.poll();
            Integer leftVal = a.get(i++);
            Integer rightVal = i < a.size() ? a.get(i++) : null;

            if (leftVal != null && leftVal != -1) {
                p.left = new Node(leftVal);
                q.add(p.left);
            }
            if (rightVal != null && rightVal != -1) {
                p.right = new Node(rightVal);
                q.add(p.right);
            }
        }
        return root;
    }
}

public class GFG_2May {
    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create an object of Tree class
        Tree tree = new Tree();

        // Serialize the binary tree
        ArrayList<Integer> serialized = tree.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        // Deserialize the serialized binary tree
        Node deserializedRoot = tree.deSerialize(serialized);

        // Print the in-order traversal of the deserialized tree
        System.out.print("In-order Traversal of Deserialized Tree: ");
        inOrder(deserializedRoot);
    }
}