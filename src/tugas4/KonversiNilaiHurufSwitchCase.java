package tugas4;

import java.util.Scanner;

public class KonversiNilaiHurufSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = input.next().charAt(0);

        double nilaiIndeks;

        switch (nilaiHuruf) {
            case 'A':
                nilaiIndeks = 4.0;
                break;
            case 'B':
                nilaiIndeks = 3.0;
                break;
            case 'C':
                nilaiIndeks = 2.0;
                break;
            case 'D':
                nilaiIndeks = 1.0;
                break;
            case 'F':
                nilaiIndeks = 0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                return;
        }

        System.out.println("Nilai indeks konversi: " + nilaiIndeks);
    }
}
