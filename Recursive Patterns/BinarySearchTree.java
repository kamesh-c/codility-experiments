public class BinarySearchTree {

    public static Node loadData(int[] n){
        Node root = new Node(n[0]);
        for( int i = 1; i < n.length; i++){
            root.add(n[i]);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = loadData(new int[] {5, 3,2,4,8,7,9});   
        System.out.println("");
        System.out.println("Pre Order ");
        root.traversePreOrder(root);
        System.out.println("");
        System.out.println("In Order ");
        root.traverseInOrder(root);
        System.out.println("");
        System.out.println("POST Order ");
        root.traversePostOrder(root);
    }

    
}
class Node{
    int value;
    Node left = null, right = null;
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    public void add(int value){
        addRecursive(this, value);
    }
    public Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }else if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }else{
            return current;
        }
        return current;
    }

    public void traversePreOrder(Node currentNode){
        System.out.print(" " +currentNode.value);
        if (currentNode.left != null){
            traversePreOrder(currentNode.left);
        }
        if (currentNode.right != null){
            traversePreOrder(currentNode.right);
        }
    }

    public void traversePostOrder(Node node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public void traverseInOrder(Node node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}