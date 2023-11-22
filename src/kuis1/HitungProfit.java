package kuis1;

import java.util.Scanner;

public class HitungProfit {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner inputScanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai modal
        System.out.print("Masukkan nilai modal: " + 30.000);
        double modal = inputScanner.nextDouble();

        // Meminta pengguna untuk memasukkan persentase keuntungan
        System.out.print("Masukkan persentase keuntungan: " + 50 / 100);
        double persentaseKeuntungan = inputScanner.nextDouble();

        // Menghitung profit berdasarkan rumus yang diberikan
        double profit = modal + (modal * (persentaseKeuntungan / 100));

        // Menampilkan modal, persentase keuntungan, dan profit
        System.out.println("Modal: " + modal);
        System.out.println("Persentase Keuntungan: " + persentaseKeuntungan + "%");
        System.out.println("Profit: " + profit);

        // Menutup objek Scanner
        inputScanner.close();
    }
}
