package tugas3;

import java.util.Scanner;
public class MenentukanNilaiTerbesar {
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		
		int x;
		int y;
		int t;
		
		System.out.print("Masukkan nilai x = ");
		x = nilai.nextInt();
		System.out.print("Masukkan nilai y = ");
		y = nilai.nextInt();
		
		t = x;
		if(y > x){
			t = y;
		} else{
			System.out.println("Error");
		}
		System.out.println("Nilai Terbesar = "+ t);
		
	}
}