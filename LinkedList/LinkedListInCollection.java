import java.util.LinkedList;
public class LinkedListInCollection {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);

        // remove

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
