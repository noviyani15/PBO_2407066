package latihan_pbo.tugas_pbo_inherintance;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    //Construktor
    public BangunRuang (double Panjang, double Lebar, double Tinggi) {
        super(Panjang, Lebar); // memanggil dari class BangunDatar
        this.tinggi = Tinggi;
    }

    @Override
    public double hitungLuas() {
        return getPanjang() * getLebar();
    }
    //method 
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}
