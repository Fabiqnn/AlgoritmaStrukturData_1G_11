package P2;

/**
 * Buku11
 */
public class Buku11 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    public Buku11() {

    }

    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud; 
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;  
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println("Harga Buku: " + hitungDiskon());
        System.out.println("Diskon: " + hitungDiskon());
        System.out.println("Total Harga: " + hitungHargaBayar());
    }
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        } 
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    int hitungHargaTotal() {
        int hargaTot = terjual * harga;
        return hargaTot;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 150000) {
            double diskon = hitungHargaTotal() * 0.12;
            int intDiskon = (int)diskon;
            return intDiskon;
        } else if ((hitungHargaTotal() > 75000) && (hitungHargaTotal() <= 150000)) {
            double diskon = hitungHargaTotal() * 0.05;
            int intDiskon = (int)diskon;
            return intDiskon;
        } else {
            double diskon = hitungHargaTotal() * 0;
            int intDiskon = (int)diskon;
            return intDiskon;
        }
    }

    int hitungHargaBayar() {
        int hargaFinal = hitungHargaTotal() - hitungDiskon();
        return hargaFinal;
    }
}
