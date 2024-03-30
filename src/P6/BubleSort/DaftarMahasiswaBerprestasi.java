package P6.BubleSort;

/**
 * DaftarMahasiswaBerprestasi
 */
public class DaftarMahasiswaBerprestasi {

    public Mahasiswa[] listMhs = new Mahasiswa[5];
    public int idx;

    public void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    public void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("======================");
        }
    }

    public void bubleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j+1].ipk) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j+1];
                    listMhs[j+1] = temp;
                }
            }
        }
    }
}