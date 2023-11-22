package tugas3;

import java.util.Scanner;

public class MenentukanGanjilGenap {
	public static void main(String[] args) {
		int bil;
		System.out.print("Masukkan bilangan yang diinginkan : ");
		Scanner x = new Scanner(System.in);
        bil = x.nextInt();
        if(bil % 2 == 0)
        {
			System.out.println("Bilangan tersebut genap!");
        }
        else
        {
			System.out.println("Bilangan tersebut ganjil!");
        }
   }
}

