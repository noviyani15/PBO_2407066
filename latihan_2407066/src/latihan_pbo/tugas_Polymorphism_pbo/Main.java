package latihan_pbo.tugas_Polymorphism_pbo;

public class Main {
    public static void main(String[] args) {
        BangunDatar [] bDatar = {
            new Persegi(5),
            new PersegiPanjang(4, 4),
            new Segitiga(10, 4)
        };

        for (BangunDatar b : bDatar) {
            b.tampilkanHasil();
            System.out.println(" ");
        }
    }   
}
