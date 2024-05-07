package P10.Praktikum1;
import java.util.Scanner;

/**
 * QueueMain
 */
public class QueueMain {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        int pilih;

        System.out.println("Masukkan Kapasistas Queue");
        int n = sc11.nextInt();

        Queue Q = new Queue(n);

        do {
            Menu();
            pilih =  sc11.nextInt();
            sc11.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Baru: ");
                    int dataMasuk = sc11.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
            
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang Dikeluarkan: " + dataKeluar);
                        break;
                    }
            
                case 3:
                    Q.print();
                    break;
            
                case 4:
                    Q.peek();
                    break;
            
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void Menu() {
        System.out.println("\nMasukkan Operasi yang Diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("---------------------");
    }
}