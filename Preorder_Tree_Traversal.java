class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    BinaryTree() { root = null; }
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        // traverse the root node
        System.out.print(node.key + " ");
        // traverse the left child
        printPreorder(node.left);
        // traverse the right child
        printPreorder(node.right);
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
 
        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
    }
}
