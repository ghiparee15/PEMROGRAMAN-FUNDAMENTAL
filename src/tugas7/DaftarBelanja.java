package tugas7;

import java.util.Scanner;

public class DaftarBelanja{
    public static void main(String []args){

        Scanner a = new Scanner(System.in);

        int [] hargaBarang = {2500, 3000, 4000, 5000, 6000};
        int [] item = new int [hargaBarang.length];

        System.out.println("Input jumlah barang belanja: ");

        for (int i = 0; i < hargaBarang.length; i++){
            System.out.print("Jumlah belanja item-" +i + " Rp " + hargaBarang[i] + ": ");
            item [i] = a.nextInt();
        }
        System.out.println("Daftar belanja dan harga: ");

        int totalHarga = 0;
        for (int i = 0; i < hargaBarang.length; i++){
            totalHarga = hargaBarang[i] * item[i];
            System.out.println("Harga barang ke-" + i + ", " + hargaBarang[i] + ", " + item[i] + " item: " + totalHarga);
        }

        int totalItemBelanja = 0;
        int belanja = 0;
        for (int i = 0; i < hargaBarang.length; i++){
            totalItemBelanja = totalItemBelanja + item[i];
            belanja = belanja + hargaBarang[i] * item[i];
        }
        System.out.println("TOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("BELANJA: RP " + belanja);

    }
}