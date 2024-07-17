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
    public boolean searchInBST(NodeBST root, int target){
        if (root == null){
            return false;
        }
        if (root.val == target){
            return true;
        }
        if (target < root.val){
           return searchInBST(root.left,target);
        }
        else {
            return searchInBST(root.right,target);
        }
    }

    public NodeBST delete(NodeBST root, int val){
        if(root == null){
            return null;
        }
        if (root.val > val){
            root.left = delete(root.left,val);
        } else if(root.val < val){
            root.right = delete(root.right, val);
        }else {
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            NodeBST IS = inOrderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }

    private NodeBST inOrderSuccessor(NodeBST root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

   public void printInRange(NodeBST root, int x, int y){
        if (root == null){
            return;
        }
        if (x <= root.val && y >= root.val){
            printInRange(root.left,x,y);
            System.out.print(root.val+" ");
            printInRange(root.right,x,y);
        } else if (x >= root.val) {
            printInRange(root.right,x,y);
        } else {
            printInRange(root.left,x,y);
        }
   }
}
public class BinarySearchTreeImpl {
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        NodeBST root = null;
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i<values.length; i++){
            root = bst.insert(root, values[i]);
        }
        bst.inOrder(root);
        System.out.println("\n"+ bst.searchInBST(root,8));
        bst.delete(root,4);
        bst.inOrder(root);
        System.out.println("\nPrint in Range: ");
        bst.printInRange(root,6,10);
    }
}
