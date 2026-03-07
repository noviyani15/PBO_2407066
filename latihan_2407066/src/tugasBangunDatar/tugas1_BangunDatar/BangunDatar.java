package tugasBangunDatar.tugas1_BangunDatar;

public class BangunDatar {
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double diagonal1;
    private double diagonal2;

    public void setPersegi(double sisi){
        this.sisi = sisi;
    }
    public double hitungLuasPersegi() {
        return sisi * sisi;
    }
    public double hitungKelilingPersegi() {
        return 4 * sisi;
    }

    public void setPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuasPanjang() {
        return panjang * lebar;
    }
    public double hitungKelilingPanjang() {
        return 2 * (panjang + lebar);
    }

    public void setSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungLuasSegitiga() {
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliligSegitiga(double s1, double s2, double s3) {
        return s1 + s2 +s3;
    }

    public void setBelahKetupat(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }
    public double hitungluasBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }
    public double hitungKelilingBelahKetupat(double sisi) {
        return 4 * sisi;
    }
    
}