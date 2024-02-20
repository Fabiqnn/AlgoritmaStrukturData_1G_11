package P1;
/**
 * Pemilihan1
 */

import java.util.*;
public class Pemilihan1_11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        boolean Lulus = true;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        float Tugas = sc11.nextFloat();
        System.out.print("Masukkan Nilai Kuis: ");
        double Kuis = sc11.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        float UTS = sc11.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        float UAS = sc11.nextFloat();
        System.out.println("=======================");
        
        System.out.println("=======================");
        if ((Tugas <= 100) && (Tugas > 0)) {
            if ((Kuis <= 100) && (Kuis > 0)) {
                if ((UTS <= 100) && (UTS > 0)) {
                    if ((UAS <= 100) && (UAS > 0)) {
                        double NilaiAkhir = (Tugas*0.2) + (Kuis*0.2) + (UTS*0.3) + (UAS*0.3);
                        System.out.println("Nilai Akhir: " + NilaiAkhir);
                        if ((NilaiAkhir>80) && (NilaiAkhir<=100)) {
                            System.out.println("Nilai Huruf: A");
                        } else if ((NilaiAkhir>73) && (NilaiAkhir<=80)) {
                            System.out.println("Nilai Huruf: B+");
                        } else if ((NilaiAkhir>65) && (NilaiAkhir<=73)) {
                            System.out.println("Nilai Huruf: B");
                        } else if ((NilaiAkhir>60) && (NilaiAkhir<=65)) {
                            System.out.println("Nilai Huruf: C+");
                        } else if ((NilaiAkhir>50) && (NilaiAkhir<=60)) {
                            System.out.println("Nilai Huruf: C");
                        } else if ((NilaiAkhir>39) && (NilaiAkhir<=50)) {
                            Lulus = false;
                            System.out.println("Nilai Huruf: D");
                        } else {
                            Lulus = false;
                            System.out.println("Nilai Huruf: E");
                        }
                        System.out.println("=======================");
                        System.out.println("=======================");
                        if (Lulus == false) {
                            System.out.println("Maaf Anda TIDAK LULUS");
                        } else {
                            System.out.println("Selamat Anda LULUS");
                        }
                    }
                }
            }
        } else {
            System.out.println("Nilai TIdak Valid");
        }
    }
}