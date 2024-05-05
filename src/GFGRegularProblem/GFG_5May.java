package GFGRegularProblem;
/* Vertical sum
* Given a binary tree having n nodes, find the vertical sum of the nodes that are in the same vertical line. Return all sums through different vertical lines starting from the left-most vertical line to the right-most vertical line.
Example 1:

Input:
       1
    /    \
  2      3
 /  \    /  \
4   5  6   7
Output:
4 2 12 3 7
Explanation:
The tree has 5 vertical lines
Line 1 has only one node 4 => vertical sum is 4.
Line 2 has only one node 2 => vertical sum is 2.
Line-3 has three nodes: 1,5,6 => vertical sum is 1+5+6 = 12.
Line-4 has only one node 3 => vertical sum is 3.
Line-5 has only one node 7 => vertical sum is 7.
Example 2:

Input:
          1
         /
        2
       /
      3
     /
    4
   /
  6
 /
7
Output:
7 6 4 3 2 1
Explanation:
There are six vertical lines each having one node.
Your Task:
You don't need to take input. Just complete the function verticalSum() that takes root node of the tree as parameter and returns an array containing the vertical sum of tree from left to right.
Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(n).
Constraints:
1<=n<=104
1<= Node value <= 105
* */
import java.util.ArrayList;
import java.util.TreeMap;

class Node5May {
    int data;
    Node5May left, right;

    Node5May(int item) {
        data = item;
        left = right = null;
    }
}
class VerticalSum {
    public ArrayList <Integer> verticalSum(Node5May root) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0,root.data);
        getVerticalValue(map, root.left, -1);
        getVerticalValue(map, root.right, +1);
        for (Integer key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }

    private void getVerticalValue(TreeMap<Integer, Integer> map, Node5May root, int key){
        if(root == null) return;

        if(!map.containsKey(key))
            map.put(key,root.data);
        else{
            int newData = map.get(key)+root.data;
            map.put(key,newData);
        }
        getVerticalValue(map,root.right,key+1);
        getVerticalValue(map,root.left,key-1);

    }
}
public class GFG_5May {
    public static void main(String[] args) {
        // Construct the binary tree
        Node5May root = new Node5May(1);
        root.left = new Node5May(2);
        root.right = new Node5May(3);
        root.left.left = new Node5May(4);
        root.left.right = new Node5May(5);
        root.right.left = new Node5May(6);
        root.right.right = new Node5May(7);

        // Create an instance of Solution class
        VerticalSum solution = new VerticalSum();

        // Calculate the vertical sum
        ArrayList<Integer> verticalSums = solution.verticalSum(root);

        // Print the vertical sums
        System.out.println("Vertical sums:");
        for (int sum : verticalSums) {
            System.out.print(sum + " ");
        }
    }
}
