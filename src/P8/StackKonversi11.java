package P8;

/**
 * StackKonversi11
 */
public class StackKonversi11 {

    int[] tumpukanBiner;
    int size;
    int top = -1;

    public StackKonversi11() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top ++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Stack Kosong");
            return -1;
        }
    }
}