package DS;

public class QueueClass {
static class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}
        static class Queue{
            static Node head = null;
           static Node tail = null;
           public static boolean isEmpty(){
               return head==null && tail == null;
           }

           //enqueue
            public static void add(int val){
               Node newNode = new Node(val);
               if(tail == null){
                   tail=head=newNode;
                   return;
               }
               tail.next = newNode;
               tail = newNode;
            }

            // deque
            public static int remove(){
               if (isEmpty()){
                   System.out.println("The Queue is Empty");
                   return  -1;
               }
               int front = head.val;
               if(head==tail){
                   tail = null;
               }
               head = head.next;
               return front;
            }
            public static int peek(){
                if (isEmpty()){
                    System.out.println("The Queue is Empty");
                    return  -1;
                }
                return head.val;
            }

        }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        while (!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }

}
