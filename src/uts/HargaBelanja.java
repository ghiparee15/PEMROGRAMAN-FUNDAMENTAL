package uts;

import java.util.Scanner;
public class HargaBelanja {
    public static void main(String []args){

        Scanner a = new Scanner(System.in);

        int item0 = 2500;
        int item1 = 3000;
        int item2 = 4000;
        int item3 = 5000;
        int item4 = 6000;



        System.out.print("Jumlah belanja item0 Rp.2500: " );
        int jumlahBelanja0 = a.nextInt();

        System.out.print("Jumlah belanja item1 Rp.3000: " );
        int jumlahBelanja1 = a.nextInt();

        System.out.print("Jumlah belanja item2 Rp.4000: " );
        int jumlahBelanja2 = a.nextInt();


        System.out.print("Jumlah belanja item3 Rp.5000: " );
        int jumlahBelanja3 = a.nextInt();

        System.out.print("Jumlah belanja item4 Rp.6000: " );
        int jumlahBelanja4 = a.nextInt();

        System.out.println("Daftar belanja harga: ");

        int hargaBarang0 = item0 * jumlahBelanja0;
        int hargaBarang1 = item1 * jumlahBelanja1;
        int hargaBarang2 = item2 * jumlahBelanja2;
        int hargaBarang3 = item3 * jumlahBelanja3;
        int hargaBarang4 = item4 * jumlahBelanja4;

        System.out.println("Harga barang ke-0, 2500, " +jumlahBelanja0 + " item: " +hargaBarang0);
        System.out.println("Harga barang ke-1, 3000, " +jumlahBelanja1 + " item: " +hargaBarang1);
        System.out.println("Harga barang ke-2, 4000, " +jumlahBelanja2 + " item: " +hargaBarang2);
        System.out.println("Harga barang ke-3, 5000, " +jumlahBelanja3 + " item: " +hargaBarang3);
        System.out.println("Harga barang ke-4, 6000, " +jumlahBelanja4 + " item: " +hargaBarang4);

        int totalItemBelanja = jumlahBelanja0 + jumlahBelanja1 + jumlahBelanja2 + jumlahBelanja3 + jumlahBelanja4;
        int totalBelanja = hargaBarang0 + hargaBarang1 + hargaBarang2 + hargaBarang3 + hargaBarang4;

        System.out.println("TOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: " + "Rp " + totalBelanja);


    }
}