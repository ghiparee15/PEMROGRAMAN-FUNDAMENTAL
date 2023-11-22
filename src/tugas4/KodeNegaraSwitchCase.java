package tugas4;

import java.util.Scanner;

public class KodeNegaraSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputkan kode negara (2 huruf) : ");
        String kodeNegara = scanner.nextLine().toUpperCase();

        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "SPAIN";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "MYANMAR";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                namaNegara = "Maaf, kode negara TIDAK DIKETAHUI";
                break;
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);
    }
}
