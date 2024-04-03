package P6.LatihanPraktikum;

/**
 * HotelService
 */
public class HotelService {
    public Hotel[] listHotel = new Hotel[5];
    public static int idx;

    public void tambah(Hotel h) {
        if (idx < listHotel.length) {
            listHotel[idx] = h;
            idx++;
        } else {
            System.out.println("Data Penuh");
        }
    }

    public void tampil() {
        for (Hotel hotel : listHotel) {
            hotel.tampil();
            System.out.println("======================");
        }
    }

    public void bubleSortHarga() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            for (int j = 0; j < listHotel.length - i -1; j++) {
                if (listHotel[j].harga > listHotel[j + 1].harga) {
                    Hotel temp = listHotel[j];
                    listHotel[j] = listHotel[j + 1];
                    listHotel[j + 1] = temp;
                }
            }
        }
    }
    
    public void selectionSortBintang() {
        for (int i = 0; i < listHotel.length; i++) {
            int indexMax = i;
            for (int j = i+1; j < listHotel.length; j++) {
                if (listHotel[j].bintang > listHotel[indexMax].bintang) {
                    indexMax = j;
                }
            }
            Hotel temp = listHotel[indexMax];
            listHotel[indexMax] = listHotel[i];
            listHotel[i] = temp;
        }
    }
}