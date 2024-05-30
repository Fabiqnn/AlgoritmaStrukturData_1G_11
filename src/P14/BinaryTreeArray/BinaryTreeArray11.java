package P14.BinaryTreeArray;

/**
 * BinaryTreeArray11
 */
public class BinaryTreeArray11 {

    int[] data;
    int idxLast;

    public BinaryTreeArray11() {
        data = new int[10];
    }

    public void populateData(int[] data, int idxLast) { // tambah data yang berasal dari array main
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}