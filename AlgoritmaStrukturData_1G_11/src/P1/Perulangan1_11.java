package P1;
/**
 * Perulangan1_11
 */
import java.util.*;
public class Perulangan1_11 {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        double Nim;
        System.out.print("Masukkan NIM Anda: ");

        Nim = sc11.nextDouble();
        System.out.println("=====================");
        int DuaDigit = (int) (Nim % 100);
        if (DuaDigit < 10) {
            DuaDigit += 10;
            System.out.println("N = " + DuaDigit);
            for (int i = 1 ; i <= DuaDigit; i++) {
                if (i % 2 == 1) {
                    System.out.print(" *");
                } else if ((i == 6) || (i == 10)) {
                    continue;
                } else {
                    System.out.print(" "+ i);
                }
            }
        } else {
            System.out.println("N = " + DuaDigit);
            for (int i = 1 ; i <= DuaDigit; i++) {
                if (i % 2 == 1) {
                    System.out.print(" *");
                } else if ((i == 6) || (i == 10)) {
                    continue;
                } else {
                    System.out.print(" "+ i);
                }
            }
        }
    }
}