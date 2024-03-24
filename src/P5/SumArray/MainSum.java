package P5.SumArray;

import java.util.Scanner;

/**
 * MainSum
 */
public class MainSum {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Bulan : ");
        int bulan = sc11.nextInt();
        
        sum sm = new sum(bulan);
        System.out.println("-------------------------");
        for (int i = 0; i < sm.bulan; i++) {
            System.out.print("Masukkan Keuntungan Bulan Ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc11.nextDouble();
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("==Algoritma Brute Force==");
        System.out.printf("Total Keuntungan Perusahaan Selama %d Bulan Adalah : %.2f juta\n", sm.bulan, sm.totalBF(sm.keuntungan));
        System.out.println("----------------------------");
        System.out.println("==Algoritma Divide Conquer==");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm.bulan + " Bulan Adalah : " + sm.totalDC(sm.keuntungan, 0, sm.bulan - 1) + " Juta");
    }
}