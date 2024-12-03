package ejerciciosArrays;
import java.util.Arrays;
public class TestArrays {

	public static void main(String[] args) {

		
//		Probar los metodos de la clase Arrays en una clase Test.
		
		
		
		int[] pruebaInt = new int[5];
		String[] pruebaString = new String[5];
		char[] pruebaChar = new char[5];
		
		
		Arrays.fill(pruebaInt, 17); // este es de mi clase propia
		Arrays.fill(pruebaInt, 7);  // este es Arrays original
		
		System.out.println(Arrays.toString(pruebaInt)); // Arrays original
		
		
		
		
	}

}
