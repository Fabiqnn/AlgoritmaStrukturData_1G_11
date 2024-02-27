package P3.ArraySegitiga;

/**
 * ArraySegitiga
 */
public class ArraySegitiga {

    public static void main(String[] args) {

        Segitiga[] arrSegitiga = new Segitiga[4];

        arrSegitiga[0] = new Segitiga(10, 4);
        arrSegitiga[1] = new Segitiga(20, 10);
        arrSegitiga[2] = new Segitiga(15, 6);
        arrSegitiga[3] = new Segitiga(25, 10);
        
        System.out.println("================");
        for (int i = 0; i < arrSegitiga.length; i++) {
            System.out.println("Segitiga ke-" + i);
            arrSegitiga[i].tampilHasil();
        }
    }
}