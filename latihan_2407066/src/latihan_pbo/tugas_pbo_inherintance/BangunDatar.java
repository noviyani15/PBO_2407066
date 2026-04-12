package latihan_pbo.tugas_pbo_inherintance;

public class BangunDatar {
    //2 atribut
    private double panjang;
    private double lebar;
    
    //constructor
    public BangunDatar (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //panjang
    public double getPanjang () {
        return panjang;
    }
    public void setPanjang (double Panjang) {
        this.panjang = Panjang;
    }

    //luas
    public double getLebar () {
        return lebar;
    }
    public void setLebar (double Lebar) {
        this.lebar = Lebar;
    }

    //method
    public double hitungLuas() {
        return getPanjang() * getLebar();
    }
}
