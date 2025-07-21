package stack;

public class StackByLinkedList {
    static class Node {
        int data;
        Node next; 

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        // push
        public static void push(int data){
            
        }
    }

    public static void main(String[] args) {

    }
}
