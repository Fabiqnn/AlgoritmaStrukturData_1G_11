package P7.TestSearching;

import java.util.Scanner;

/**
 * BukuMain11
 */
public class BukuMain11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Scanner sc11Int = new Scanner(System.in);

        PencarianBuku11 data = new PencarianBuku11();
        int jmlBuku = 5;

        System.out.println("======================================================");
        System.out.println("Masukkan Data Buku Secara Urut dari Kode Buku Terkecil");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("=================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = sc11Int.nextInt();
            System.out.print("Judul Buku\t: ");
            String judulBuku = sc11.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = sc11Int.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = sc11.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = sc11Int.nextInt();

            Buku11 m = new Buku11(judulBuku, pengarang, kodeBuku, tahunTerbit, stock);
            data.tambah(m);
        }
        System.out.println("======================================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();
        System.out.println("======================================================");
        System.out.println();
        System.out.println("====Cari Data====");
        System.out.print("Masukkan Kode Buku yang dicari : ");
        int cari = sc11Int.nextInt();
        System.out.println("===Menggunakan Sequential Search===");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        System.out.println("=====================================");
        data.TampilData(cari, posisi);

        System.out.println();
        System.out.println("====Cari Buku====");
        System.out.print("Masukkan Judul Buku yang Dicari : ");
        String cariJudul = sc11.nextLine();
        Buku11 dataBuku11 = data.FindBuku(cariJudul);
        dataBuku11.tampilDataBuku();
    }
}