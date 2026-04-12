package latihan_pbo.latihan_inherentance;

public class Main {
     public static void main(String[] args) {
        bangunruang bRuang = new bangunruang (10, 5, 4);

        bRuang.tampilkanInfoRuang();

        System.out.println("Luas Alas : " + bRuang.hitungLuas());
        System.out.println("Volume dari class parent : " + bRuang.hitungVolume());
        System.out.println("Volume dari class parent : " + bRuang.hitungVolume2());
    }   
}
