package P15;

/**
 * Graph
 */
public class Graph {

    int vertex;
    DoubleLinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // jika graf yang dibuat adalah undirected graf maka menggunakan kode ini
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) {
        try {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                // in Degree
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        totalIn++;
                    }
                }
                // outDegree
                for (k = 0; k < list[asal].size(); k++) {
                    list[asal].get(k);
                }
                totalOut = k;
            }
            System.out.println("InDegree Dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
            System.out.println("OutDegree Dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
            System.out.println("Degree Dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
            // jika graph merupakan undirected graph
            // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " +
            // list[asal].size());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void removeEdge(int asal, int tujuan) {
        try {
            for (int i = 0; i < vertex; i++) {
                if (i == tujuan) {
                    list[asal].remove(tujuan);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph Berhasil Dikosongkan");
    }

    public void printGraph() {
        try {
            for (int i = 0; i < vertex; i++) {
                if (list[i].size() > 0) {
                    System.out.println("Gedung " + (char) ('A' + i) + " Terhubung Dengan ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}