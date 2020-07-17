class Node {
    String key;
    Node left, right;

    public Node(String item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node("A");
        tree.root.left = new Node("B");
        tree.root.left.left = new Node("E");
        tree.root.left.left.left = new Node("I");
        tree.root.left.left.right = new Node("J");
        tree.root.right = new Node("D");
        tree.root.right.left = new Node("F");
        tree.root.right.left.left = new Node("K");
        tree.root.right.right = new Node("H");
        tree.root.right.right.left = new Node("L");
        tree.root.right.right.right = new Node("M");

        System.out.println("Preorder");
        tree.printPreorder();
        System.out.println();
        System.out.println("Inorder");
        tree.printInorder();
        System.out.println();
        System.out.println("Postorder");
        tree.printPostorder();
    }
}