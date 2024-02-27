package P3;

/**
 * ArrayObject
 */
import java.util.*;
public class ArrayObject {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.println("Masukkan panjang array : ");
        int banyakArr = sc11.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[banyakArr];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc11.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc11.nextInt();
        }
        System.out.println("========================");

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang : " + ppArray[i].panjang + " Lebar : " + ppArray[i].lebar);
            System.out.println("========================");

        }
        
    }
}