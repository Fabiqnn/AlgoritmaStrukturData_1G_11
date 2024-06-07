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
}