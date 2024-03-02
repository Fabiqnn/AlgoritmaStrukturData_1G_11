package P3.Mahasiswa;

public class Database {
    public String nama;
    public char kelamin;
    public String nim;
    public double ipk;

    public Database(String nama, String nim, char kelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    }

    public void tampilHasil() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelamin : " + kelamin);
        System.out.printf("IPK : %.2f\n", ipk);    
    }
}
 

