package BinaryTrees;
package BinaryTrees;


public class CountNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = countNodes(root.left);
        int rc = countNodes(root.right);

        return lc + rc + 1;
    }

    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }

        int ls = sumNode(root.left);
        int rs = sumNode(root.right);

       return root.data + ls + rs;

    }


     public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(countNodes(root));
        System.out.println(sumNode(root));

    }
}
