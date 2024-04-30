package P9.Praktikum2;

import java.util.Scanner;

/**
 * QueueMain
 */
public class QueueMain {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan Kapasitas Queue: ");
        int jumlah = sc11.nextInt();
        Queue antri = new Queue(jumlah);

        do {
            Menu();
            pilih = sc11.nextInt();
            sc11.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc11.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc11.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc11.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc11.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc11.nextDouble();
                    sc11.nextLine();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;

                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.noRek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang Keluar: " + data.noRek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }

                case 3: 
                    antri.peek();
                    break;
                    
                case 4: 
                    antri.print();
                    break;

                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

    public static void Menu() {
        System.out.println("\nMasukkan Operasi yang Diinginkan: ");
        System.out.println("1. Antrian Masuk");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("---------------------");
    }
}