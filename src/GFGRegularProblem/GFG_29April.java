package GFGRegularProblem;
/* Remove every kth node
*Given a singly linked list having n nodes, your task is to remove every kth node from the linked list.
Example 1:
Input:
n = 8
linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
k = 2
Output:
1 -> 3 -> 5 -> 7
Explanation:
After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7.
Example 2:
Input:
n = 10
linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
k = 3
Output:
1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
Explanation:
After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.
Your Task:
The task is to complete the function deleteK() which takes head of linked list and integer k as input parameters and delete every kth node from the linked list and return its head.

Expected Time Complexity :  O(n)
Expected Auxiliary Space :  O(1)

Constraints:
1 <= n <= 10^5
-109 <= elements of linked list <= 109
1 <= k <= n
* */


import java.util.Scanner;
class Solution
{
    Node delete(Node head, int k)
    {
        if (k == 1) {
            return null;
        }

        int count = 0;

        Node prev = null;

        Node current = head;

        while (current != null) {
            count++;

            if (count % k == 0) {
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
        }

        return head;
    }
}
class Node2 {
    Node next;
    int data;

    Node2(int d) {
        data = d;
        next = null;
    }
}

public class GFG_29April {
    Node head;
    Node tail;

    void addToTheLast(Node node){
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            GFG_29April list = new GFG_29April();
            int a1 = sc.nextInt();
            Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                list.addToTheLast(new Node(a));
            }
            int k = sc.nextInt();
            Solution solution = new Solution();
            list.head = solution.delete(list.head, k);
            Node temp = list.head;
            while(temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
            t--;
        }
    }
}
