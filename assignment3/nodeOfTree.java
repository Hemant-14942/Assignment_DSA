import java.math.*;
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
    }
}
public class nodeOfTree{
    public static void main(String[] args){
        Node a = new Node(11);
        Node b = new Node(6);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(8);
        Node f = new Node(7);

        a.left=d ;a.right=f;
        d.left=e; d.right=c;
        f.left=b; 
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);    
        System.out.println();
        System.out.print("sum of all nodes--->");
        int sumofAllNodes = sum(a);
        System.out.println(sumofAllNodes); 
        System.out.print("size of tree--->");
        int sizeOFTree = size(a);
        System.out.println(sizeOFTree); 
        System.out.print("max of node --->");
        System.out.println(max(a));
        System.out.print("min of node --->");
        System.out.println(min(a));
    }
    // displaying tree
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        preorder(root.left);
        System.out.print(root.value+" ");
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.value+" ");
    }
    
    // find the sum of nodes
    public static int sum(Node root){
        if(root==null) return 0;
        return root.value +sum(root.left) +sum(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1 +size(root.left) +size(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.value , b = max(root.left) ,  c = max(root.right) ;
        return Math.max(a, Math.max(b,c));
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = root.value , b = min(root.left) ,  c = min(root.right) ;
        return Math.min(a, Math.min(b,c));
    }
 }