package inheritance_bangun_datar.tugas_latihan_bangun_datar;

public class BelahKetupat extends BangunDatar {

    public double luasBelahKetupat() {
        return 0.5 * getdiagonal1() * getdiagonal2();
    }
    public double kelilingBelahKetupat() {
        return 4 * getsisibk();
    }
}