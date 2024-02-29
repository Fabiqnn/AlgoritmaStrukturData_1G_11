package P3.BangunRuang;

public class Bola {
    public double jariJari;


    public Bola(double r) {
        jariJari = r;
    }

    public double HitungLuasPBola() {
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
        return luasPermukaan;
    }

    public double HitungVolBola() {
        double vol = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return vol;
    }

}
