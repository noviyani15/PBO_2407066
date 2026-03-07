package latihan_pbo.latihan1;

// Import java.util.Scanner

class Cafe{
    String nama;
    String alamat;

    Cafe (String nama, String alamat){
    this.nama = nama;
    this.alamat = alamat;
    System.out.println(nama);
    System.out.println(alamat);
    }

    // method
    void buka(){
    System.out.println(" Cafe " + nama + " Sudah buka ");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        // this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

// constructor

public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //Cafe cafe = new Cafe();

        //System.out.println("Masukan nama cafe: ");
        //cafe.nama = input.nextLine();

        //System.out.println("nama yang diinput adalah : " + cafe.nama);
        //cafe.buka();

        // Cafe cafe1 = new Cafe();
        // cafe1.nama = "Kopi Kenangan";
        // cafe1.alamat = "Indramayu";

        // cafe2.nama = "Janji Jiwa";
        // cafe2.alamat = "Indramayu";

        // cafe3.nama = "liren Kopi";
        // cafe3.alamat = "Indramayu";

        // cafe4.nama = "Kopi di Hati";
        // cafe4.alamat = "Indramayu";

        // System.out.println("Nama Cafenya adalah : " + cafe1.nama);
        // System.out.println("Alamatnya ada di : " + cafe1.alamat);

         // System.out.println("Nama Cafenya adalah : " + cafe2.nama);
        // System.out.println("Alamatnya ada di : " + cafe2.alamat);

         // System.out.println("Nama Cafenya adalah : " + cafe3.nama);
        // System.out.println("Alamatnya ada di : " + cafe3.alamat);

         // System.out.println("Nama Cafenya adalah : " + cafe4.nama);
        // System.out.println("Alamatnya ada di : " + cafe4.alamat);

        Cafe cafe5 = new Cafe( "Halaman", "Indramayu");
        cafe5.setNama("Ryu");
        cafe5.buka();
    }
}