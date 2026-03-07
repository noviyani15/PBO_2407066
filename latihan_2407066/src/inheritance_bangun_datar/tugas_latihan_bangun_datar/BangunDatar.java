package inheritance_bangun_datar.tugas_latihan_bangun_datar;

public class BangunDatar {
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double diagonal1;
    private double diagonal2;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double sisibk;


    //persegi
    public double getSisi () {
        return sisi;
    }
    public void setLuasPersegi(double sisi){
        this.sisi = sisi;
    }
    public void setKelilingPersegi(double sisi){
        this.sisi = sisi;
    }

    //persegi panjang
    public double getPanjang () {
        return panjang;
    }
    public double getLebar () {
        return lebar;
    }
    public void setLuasPersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void setKelilingPersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //segitiga
    public double getalas () {
        return alas;
    }
    public double gettinggi() {
        return tinggi;
    }
    public double getsisi1() {
        return sisi1;
    }
     public double getsisi2() {
        return sisi2;
    }
     public double getsisi3() {
        return sisi3;
    }
    public void setLuasSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void setKelilingSegitiga(double s1, double s2, double s3) {
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    // Belah ketupat
    public double getdiagonal1 () {
        return diagonal1;
    }
    public double getdiagonal2 () {
        return diagonal2;
    }
    public void setLuasBelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public double getsisibk() {
        return sisibk;
    }
    public void setKelilingBelahKetupat(double sisibk) {
        this.sisibk = sisibk;
    }
}