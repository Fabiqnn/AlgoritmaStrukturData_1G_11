package P8;

import java.util.Scanner;

/**
 * Utama11
 */
public class Utama11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        boolean perulangan = true;

        System.out.println("=======Besar Gudang=======");
        System.out.println("Tentukan Kapasitas Gudang");
        int kapasitas = sc11.nextInt();
        sc11.nextLine();
        Gudang11 gudang = new Gudang11(kapasitas);

        while (perulangan) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Data Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = sc11.nextInt();
            sc11.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=======Tambah Barang=======");
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = sc11.nextInt();
                    sc11.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = sc11.nextLine();
                    System.out.print("Masukkan Kategori Barang: ");
                    String Kategori = sc11.nextLine();
                    Barang11 barangBaru = new Barang11(kode, nama, Kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.peeking();
                    break;

                case 5:
                    perulangan = false;
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        }
    }
}