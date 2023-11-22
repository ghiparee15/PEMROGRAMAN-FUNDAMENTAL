package tugas4;

import java.util.Scanner;

public class KonversiKodeNegaraIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = scanner.nextLine();

        String namaNegara;

        if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "TUNISIA";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "INDONESIA";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "INDIA";
        } else {
            namaNegara = "Maaf, kode negara TIDAK DIKETAHUI";
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);

        scanner.close();
    }
}
