package P3.BangunRuang;

public class Kerucut {
    public double jariJari;
    public double sisiMiring;
    
    public Kerucut(double r, double sisiMiring) {
        jariJari = r;
        this.sisiMiring = sisiMiring;
    }

    public double HitungLuasPKerucut() {
        double luasPermukaan = Math.PI * jariJari * (jariJari + sisiMiring);
        return luasPermukaan;
    }

    public double HitungVolKerucut() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari / 2, 2));
        double vol = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        return vol;
    }

}
