package P8;

import java.util.Scanner;

/**
 * Utama11
 */
public class Utama11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Gudang11 gudang = new Gudang11(11);
        boolean perulangan = true;

        while (perulangan) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
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
                    perulangan = false;
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        }
    }
}