package P3.Mahasiswa;

import java.util.Scanner;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Database[] databaseArr = new Database[3];

        for (int i = 0; i < databaseArr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Nama : ");
            String nama = sc11.nextLine();
            System.out.print("NIM : ");
            String nim = sc11.nextLine();
            System.out.print("Jenis Kelamin : ");
            char gender = sc11.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = sc11.nextDouble();
            sc11.nextLine();
            databaseArr[i] = new Database(nama, nim, gender, ipk);
        }

        System.out.println("====================");
        for (int i = 0; i < databaseArr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            databaseArr[i].tampilHasil();
            System.out.println("====================");
        }
        System.out.println("====================");

        System.out.printf("Rata - Rata IPK : %.2f\n", Database.rataRataIPK());
        
        Database MhsTerbaik = Database.cariMhsTerbaik(databaseArr);
        System.out.println("== Mahasiswa Terbaik ==");
        MhsTerbaik.tampilHasil();

    }
}