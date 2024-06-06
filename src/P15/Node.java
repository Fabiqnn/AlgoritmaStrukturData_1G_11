package P15;

/**
 * Node
 */
public class Node {

    Node next, prev;
    int data, jarak;

    public Node(Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}