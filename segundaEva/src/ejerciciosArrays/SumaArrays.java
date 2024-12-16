package ejerciciosArrays;

import java.util.Random;

import java.util.Scanner;

public class SumaArrays {

	public static void main(String[] args) {


//		Suma dos arrays del mismo tamaño en otro array llamado suma.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un tamaño de array");
		int tamaño = scanner.nextInt();
		
		int[] a = new int[tamaño];
		int[] b = new int[tamaño];
		int[] suma = new int[tamaño];
		
		
		Arrays.introRandom(a);  // introducimos valores aleatorios	
		Arrays.introRandom(b);
		
		System.out.println("Primer array:");
		Arrays.muestraValores(a);
		System.out.println("\nSegundo array:");	
		Arrays.muestraValores(b);
		
		for (int i=0; i<suma.length ; i++) {         // sumamos cada posicion
			suma[i] = a[i] + b[i];
		}
		
		
		
		System.out.println("\n\nSuma de ambos:");

		Arrays.muestraValores(suma);
		
		
	}

}
