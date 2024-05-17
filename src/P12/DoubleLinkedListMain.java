package P12;

/**
 * DoubleLinkedListMain
 */
public class DoubleLinkedListMain {

    public static void main(String[] args) {
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

        System.out.println();
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
    }
}