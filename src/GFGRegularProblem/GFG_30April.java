package GFGRegularProblem;
/*Add two numbers represented by linked lists
* Given two numbers, num1 and num2, represented by linked lists of size n and m respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Example 1:
Input:
n = 2
num1 = 45 (4->5->null)
m = 3
num2 = 345 (3->4->5->null)
Output:
3->9->0->null
Explanation:
For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).
Example 2:
Input:
n = 4
num1 = 0063 (0->0->6->3->null)
m = 2
num2 = 07 (0->7->null)
Output:
7->0->null
Explanation:
For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.
Expected Time Complexity: O(n+m)
Expected Auxiliary Space: O(max(n,m)) for the resultant list.

Constraints:
1 <= n, m <= 104
* */
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class AddTwoNumByLinkedList{
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node n = null;
        while(curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2){
        Node n1 = reverse(num1);
        Node n2 = reverse(num2);
        Node ans = new Node(-1);
        Node re = ans;
        int carry = 0;
        while(n1 != null || n2 != null){
            int sum = carry;
            if(n1 != null){
                sum += n1.data;
                n1 = n1.next;
            }
            if(n2 != null){
                sum += n2.data;
                n2 = n2.next;
            }
            Node temp = new Node(sum%10);
            ans.next = temp;
            ans = temp;
            carry = sum/10;
        }
        if(carry != 0){
            Node temp = new Node(carry);
            ans.next = temp;
            ans = temp;
        }
        Node a = reverse(re.next);
        while(a != null && a.data == 0){
            a = a.next;
        }
        if(a == null)return new Node(0);
        return a;
    }
}
public class GFG_30April {
}
