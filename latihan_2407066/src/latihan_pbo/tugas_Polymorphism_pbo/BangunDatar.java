package latihan_pbo.tugas_Polymorphism_pbo;

public class BangunDatar {
    private double varA;
    private double varB;

    //Overloading
    //Constructor
    public BangunDatar (double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar (double varA) {
        this.varA = varA;
    }

    public double getVarA() { 
        return varA; 
    }
    public void setVarA(double varA) { 
        this.varA = varA; 
    }

    public double getVarB() { 
        return varB; 
    }
    public void setVarB(double varB) { 
        this.varB = varB; 
    }

    //method hitungLuas dengan nilai defaul 0
    public double hitungLuas() {
        return 0;
    }

    public void tampilkanHasil() {
        System.out.println("Bangun Datar");
        System.out.println("==============");
        System.out.println("varA: " + varA);
        System.out.println("varB :" + varB);
    }
}