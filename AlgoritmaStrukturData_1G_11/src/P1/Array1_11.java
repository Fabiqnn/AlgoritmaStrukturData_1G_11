package P1;

/**
 * Array1_11
 */
import java.util.*;
public class Array1_11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        double[][] Nilai = new double[4][8];
        String[] NilaiHuruf = new String[8];
        int[] SKS = {2, 2, 2, 2, 2, 2, 3, 3};
        

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");
        System.out.print("Masukkan Nilai MK Bahasa Inggris: ");
        Nilai[0][0] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK Keselamatan dan Kesehatan Kerja: ");
        Nilai[0][1] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK Konsep Tekonologi Informasi: ");
        Nilai[0][2] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK CTPS: ");
        Nilai[0][3] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK Dasar Pemrograman: ");
        Nilai[0][4] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK Pancasila: ");
        Nilai[0][5] = sc11.nextDouble();
        System.out.print("Masukkan Nilai MK Matematika Dasar: ");
        Nilai[0][6] = sc11.nextDouble();;
        System.out.print("Masukkan Nilai MK Praktikum Dasar Pemrograman: ");
        Nilai[0][7] = sc11.nextDouble();

        for (int i = 0; i < Nilai[0].length; i++) {
            if ((Nilai[0][i]>80) && (Nilai[0][i]<=100)) {
                Nilai[1][i] = 4;
                NilaiHuruf[i] = "A";
            } else if ((Nilai[0][i]>73) && (Nilai[0][i]<=80)) {
                Nilai[1][i] = 3.5;
                NilaiHuruf[i] = "B+";
            } else if ((Nilai[0][i]>65) && (Nilai[0][i]<=73)) {
                Nilai[1][i] = 3;
                NilaiHuruf[i] = "B";
            } else if ((Nilai[0][i]>60) && (Nilai[0][i]<=65)) {
                Nilai[1][i] = 2.5;
                NilaiHuruf[i] = "C+";
            } else if ((Nilai[0][i]>50) && (Nilai[0][i]<=60)) {
                Nilai[1][i] = 2;
                NilaiHuruf[i] = "C";
            } else if ((Nilai[0][i]>39) && (Nilai[0][i]<=50)) {
                Nilai[1][i] = 1;
                NilaiHuruf[i] = "D";
            } else {
                Nilai[1][i] = 0;
                NilaiHuruf[i] = "E";
            }
        } 
        for (int i = 0; i < Nilai[2].length; i++) {
            Nilai[2][i] = Nilai[1][i] * SKS[i];
        }
        double BobotSKS = 0;
        for (int i = 0; i < Nilai[2].length; i++) {
            BobotSKS += Nilai[2][i];
        }
        double TotalSKS = 0;
        for (int i = 0; i < SKS.length; i++) {
            TotalSKS += SKS[i];
        }
        double IPSemester = BobotSKS/TotalSKS;
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        
        System.out.println("MK\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai\t\tSKS");
        
        System.out.println("Bahasa Inggris\t\t\t\t" + Nilai[0][0] + "\t\t\t"+ NilaiHuruf[0] + "\t\t\t"+ Nilai[1][0]+ "\t\t\t" + SKS[0]);
        System.out.println("Keselamatan dan Kesehatan Kerja\t\t" + Nilai[0][1] + "\t\t\t"+ NilaiHuruf[1] + "\t\t\t"+ Nilai[1][1]+ "\t\t\t" + SKS[1]);
        System.out.println("Konsep Teknologi Informasi\t\t" + Nilai[0][2] + "\t\t\t"+ NilaiHuruf[2] + "\t\t\t"+ Nilai[1][2]+ "\t\t\t" + SKS[2]);
        System.out.println("CTPS\t\t\t\t\t" + Nilai[0][3] + "\t\t\t"+ NilaiHuruf[3] + "\t\t\t"+ Nilai[1][3]+ "\t\t\t" + SKS[3]);
        System.out.println("Dasar Pemrograman\t\t\t" + Nilai[0][4] + "\t\t\t"+ NilaiHuruf[4] +  "\t\t\t"+Nilai[1][4]+ "\t\t\t" + SKS[4]);
        System.out.println("Pancasila\t\t\t\t" + Nilai[0][5] + "\t\t\t"+ NilaiHuruf[5] + "\t\t\t"+ Nilai[1][5]+ "\t\t\t" + SKS[5]);
        System.out.println("Matematika Dasar\t\t\t" + Nilai[0][6] + "\t\t\t"+ NilaiHuruf[6] + "\t\t\t"+ Nilai[1][6]+ "\t\t\t" + SKS[6]);
        System.out.println("Praktikum Dasar Pemrograman\t\t" + Nilai[0][7] + "\t\t\t"+ NilaiHuruf[7] + "\t\t\t"+ Nilai[1][7]+ "\t\t\t" + SKS[7]);
        System.out.println("====================");
        System.out.printf("IP: %.2f\n", IPSemester);
    }
}