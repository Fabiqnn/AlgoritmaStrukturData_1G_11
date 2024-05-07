package P11;

/**
 * SLLMain
 */
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.Print();
        singLL.addFirst(890);
        singLL.Print();
        singLL.addLast(760);
        singLL.Print();
        singLL.addFirst(700);
        singLL.Print();
        singLL.insertAfter(700, 999);
        singLL.Print();
        singLL.insertAt(833, 3);
        singLL.Print();

        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(760));

        singLL.remove(999);
        singLL.Print();
        singLL.removeAt(0);
        singLL.Print();
        singLL.removeFirst();
        singLL.Print();
        singLL.removeLast();
        singLL.Print();
    }
}