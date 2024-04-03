package P6.LatihanPraktikum;

/**
 * Hotel
 */
public class Hotel {

    public String nama;
    public String kota;
    public int harga;
    public double bintang;

    public Hotel(String nama, String kota, int harga, double bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public void tampil() {
        System.out.println("Nama Hotel : " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga : " + harga);
        System.out.printf("Bintang : %.1f\n", bintang);
    }
}