package latihan_pbo.tugas_Polymorphism_pbo;

public class Segitiga extends BangunDatar {

    public Segitiga (double varA, double varB) {
        super(varA, varB);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Segitiga");
        System.out.println("=============");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
    }
    
}
