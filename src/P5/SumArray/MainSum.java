package P5.SumArray;

import java.util.Scanner;

/**
 * MainSum
 */
public class MainSum {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int jmlP = sc11.nextInt();
        sum[] sumArr = new sum[jmlP];

        for (int i = 0; i < jmlP; i++) {
            System.out.println("-------------------------");
            System.out.println("Perusahaan Ke-" + (i + 1));
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan Jumlah Bulan : ");
            int bulan = sc11.nextInt();
            System.out.println("-------------------------");
            sumArr[i] = new sum(bulan);
            for (int j = 0; j < sumArr[i].bulan; j++) {
                System.out.print("Masukkan Keuntungan Bulan Ke- " + (j + 1) + " : ");
                sumArr[i].keuntungan[j] = sc11.nextDouble();
            }
        }

        for (int i = 0; i < sumArr.length; i++) {
            System.out.println("-------------------------");
            System.out.println("Perusahaan ke- " + (i + 1));
            System.out.println("==Algoritma Brute Force==");
            System.out.printf("Total Keuntungan Perusahaan Selama %d Bulan Adalah : %.2f juta\n", sumArr[i].bulan,
                    sumArr[i].totalBF(sumArr[i].keuntungan));
            System.out.println();
            System.out.println("==Algoritma Divide Conquer==");
            System.out.println("Total Keuntungan Perusahaan Selama " + sumArr[i].bulan + " Bulan Adalah : "
                    + sumArr[i].totalDC(sumArr[i].keuntungan, 0, sumArr[i].bulan - 1) + " Juta");
            System.out.println("----------------------------");
        }
    }
}