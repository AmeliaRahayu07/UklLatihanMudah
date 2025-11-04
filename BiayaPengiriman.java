import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data paket
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume paket
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya berat
        double biayaBerat = berat * biayaPerKg;

        // Tambahkan biaya volume jika melebihi 100 cm^3
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Hitung total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        // Tampilkan hasil
        System.out.println("\n===== RINCIAN BIAYA PENGIRIMAN =====");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak tempuh : " + jarak + " km");
        System.out.println("Volume paket : " + volume + " cm^3");
        System.out.println("Biaya berdasarkan berat : Rp " + biayaBerat);
        System.out.println("Biaya tambahan volume : Rp " + biayaVolume);
        System.out.println("------------------------------------");
        System.out.println("Total biaya pengiriman : Rp " + totalBiaya);

        input.close();
    }
}

