package GFGRegularProblem;
/*Arrange Consonants and Vowels
* Given a singly linked list having n nodes containing english alphabets ('a'-'z'). Rearrange the linked list in such a way that all the vowels come before the consonants while maintaining the order of their arrival.
Example 1:
Input:
n = 9
linked list: a -> b -> c -> d -> e -> f -> g -> h -> i
Output:
a -> e -> i -> b -> c -> d -> f -> g -> h
Explanation:
After rearranging the input linked list according to the condition the resultant linked list will be as shown in output.
Example 2:
Input:
n = 8
linked list: a -> b -> a -> b -> d -> e -> e -> d
Output:
a -> a -> e -> e -> b -> b -> d -> d
Explanation:
After rearranging the input linked list according to the condition the resultant linked list will be as shown in output.
Your Task:
Your task is to complete the function arrangeCV(), which takes head of linked list and arranges the list in such a way that all the vowels come before the consonants while maintaining the order of their arrival and returns the head of the updated linked list.
Expected Time Complexity :  O(n)
Expected Auxiliary Space :  O(1)
Constraints:
1 <= n <= 104
'a' <= elements of linked list <= 'z'
* */
class Node3 {
    char data;
    Node3 next;

    public Node3(char data) {
        this.data = data;
        next = null;
    }
}

class ArrangeVowels {
    public Node3 arrangeCV(Node3 head){
        if (head == null || head.next == null) {
            return head;
        }

        Node3 vowelHead = null, vowelTail = null;
        Node3 consonantHead = null, consonantTail = null;

        Node3 current = head;
        while (current != null) {
            if (isVowel(current.data)) {
                if (vowelHead == null) {
                    vowelHead = current;
                    vowelTail = current;
                } else {
                    vowelTail.next = current;
                    vowelTail = current;
                }
            } else {
                if (consonantHead == null) {
                    consonantHead = current;
                    consonantTail = current;
                } else {
                    consonantTail.next = current;
                    consonantTail = current;
                }
            }
            current = current.next;
        }

        if (vowelHead == null) {
            return consonantHead;
        } else {
            vowelTail.next = consonantHead;
            if (consonantTail != null) {
                consonantTail.next = null;
            }
            return vowelHead;
        }
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

public class GFG_1May {
    static void printLinkedList(Node3 head) {
        Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list
        Node3 head1 = new Node3('a');
        head1.next = new Node3('b');
        head1.next.next = new Node3('c');
        head1.next.next.next = new Node3('d');
        head1.next.next.next.next = new Node3('e');
        head1.next.next.next.next.next = new Node3('f');
        head1.next.next.next.next.next.next = new Node3('g');
        head1.next.next.next.next.next.next.next = new Node3('h');
        head1.next.next.next.next.next.next.next.next = new Node3('i');

        Node3 head2 = new Node3('a');
        head2.next = new Node3('b');
        head2.next.next = new Node3('a');
        head2.next.next.next = new Node3('b');
        head2.next.next.next.next = new Node3('d');
        head2.next.next.next.next.next = new Node3('e');
        head2.next.next.next.next.next.next = new Node3('e');
        head2.next.next.next.next.next.next.next = new Node3('d');

        // Create an instance of the ArrangeVowels class
        ArrangeVowels solution = new ArrangeVowels();

        // Test the function with sample inputs
        System.out.println("Original Linked List 1:");
        printLinkedList(head1);
        Node3 rearrangedHead1 = solution.arrangeCV(head1);
        System.out.println("Rearranged Linked List 1:");
        printLinkedList(rearrangedHead1);

        System.out.println("Original Linked List 2:");
        printLinkedList(head2);
        Node3 rearrangedHead2 = solution.arrangeCV(head2);
        System.out.println("Rearranged Linked List 2:");
        printLinkedList(rearrangedHead2);
    }
}
