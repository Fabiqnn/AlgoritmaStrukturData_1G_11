package P3;

/**
 * ArrayObject
 */
import java.util.*;
public class ArrayObject {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc11.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc11.nextInt();
        }
        System.out.println("========================");

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang : " + ppArray[i].panjang + " Lebar : " + ppArray[i].lebar);
            System.out.println("========================");

        }
        
    }
}