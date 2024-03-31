package P6.Buble_Selection_InsertionSort;


/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2016, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa yang Belum di Sorting : ");
        System.out.println("======================");
        list.tampil();

        System.out.println();

        System.out.println("Data Mahasiswa yang Sudah Disorting Buble Berdasarkan IPK : ");
        System.out.println("======================");
        list.bubleSort();
        list.tampil();

        System.out.println();
        
        System.out.println("Data Mahasiswa yang Sudah Disorting Selection Berdasarkan IPK : ");
        System.out.println("======================");
        list.selectionSort();
        list.tampil();
        
        System.out.println();
        
        System.out.println("Data Mahasiswa yang Sudah Disorting Insertion Berdasarkan IPK : ");
        System.out.println("======================");
        list.insertionSort();
        list.tampil();
        
    }
}