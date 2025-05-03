public class DoubleLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size ++;

        if(head == null){
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    // remove - remove last



    // print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<---->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(11);
        dll.addFirst(10);
        dll.addFirst(9);
        dll.addFirst(8);
        dll.addFirst(7);
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
    }
}
