package P5.Pangkat;

import java.util.Scanner;

/**
 * MainPangkat
 */
public class MainPangkat {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukkan Jumlah Elemen yang Dihitung : ");
        int elemen = sc11.nextInt();

        Pangkat[] pangkatArr = new Pangkat[elemen];
        for (int i = 0; i < pangkatArr.length; i++) {
            System.out.print("Masukkan Nilai yang Akan Dipangkat: ");
            int nilai = sc11.nextInt();
            System.out.print("Masukkan Nilai Pangkat : ");
            int nilaiPgkt = sc11.nextInt();
            pangkatArr[i] = new Pangkat(nilai, nilaiPgkt);
        }
        
        System.out.println("Pilih Metode Penyelesaian");
        System.out.println("1. Metode Penyelaian Brute Force");
        System.out.println("2. Metode Penyelaian Divide and Conquer");
        System.out.print("Pilihan : ");
        int pilihan = sc11.nextInt();
        for (; pilihan != 1 && pilihan != 2 ;) {
            System.out.println("Inputan Invalid");
            pilihan = sc11.nextInt();
        }
        switch (pilihan) {
            case 1:
                System.out.println("==Hasil - Pangkat Brute Force==");
                for (int i = 0; i < pangkatArr.length; i++) {
                    System.out.println("Hasil Dari : " + pangkatArr[i].nilai + " Pangkat : " + pangkatArr[i].pangkat + " Adalah : ");
                    System.out.println(pangkatArr[i].pangkatBF(pangkatArr[i].nilai, pangkatArr[i].pangkat));
                }
                break;
                
            case 2:
                System.out.println("==Hasil - Pangkat Divide Conquer==");
                for (int i = 0; i < pangkatArr.length; i++) {
                    System.out.println("Hasil Dari : " + pangkatArr[i].nilai + " Pangkat : " + pangkatArr[i].pangkat + " Adalah : ");
                    System.out.println(pangkatArr[i].pangkatDC(pangkatArr[i].nilai, pangkatArr[i].pangkat));
                }
                break;
        }
    }
}