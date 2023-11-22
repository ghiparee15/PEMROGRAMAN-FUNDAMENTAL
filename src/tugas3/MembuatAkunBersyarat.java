package tugas3;

import java.util.Scanner;
public class MembuatAkunBersyarat {

       public static void main(String[] args) {
             double usia;
             Scanner x = new Scanner(System.in);
             System.out.print("Berapa usia anda ? ");
             usia = x.nextDouble();
             if(usia < 10)
             {
                    System.out.println("Anda belum bisa membuat akun karena umur Anda belum mencukupi");
             }
			 else
			 {
					System.out.println("Selamat Anda berhasil membuat akun");
			 }

       }

}