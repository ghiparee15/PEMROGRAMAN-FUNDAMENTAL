package tugas7;

import java.util.Scanner;

public class DataArrays{
    public static void main (String[] args){

        Scanner a = new Scanner(System.in);

        System.out.print("Jumlah data: ");
        int jumlahData = a.nextInt();
        int [] data = new int[jumlahData];

        System.out.println("Inputkan data berikut: ");

        for (int i = 0; i < jumlahData; i++){
            System.out.print("Data ke-" +i + " : ");
            data [i] = a.nextInt();

        }
        System.out.println("Menampilkan data: ");

        for (int i = 0; i < jumlahData; i++ ){
            if ( data[i] %2 == 0){
                System.out.println(data[i] + " -> GENAP");

            }else {
                System.out.println(data[i] + " -> GANJIL");
            }
        }
        int totalPenjumlahan = 0;
        for (int i = 0; i < jumlahData; i++){
            totalPenjumlahan = data[i] + totalPenjumlahan;
        }
        System.out.println("TOTAL PENJUMLAHAN: " + totalPenjumlahan);
        System.out.println("RATA-RATA: " + totalPenjumlahan / jumlahData);

    }
}