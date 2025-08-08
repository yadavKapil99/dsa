package BinaryTree2;
import java.util.*;

public class TopView {
    static class Node{
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
                continue;
            }

            Node node = curr.node;
            int hd = curr.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node);
            }

            if (node.left != null) {
                q.add(new Info(node.left, hd - 1));
                min = Math.min(min, hd - 1);
            }
            if (node.right != null) {
                q.add(new Info(node.right, hd + 1));
                max = Math.max(max, hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                System.out.print(map.get(i).data + " ");
            }
        }
       
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
