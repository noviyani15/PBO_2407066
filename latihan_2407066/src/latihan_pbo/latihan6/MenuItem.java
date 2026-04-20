package latihan_pbo.latihan6;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem (String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getjumlah() {
        return jumlah;
    }
    public int setjumlah() {
        return jumlah;
    }

    @Override
    public int hitungTotal() {
        return getharga() * getjumlah();
    }

    @Override
    public void tampilkanHasil() {
        System.out.println(getnama() + " ------> " + getharga() + " x " + jumlah + " = " + hitungTotal());
    }

    
}
