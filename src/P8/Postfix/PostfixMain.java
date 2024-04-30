package P8.Postfix;

import java.util.Scanner;

/**
 * PostfixMain
 */
public class PostfixMain {

    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        String p, q;
        System.out.println("Masukkan Ekspresi Matematika (Infix): ");
        q = sc11.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        Postfix11 post = new Postfix11(total);
        p = post.Konversi(q);
        System.out.println("Postfix: " + p);
    }
}