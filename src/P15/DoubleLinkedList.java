package P15;

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

    public void addFirst(int data, int jarak) {
        if (isEmpty()) {
            head = new Node(null, data, jarak, null);
        } else {
            Node newNode = new Node(null, data, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
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

    public void remove(int dataDicari) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == dataDicari) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        head = current.next;
                    }
                    size--;
                    break;
                }
                current = current.next;
            }
        }
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Index Diluar Batas");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.jarak;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Index Diluar Batas");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }
}