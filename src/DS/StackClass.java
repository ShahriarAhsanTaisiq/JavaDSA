package DS;

public class StackClass {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }

    static class Stack{
        public static Node head;
        static boolean isEmpty(){
            return head == null;
        }

        static  void push(int val){
            Node newNode = new Node(val);
            if(isEmpty()){
                head =  newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.val;
        }

    }
    public static void main(String [] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
