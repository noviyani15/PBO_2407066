package latihan_pbo.latihan_inherentance;

public class bangundatar {
    //2 atribut
    protected double panjang;
    protected double lebar;
    
    //constructor
    public bangundatar (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    // //panjang
    // public double getPanjang () {
    //     return panjang;
    // }
    // public void sethitungluas (double panjang) {
    //     this.panjang = panjang;
    // }

    // //luas
    // public double getlebar () {
    //     return lebar;
    // }
    // public void setlebar (double lebar) {
    //     this.lebar = lebar;
    // }

    //method
    public double hitungLuas() {
        return panjang * lebar * 2;
    }

    public void tampilkanHasil() {
        System.out.println("panjang: " + panjang);
        System.out.println("lebar: " + lebar);
    }
    
}
