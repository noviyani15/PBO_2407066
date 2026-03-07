package latihan_pbo.tugasBangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bDatar = new BangunDatar();
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                bDatar.setPersegi(sisi);
                System.out.println("Luas: " + bDatar.hitungLuasPersegi());
                System.out.println("Keliling: " + bDatar.hitungKelilingPersegi());
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                bDatar.setPanjang(p, l);
                System.out.println("Luas: " + bDatar.hitungLuasPanjang());
                System.out.println("Keliling: " + bDatar.hitungKelilingPanjang());
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                bDatar.setSegitiga(a, t);
                System.out.print("Masukkan sisi 1: ");
                double s1 = input.nextDouble();
                System.out.print("Masukkan sisi 2: ");
                double s2 = input.nextDouble();
                System.out.print("Masukkan sisi 3: ");
                double s3 = input.nextDouble();
                System.out.println("luasSegitiga: " + bDatar.hitungLuasSegitiga());
                System.out.println("Keliling: " + bDatar.hitungKeliligSegitiga(s1, s2, s3));
                break;

            case 4:
                System.out.print("Masukkan diagonal1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal2: ");
                double d2 = input.nextDouble();
                bDatar.setBelahKetupat(d1, d2);
                System.out.print("Masukkan sis: ");
                double sisiBK = input.nextDouble();
                System.out.println("luasBelahketupat: " + bDatar.hitungluasBelahKetupat());
                System.out.println("Keliling: " + bDatar.hitungKelilingBelahKetupat(sisiBK));
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}