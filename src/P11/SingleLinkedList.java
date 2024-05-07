package P11;

/**
 * SingleLinkedList
 */
public class SingleLinkedList {

    Node head;

    public boolean isEmpty() {
        // (head == null)
        return (head == null);// Pembetulan 1
    }

    public void Print() {
        if (!isEmpty()) {
            Node currentNode = head;
            System.out.print("Isi Linked List : ");
            while (currentNode != null) { // Pembetulan 2
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input);
        if (isEmpty()) {
            head = newNode;// Pembetulan 3
        } else {
            newNode.next = head;// Pembetulan 4
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input);

        if (isEmpty()) {
            addFirst(input);
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node newNode = new Node(input);

        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node currentNode = head; // currentNode = temp

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next; // Nilai baru disambungkan dengan nilai setelahnya
                    currentNode.next = newNode; // Memasukkan nilai baru
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        }
    }

    public void insertAt(int input, int position) {
        Node newNode = new Node(input);
        if (isEmpty()) {
            System.out.println("Error, Linked List Masih Kosong");
        } else {
            Node currentNode = head; //Mengatur Pointer ke Head
            if (position > 0) {
                //position--;
                while (position != 1) { //Algoritma traverse
                    currentNode = currentNode.next;
                    position--;
                }
                newNode.next = currentNode.next; // Nilai baru disambungkan dengan nilai setelahnya
                currentNode.next = newNode; // Memasukkan nilai baru
            } else if (position == 0) {
                addFirst(input);
            } else {
                System.out.println("Tidak Ada Index -1");
            }
        }
    }
}