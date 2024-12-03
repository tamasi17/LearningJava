package ejerciciosArrays;

import java.util.Scanner;

public class DuplicaValores {

	public static void main(String[] args) {

//		Duplica todos los valores de un array
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un tamaño de array");
		int tamaño = scanner.nextInt();
		
		int[] a = new int[tamaño];
		int[] doble = new int[tamaño];
		
		
		Arrays.introRandom(a);  // introducimos valores aleatorios	
		
		
		System.out.println("Tu array:");
		Arrays.muestraValores(a);
		
		for (int i=0; i<doble.length ; i++) {         // duplicamos cada posicion
			doble[i] = a[i]*2;
		}
		
		
		
		System.out.println("\n\nArray con los valores duplicados:");

		Arrays.muestraValores(doble);
		
		
		
	}

}
