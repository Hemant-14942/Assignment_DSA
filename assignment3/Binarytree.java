class Node {
    int data;
    Node left;
    Node right;
    Node parent;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
class BinaryTree {
    Node root;

    // Constructor
    public BinaryTree() {
        this.root = null;
    }

    // Method to add a node to the tree
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            addNodeRecursively(root, newNode);
        }
    }

    // Helper method to add a node recursively
    private void addNodeRecursively(Node current, Node newNode) {
        if (newNode.data < current.data) {
            if (current.left == null) {
                current.left = newNode;
                newNode.parent = current;
            } else {
                addNodeRecursively(current.left, newNode);
            }
        } else if (newNode.data > current.data) {
            if (current.right == null) {
                current.right = newNode;
                newNode.parent = current;
            } else {
                addNodeRecursively(current.right, newNode);
            }
        }
    }

    // Method to perform an in-order traversal
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}
public class Binarytree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Adding nodes to the tree
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(6);
        tree.addNode(8);
        
        // Performing in-order traversal
        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
    }
}
