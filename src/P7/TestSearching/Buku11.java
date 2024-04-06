package P7.TestSearching;

/**
 * Buku
 */
public class Buku11 {

    public String judul;
    public String pengarang;
    public int kodeBuku;
    public int tahunTerbit;
    public int stock;

    public Buku11(String judul, String pengarang, int kodeBuku, int tahunTerbit, int stock) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.kodeBuku = kodeBuku;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=================");
        System.out.println("Kode Buku \t: " + kodeBuku);
        System.out.println("Judul Buku \t: " + judul);
        System.out.println("Tahun Terbit \t: " + tahunTerbit);
        System.out.println("Pengarang \t: " + pengarang);
        System.out.println("Stock \t\t: " + stock);
    }
}