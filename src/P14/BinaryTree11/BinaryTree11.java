package P14.BinaryTree11;

/**
 * BinaryTree
 */
public class BinaryTree11 {
    Node11 root;
    int size;

    public BinaryTree11() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node11(data);
        } else {
            Node11 current = root;
            while (true) {
                if (data > current.data) { // jika data memiliki nilai lebih besar dari current
                    if (current.right == null) {
                        current.right = new Node11(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) { // jika data memiliki nilai lebih kecil dari current
                    if (current.left == null) {
                        current.left = new Node11(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else { // data sudah ada di dalam tree
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean result = false;
        Node11 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node11 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node11 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node11 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public Node11 getSuccessor(Node11 parent) {
        Node11 successor = parent.right;
        Node11 successorParent = parent;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != parent.right) {
            successorParent.left = successor.right;
            successor.right = parent.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data Tidak Ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) { // jika tidak ada child maka langsung lakukan delete
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // jika hanya terdapat 1 child di kanan
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // jika hanya terdapat 1 child di kiri
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;

                    }
                }
            } else { // jika terdapat 2 child
                Node11 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}