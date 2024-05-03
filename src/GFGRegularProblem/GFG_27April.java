package GFGRegularProblem;
import java.util.*;
/* Merge Sort on Doubly Linked List
* Given Pointer/Reference to the head of a doubly linked list of n nodes, the task is to Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing order.
Example 1:
Input:
n = 8
value[] = {7,3,5,2,6,4,1,8}
Output:
1 2 3 4 5 6 7 8
8 7 6 5 4 3 2 1
Explanation: After sorting the given linked list in both ways, resultant matrix will be as given in the first two line of output, where first line is the output for non-decreasing order and next line is for non-increasing order.
Example 2:
Input:
n = 5
value[] = {9,15,0,-1,0}
Output:
-1 0 0 9 15
15 9 0 0 -1
Explanation: After sorting the given
linked list in both ways, the
resultant list will be -1 0 0 9 15
in non-decreasing order and
15 9 0 0 -1 in non-increasing order.
Your Task:
The task is to complete the function sortDoubly() which takes reference to the head of the doubly linked and Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing. The printing is done automatically by the driver code.
Expected Time Complexity: O(nlogn)
Expected Space Complexity: O(logn)
Constraints:
1 <= n <= 104
-105 <= values[i] <= 105

*/
// Node class definition
class Node {
    int data;
    Node next, prev;

    Node(int val) {
        data = val;
    }
}

// MergeSortOnDoublyList class definition
class MergeSortOnDoublyList {

    // Middle find krne ke liye function
    Node getMiddle(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        // left or right jo smaller ho use choose krlo
        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            if (left.next != null)
                left.next.prev = left;
            left.prev = null;
            return left;
        } else {
            right.next = merge(left, right.next);
            if (right.next != null)
                right.next.prev = right;
            right.prev = null;
            return right;
        }
    }

    Node sortDoubly(Node head) {
        // Your code here
        if (head == null || head.next == null) return head;

        Node mid = getMiddle(head);
        Node nextToMid = mid.next;
        // do bhago me divide krdo
        mid.next = null;
        if (nextToMid != null)
            nextToMid.prev = null;
        Node left = sortDoubly(head);
        Node right = sortDoubly(nextToMid);
        return merge(left, right);
    }
}

public class GFG_27April {
    public static void main(String[] args) {
        // Create a sample doubly linked list
        Node head = new Node(7);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(5);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        // Create an object of MergeSortOnDoublyList class
        MergeSortOnDoublyList sorter = new MergeSortOnDoublyList();

        // Sort the doubly linked list
        Node sortedAscending = sorter.sortDoubly(head);

        // Print the sorted list in non-decreasing order
        Node temp = sortedAscending;
        System.out.print("Non-decreasing order: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        // Print the sorted list in non-increasing order
        Node sortedDescending = sortedAscending;
        while (sortedDescending.next != null) {
            sortedDescending = sortedDescending.next;
        }
        System.out.print("Non-increasing order: ");
        while (sortedDescending != null) {
            System.out.print(sortedDescending.data + " ");
            sortedDescending = sortedDescending.prev;
        }
        System.out.println();
    }
}

