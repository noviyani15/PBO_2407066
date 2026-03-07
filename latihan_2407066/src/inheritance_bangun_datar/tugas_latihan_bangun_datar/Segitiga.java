package inheritance_bangun_datar.tugas_latihan_bangun_datar;

public class Segitiga extends BangunDatar {

    public double luasSegitiga() {
        return 0.5 * getalas() * gettinggi();
    }
    public double kelilingSegitiga() {
        return getsisi1() + getsisi2() + getsisi3();
    }

}