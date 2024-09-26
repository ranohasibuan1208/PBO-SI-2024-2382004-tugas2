import java.util.Scanner;
public class Tugas2BangunDatar {

    // Method untuk menghitung luas persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // Method untuk menghitung luas persegi panjang
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // Method untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling lingkaran
    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    // Method utama untuk memilih bangun datar yang ingin dihitung
    public static void pilihBangunDatar() {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu pilihan bangun datar
        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungPersegi(); // Panggil method untuk menghitung persegi
                break;
            case 2:
                hitungPersegiPanjang(); // Panggil method untuk menghitung persegi panjang
                break;
            case 3:
                hitungLingkaran(); // Panggil method untuk menghitung lingkaran
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    // Method untuk menghitung dan menampilkan hasil persegi
    public static void hitungPersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();

        // Menampilkan hasil luas dan keliling
        System.out.printf("Luas persegi: %.1f\n", hitungLuasPersegi(sisi)); //%.1f memastikan angka desimal yang dicetak hanya memiliki 1 angka di belakang koma
        System.out.printf("Keliling persegi: %.1f\n", hitungKelilingPersegi(sisi));
    }

    // Method untuk menghitung dan menampilkan hasil persegi panjang
    public static void hitungPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        // Menampilkan hasil luas dan keliling
        System.out.printf("Luas persegi panjang: %.1f\n", hitungLuasPersegiPanjang(panjang, lebar));
        System.out.printf("Keliling persegi panjang: %.1f\n", hitungKelilingPersegiPanjang(panjang, lebar));
    }

    // Method untuk menghitung dan menampilkan hasil lingkaran
    public static void hitungLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Menampilkan hasil luas dan keliling
        System.out.printf("Luas lingkaran: %.1f\n", hitungLuasLingkaran(jariJari));
        System.out.printf("Keliling lingkaran: %.1f\n", hitungKelilingLingkaran(jariJari));
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        pilihBangunDatar(); // Memanggil method untuk memulai program
    }
}