package P14.BinaryTreeArray;

/**
 * BinaryTreeMain11
 */
public class BinaryTreeMain11 {

    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("In Order Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}