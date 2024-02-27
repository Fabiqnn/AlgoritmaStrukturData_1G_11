package P3.ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga() {

    }
    
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public int hitungKeliling() {
        return alas + tinggi + sisiMiring();
    }

    public int sisiMiring() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        int intSisiMiring = (int) sisiMiring;
        return intSisiMiring;
    }

    public void tampilHasil() {
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println("================");
    }
    
}
