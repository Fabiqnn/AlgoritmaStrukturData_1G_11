package P12;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addlast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int data, int index) {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Nilai Index Diluar Batas");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++ ;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Double Linked List Masih Kosong");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "\t");
                current = current.next;
            }
            System.out.println("\nBerhasil Diisi");
        }
    }
}