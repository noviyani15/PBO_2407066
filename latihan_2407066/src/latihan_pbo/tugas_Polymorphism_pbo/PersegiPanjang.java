package latihan_pbo.tugas_Polymorphism_pbo;

public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang (double varA, double varB) {
        super(varA, varB);
    }
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Persegi Panjang");
        System.out.println("===================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
    }
}
