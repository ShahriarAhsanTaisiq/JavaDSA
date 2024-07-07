package DS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    int index = -1;
    public Node buildTree(int [] nodes){
        index++;
        if (nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);

    }
    public void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (! q.isEmpty()){
            Node currNode = q.remove();
            if (currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.val+" ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    // count nodes of the tree
    public  int countOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode+rightNode+1;
    }

    // sum of nodes
    public int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.val;
    }
}
public class BinaryTreesImpl {
    public static void main(String [] args){
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.val);
        System.out.println("\nPre Order Traversal");
        tree.preOrder(root);
        System.out.println("\nInorder Traversal");
        tree.inOrder(root);
        System.out.println("\nPost Order Traversal");
        tree.postOrder(root);
        System.out.println("\nLevel Order Traversal");
        tree.levelOrder(root);
        System.out.println("Count the nodes of binary tree");
        System.out.println(tree.countOfNodes(root));
        System.out.println("Sum the nodes of binary tree");
        System.out.println(tree.sumOfNodes(root));



    }
}
