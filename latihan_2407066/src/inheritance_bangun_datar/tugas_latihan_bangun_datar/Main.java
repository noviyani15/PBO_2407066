package inheritance_bangun_datar.tugas_latihan_bangun_datar;

// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.setLuasPersegi(10);
        p.setKelilingPersegi(20);
        System.out.println("Luas Persegi: " + p.luasPersegi());
        System.out.println("Keliling Persegi: " + p.kelilingPersegi());

        PersegiPanjang r = new PersegiPanjang();
        r.setLuasPersegiPanjang(10, 20);;
        r.setKelilingPersegiPanjang(10, 7);
        System.out.println("Luas Persegi Panjang: " + r.luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang: " + r.kelilingPersegiPanjang());
        
        Segitiga s = new Segitiga();
        s.setLuasSegitiga(14, 20);
        s.setKelilingSegitiga(6, 7, 4);
        System.out.println("Luas Segitiga: " + s.luasSegitiga());
        System.out.println("Keliling Segitiga: " + s.kelilingSegitiga());
        
        BelahKetupat b = new BelahKetupat();
        b.setLuasBelahKetupat(10, 20);
        b.setKelilingBelahKetupat(5);
        System.out.println("Luas BelahKetupat: " + b.luasBelahKetupat());
        System.out.println("Keliling BelahKetupat: " + b.kelilingBelahKetupat());
    }
}