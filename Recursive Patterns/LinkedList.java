
public class LinkedList {

    public static void printReversedLinkedList(Node head){
        if (head == null) return;
        printReversedLinkedList(head.getNext());
        System.out.println(head.getVal());
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        first.addNode(2).addNode(3).addNode(4).addNode(5) ;      
        printReversedLinkedList(first);
    }
    
}

public class Node {
    private Node next = null;
    private int val;
    public Node(int val){
        this.val = val;
    }
    public Node addNode(int val){
        this.next = new Node(val);
        return this.next;
    }
    public Node getNext(){
        return this.next;
    }
    public int getVal(){
        return this.val;
    }
}

