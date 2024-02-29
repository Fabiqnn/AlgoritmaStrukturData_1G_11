package P3.BangunRuang;

import java.util.Scanner;

/**
 * BangunRuang
 */

public class BangunRuang {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        
        Bola[] bolaArr = new Bola[1];
        Kerucut[] kerucutArr = new Kerucut[1];
        LimasPersegi[] limasArr = new LimasPersegi[1];

        System.out.println("==================");
        for (int i = 0; i < 1; i++) {
            System.out.println("Bangun Bola");
            System.out.print("Masukkan Nilai jari jari : ");
            double rBola = sc11.nextDouble();
            bolaArr[i] = new Bola(rBola);
            System.out.println("==================");

            System.out.println("Bangun Kerucut");
            System.out.print("Masukkan Nilai jari jari : ");
            double rkerucut = sc11.nextDouble();
            System.out.print("Masukkan Nilai Sisi Miring : ");
            double sisiMrg = sc11.nextDouble();
            kerucutArr[i] = new Kerucut(rkerucut, sisiMrg);
            System.out.println("==================");

            System.out.println("Bangun Limas Persegi");
            System.out.print("Masukkan Nilai Sisi : ");
            double sisiLimas = sc11.nextDouble();
            System.out.print("Masukkan Nilai Tinggi : ");
            double tinggi = sc11.nextDouble();
            limasArr[i] = new LimasPersegi(sisiLimas, tinggi);

        }

        System.out.println("==================");
        System.out.println();
        System.out.println("==================");
        for (int i = 0; i < 1; i++) {
            System.out.println("Hasil untuk Bangun ke-" + (i + 1));
            System.out.println("Bola: ");
            System.out.printf("Luas Permukaan : %.2f\n", bolaArr[i].HitungLuasPBola());
            System.out.printf("Volume : %.2f\n", bolaArr[i].HitungVolBola());
            System.out.println("==================");
            
            System.out.println("Kerucut: ");
            System.out.printf("Luas Permukaan : %.2f\n", kerucutArr[i].HitungLuasPKerucut());
            System.out.printf("Volume : %.2f\n", kerucutArr[i].HitungVolKerucut());
            System.out.println("==================");           
            
            System.out.println("Limas Persegi: ");
            System.out.printf("Luas Permukaan : %.2f\n", limasArr[i].HitungLuasPLimas());
            System.out.printf("Volume : %.2f\n", limasArr[i].HitungVolLimas());
            System.out.println("==================");
            
        }
        
    }
}