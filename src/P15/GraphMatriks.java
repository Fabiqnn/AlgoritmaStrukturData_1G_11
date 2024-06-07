package P15;

/**
 * GraphMatriks
 */
public class GraphMatriks {

    int vertex;
    int[][] matrix;

    public GraphMatriks(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matrix[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": " );
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matrix[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int inDegree = 0 , outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[i][asal] != 0) {
                inDegree++;
            }
        }

        for (int i = 0; i < vertex; i++) {
            if (matrix[asal][i] != 0) {
                outDegree++;
            }
        }
        System.out.println("InDegree Dari Gedung " + (char) ('A' + asal) + ": " + inDegree);
        System.out.println("OutDegree Dari Gedung " + (char) ('A' + asal) + ": " + outDegree);
        System.out.println("Degree Dari Gedung " + (char) ('A' + asal) + ": " + (inDegree + outDegree));
    }
}