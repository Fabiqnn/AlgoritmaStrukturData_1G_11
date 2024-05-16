package P12;

/**
 * Node
 */
public class Node {

    Node next, prev;
    int data;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}