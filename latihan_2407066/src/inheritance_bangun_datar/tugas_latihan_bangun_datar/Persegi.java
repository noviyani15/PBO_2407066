package inheritance_bangun_datar.tugas_latihan_bangun_datar;

public class Persegi extends BangunDatar {

    public double luasPersegi() {
        return getSisi() * getSisi();
    }

    public double kelilingPersegi() {
        return 4 * getSisi();
    }
}

