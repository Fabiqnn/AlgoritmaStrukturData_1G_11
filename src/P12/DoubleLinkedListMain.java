package P12;

/**
 * DoubleLinkedListMain
 */
public class DoubleLinkedListMain {

    public static void main(String[] args) {
        try {
            DoubleLinkedList dll = new DoubleLinkedList();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.addFirst(3);
            dll.addlast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.clear();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
    
            System.out.println(); // percobaan 2

            System.out.println("===================================");
            dll.addlast(50);
            dll.addlast(40);
            dll.addlast(10);
            dll.addlast(20);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.removeLast();
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.remove(1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");

            dll.clear(); // Percobaan 3 

            System.out.println();
            System.out.println("===================================");
            dll.addFirst(3);
            dll.addlast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("===================================");
            System.out.println("Data Awal Pada Linked List Adalah : " + dll.getFirst());
            System.out.println("Data Akhir Pada Linked List Adalah : " + dll.getLast());
            System.out.println("Data Indeks ke-1 Pada Linked List Adalah : " + dll.get(1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}