package tugas1;

public class LuasLingkaran{
  public static void main(String[] args){ 
      final double phi = 3.14;
	  int jariJari = 12;
	  double luas = phi * jariJari * jariJari;
	  double keliling = 2 * phi * jariJari;
	  System.out.println("phi: "+phi);
	  System.out.println("jariJari: "+jariJari);
	  System.out.println("luas lingkaran = "+luas);
	  System.out.println("Keliling lingkaran = "+keliling);
  }
}