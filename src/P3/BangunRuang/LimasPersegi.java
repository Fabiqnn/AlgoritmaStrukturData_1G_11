package P3.BangunRuang;

public class LimasPersegi {
    public double sisiAlas;
    public double tinggi;

    public LimasPersegi(double sisi, double tinggi) {
        sisiAlas = sisi;
        this.tinggi = tinggi;
    }

    public double HitungLuasPLimas() {
        double keliling = sisiAlas * 4;
        double sisiMiring = Math.sqrt(Math.pow(sisiAlas / 2.0, 2) + Math.pow(tinggi, 2));
        double luasPermukaan = Math.pow(sisiAlas, 2) + (0.5 * keliling * sisiMiring);
        return luasPermukaan;
    }

    public double HitungVolLimas() {
        double vol =  (1.0 / 3.0) * Math.pow(sisiAlas, 2) * tinggi;
        return vol;
    }

}
