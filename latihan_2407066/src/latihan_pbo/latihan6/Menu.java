package latihan_pbo.latihan6;

public class Menu {
    private String nama;
    private int harga;

    //constructor
    public Menu (String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getnama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }

    public int getharga() {
        return harga;
    }
    public void setharga(int harga) {
        this.harga = harga;
    }

    public int hitungTotal() {
        return 0;
    }
    public void tampilkanHasil() {
        return ;
    }

    public void tampilkanMenu() {
        System.out.println("Menu");
        System.out.println("==============");
        System.out.println("nama: " + nama);
        System.out.println("harga: " + harga);
        System.out.println();
    }
}