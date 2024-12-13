package ejerciciosArrays;
import java.util.Arrays;
public class TestArrays {

	public static void main(String[] args) {

		
//		Probar los metodos de la clase Arrays en una clase Test.
		
		
		
		int[] pruebaInt = new int[5];
		int[] pruebaDosInt = new int[5];
		String[] pruebaString = new String[5];
		char[] pruebaChar = new char[5];
		
		
//		fill
		
		Arrays.fill(pruebaInt, 17); // este es de mi clase propia
		Arrays.fill(pruebaDosInt, 7);  // este es con la clase Arrays original
		
		
//		toString
		
		System.out.println(Arrays.toString(pruebaInt)); 
		
		
//		equals
		
		
		System.out.println("\nSon iguales estos dos arrays?: " + Arrays.equals(pruebaInt, pruebaDosInt) ); //	equals

		
//		copyOf
		
		pruebaInt = Arrays.copyOf(pruebaInt, 7);
		
		
		for (int i = 0; i < pruebaInt.length; i++) {  //para tener numeros que ordenar
			pruebaInt[i]= (i+3)*3;
		}
		
		
		System.out.println(Arrays.toString(pruebaInt)); 
		
		

		
//		sort
		

		
		
//		bynary search
		
		
		
	}

}
