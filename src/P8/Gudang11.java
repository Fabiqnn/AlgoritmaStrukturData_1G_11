package P8;

/**
 * Gudang11
 */
public class Gudang11 {

    Barang11[] tumpukan;
    int size;
    int top;

    public Gudang11(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang11[kapasitas];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang11 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil Ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Gudang Sudah Penuh!");
        }
    }

    public Barang11 ambilBarang() {
        if (!cekKosong()) {
            Barang11 diambil = tumpukan[top];
            top--;
            System.out.println("Barang " + diambil.nama + " Diambil Dari Gudang");
            return diambil;
        } else {
            System.out.println("Tidak Ada Barang di Gudang!");
            return null;
        }
    }

    public Barang11 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang11 peek = tumpukan[top];
            System.out.println("Barang Teratas " + peek.nama);
            return peek;
        } else {
            System.out.println("Tidak Ada Barang Di Gudang");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("==========List Barang==========");
            for (int i = top; i >= 0; i--) { // ini yang diganti
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }
}