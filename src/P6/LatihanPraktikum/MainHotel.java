package P6.LatihanPraktikum;

/**
 * MainHotel
 */
public class MainHotel {

    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel[] Hotels = new Hotel[5];
        Hotels[0] = new Hotel("Oyo", "Malang", 100000, 7.0);
        Hotels[1] = new Hotel("RedDoorz", "Malang", 70000, 7.1);
        Hotels[2] = new Hotel("Grand Mercure", "Malang", 1000000, 8.9);
        Hotels[3] = new Hotel("Swiss-Belinn", "Malang", 500000, 9.0);
        Hotels[4] = new Hotel("Ijen Suites", "Malang", 700000, 8.8);

        for (int i = 0; i < Hotels.length; i++) {
            list.tambah(Hotels[i]);
        }

        System.out.println("List Hotel : ");
        System.out.println("======================");
        list.tampil();

        System.out.println();
        
        System.out.println("List Hotel Dari Harga Termurah : ");
        System.out.println("======================");
        list.bubleSortHarga();
        list.tampil();

        System.out.println();
        
        System.out.println("List Rating Bintang Tertinggi ke Terendah:");
        System.out.println("======================");
        list.selectionSortBintang();
        list.tampil();
    }
}