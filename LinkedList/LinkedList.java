public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);

        // when linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // next ---> head
        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addIndex(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void reverseList(){
        Node prev = null;
        Node curr = tail =  head;

        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        head = prev;

    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPelindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 find mid
        Node midNode = findMid(head);

        // step 2 reverse next half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//head of right list
        Node left = head ;

        // step 3 check left half and right half 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(12);
        ll.addFirst(11);


        ll.addLast(12);
        ll.addLast(11);

        // ll.addIndex(2, 1000);

        ll.printList();

        // ll.reverseList();
        // ll.printList();

        System.out.println(ll.checkPelindrome());
    }
}
