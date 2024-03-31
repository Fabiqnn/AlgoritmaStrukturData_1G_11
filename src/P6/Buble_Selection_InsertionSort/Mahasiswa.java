package P6.Buble_Selection_InsertionSort;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    public String nama;
    public int thnMasuk;
    public int umur;
    public double ipk;

    public Mahasiswa(String nama, int thn, int umur, double ipk) {
        this.nama = nama;
        this.thnMasuk = thn;
        this.umur = umur;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + ipk);
    }
}