package P7.TestSearching;

/**
 * PencarianBuku
 */
public class PencarianBuku11 {

    public Buku11[] listBuku = new Buku11[5];
    public int indx;

    public void tambah(Buku11 m) {
        if (indx < listBuku.length) {
            listBuku[indx] = m;
            indx++;
        } else {
            System.out.println("==Data Sudah Penuh==");
        }
    }

    public void tampil() {
        for (Buku11 tampilBuku : listBuku) {
            tampilBuku.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public Buku11 FindBuku(String cariJudul) {
        Buku11 posisi = listBuku[0];
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].judul.equalsIgnoreCase(cariJudul)) {
                posisi = listBuku[i];
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan Pada Index " + pos);
        } else {
            System.out.println("Data : " + x + " Tidak Ditemukan! ");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + x);
            System.out.println("Judul Buku \t: " + listBuku[pos].judul);
            System.out.println("Tahun Terbit \t: " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBuku[pos].pengarang);
            System.out.println("Stock \t\t: " + listBuku[pos].stock);
        } else {
            System.out.println("Data : " + x + " Tidak Ditemukan! ");
        }
    }
}