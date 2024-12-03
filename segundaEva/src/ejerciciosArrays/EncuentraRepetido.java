package ejerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class EncuentraRepetido {

	public static void main(String[] args) {


//		Encuentra un elemento en un array y cuantas veces se repite.
		
//		Nos devuelve la posicion en la que está ese elemento.
		
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Dame un tamaño de array: ");
		int tamaño = scanner.nextInt();
		
		int[] a = new int[tamaño];
		int numero;
		

//		Numeros aleatorios del 1 al 6 como un dado:
		
		for (int i=0; i<a.length ; i++) {	
			a[i] = rand.nextInt(6) + 1;  // random del 1 al 100
		}
		
		System.out.println("Este es tu array: ");
		Arrays.muestraValores(a);
		
		
		do {    // comprobacion de errores

			System.out.println("\nQué numero buscas? (1-6)");
			numero=scanner.nextInt();
			
		} while ((numero>6)&&(numero<1));
		
		
		for (int i=0; i<a.length ; i++) {
			if (a[i]==numero) {
				System.out.println("Ese numero está en la posición: " + (i+1));
			}
		}
		
		
	}

}
