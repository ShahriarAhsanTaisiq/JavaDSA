package GFGRegularProblem;
/*Delete Middle of Linked List
* Given a singly linked list, delete middle of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
If the input linked list has single node, then it should return NULL.

Example 1:
Input:
LinkedList: 1->2->3->4->5
Output:
1 2 4 5
Example 2:

Input:
LinkedList: 2->4->6->7->5->1
Output:
2 4 6 5 1
Your Task:
The task is to complete the function deleteMid() which takes head of the linkedlist  and return head of the linkedlist with middle element deleted from the linked list. If the linked list is empty or contains single element then it should return NULL.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
Constraints:
1 <= n <= 105
1 <= value[i] <= 109
* */

class Node1 {
    int data;
    Node next;
    Node1(int d)  { data = d;  next = null; }
}
class DeleteMidOfLinkedList {
    Node deleteMid(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;  // Slow pointer
        Node fast = head;  // Fast pointer
        Node prev = null;  // Previous of slow

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = head.next;
        }

        return head;
    }
}

public class GFG_28April {
    public static void main(String[] args) {
        // Create the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original linked list:");
        printList(head);

        // Call the deleteMid function
        DeleteMidOfLinkedList solution = new DeleteMidOfLinkedList();
        head = solution.deleteMid(head);

        System.out.println("Linked list after deleting middle node:");
        printList(head);
    }

    // Method to print the linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Node class
    static class Node1 {
        int data;
        Node next;

        Node1(int d) {
            data = d;
            next = null;
        }
    }

}
