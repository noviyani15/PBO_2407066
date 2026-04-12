package latihan_pbo.tugas_pbo_inherintance;

public class Main {
    public static void main(String[] args) {
        BangunRuang bRuang = new BangunRuang(10, 5, 4);

        System.out.println("Luas Alas : " + bRuang.hitungLuas());
        System.out.println("Volume : " + bRuang.hitungVolume());
    }
}