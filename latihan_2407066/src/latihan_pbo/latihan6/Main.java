package latihan_pbo.latihan6;

public class Main {
    public static void main(String[] args) {
        MenuItem[] m = {
            new MenuItem("Ketoprak", 12000, 3),
            new MenuItem("Nasi Goreng", 15000, 4),
            new MenuItem("Sogem", 8000, 5)
        };

        // =====List Menu====
        System.out.println("====List Menu===="); 
        for (int i = 0; i < m.length; i++) {
            m[i].tampilkanMenu();
        }

        //====Daftar Pesanan====
        System.out.println("===Daftar Pesanan===");

        int total = 0;
        for (MenuItem item: m) {
            item.tampilkanHasil();
            total += item.hitungTotal();
        };

        System.out.println("--------------------------------------");
        System.out.println("Total = " + total);
        
    }
    
}
