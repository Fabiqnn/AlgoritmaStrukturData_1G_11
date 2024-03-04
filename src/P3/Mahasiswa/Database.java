package P3.Mahasiswa;

public class Database {
    public String nama;
    public char kelamin;
    public String nim;
    public double ipk;
    public static double totIPK = 0;
    public static int jmlMahasiswa = 0;

    public Database(String nama, String nim, char kelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
        jmlMahasiswa ++;
        totIPK();
    }

    public void tampilHasil() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelamin : " + kelamin);
        System.out.printf("IPK : %.2f\n", ipk);    
    }

    public double totIPK() {
        return totIPK += ipk;
    }

    public static double rataRataIPK() {
        return totIPK / jmlMahasiswa;
    }

    public static Database cariMhsTerbaik(Database[] databaseArr) {
        Database terbaik = databaseArr[0];
        for (int i = 0; i < databaseArr.length; i++) {
            if (databaseArr[i].ipk > terbaik.ipk) {
                terbaik = databaseArr[i];
            }
        }
        return terbaik;
    }
}
 

