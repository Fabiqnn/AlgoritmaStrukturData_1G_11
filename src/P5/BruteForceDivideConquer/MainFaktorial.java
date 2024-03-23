package P5.BruteForceDivideConquer;

import java.util.Scanner;

/**
 * MainFaktorial
 */
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukkan Jumlah Elemen : ");
        int iJml = sc11.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < fk.length; i++) {
            System.out.print("Masukkan Nilai Data Ke-" + (i+1) + " : ");
            int iNilai = sc11.nextInt();
            fk[i] = new Faktorial(iNilai);
        }

        System.out.println("Hasil - Brute-Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Perhitungan Menggunakan Brute-Force Adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil - Divide Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Perhitungan Menggunakan Divide Conquer Adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}