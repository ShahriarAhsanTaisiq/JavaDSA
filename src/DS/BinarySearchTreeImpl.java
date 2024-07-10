package DS;

class NodeBST{
    int val;
    NodeBST left;
    NodeBST right;
    NodeBST(int val){
        this.val=val;
        left = right = null;
    }
}
class BinarySearchTree{
    public NodeBST insert(NodeBST root, int val){
        if(root == null){
            root = new NodeBST(val);
            return root;
        }
        if(root.val > val){
            //left subtree
            root.left = insert(root.left,val);
        } else{
            //right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }
    public void inOrder(NodeBST root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }
}
public class BinarySearchTreeImpl {
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        NodeBST root = null;
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i<values.length; i++){
            root = bst.insert(root, values[i]);
        }
        bst.inOrder(root);
    }
}
