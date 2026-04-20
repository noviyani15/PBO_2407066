package latihan_pbo.tugas_Polymorphism_pbo;

public class Persegi extends BangunDatar {

    public Persegi (double varA) {
        super(varA);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkanHasil() {
        System.out.println("Persegi");
        System.out.println("============");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
    }
}
