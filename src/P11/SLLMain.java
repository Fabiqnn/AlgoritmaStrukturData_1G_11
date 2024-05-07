package P11;
/**
 * SLLMain
 */
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.Print();;
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
    }
}