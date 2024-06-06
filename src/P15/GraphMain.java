package P15;

import java.util.Scanner;

/**
 * GraphMain
 */
public class GraphMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph gedung = new Graph(6);
        
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0); // Degree harus disesuaikan dengan jenis graf yang digunakan.
        gedung.printGraph();
        gedung.removeEdge(1, 3); // Hasil Running Langkah ke 7
        gedung.printGraph();

        System.out.print("Masukkan Gedung Asal (Dalam Angka) : ");
        int gedungAsal = sc.nextInt();
        System.out.print("Masukkan Gedung Tujuan (Dalam Angka) : ");
        int gedungTujuan = sc.nextInt();
        gedung.printRelation(gedungAsal, gedungTujuan);


    }
}