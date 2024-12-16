package ejerciciosArrays;

import java.util.Scanner;

public class Fusion {

	public static void main(String[] args) {

//		Fusiona dos arrays en un tercero sabiendo que estan ordenados.
//		Como ejemplo, pondre dos arrays de tamaño 5 para fusionarlos en uno de 10
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] a = {2,7,8,11,17};
		int[] b = {1,3,5,13,23};
		int[] fusion = new int[10];
		
		
		System.out.println("Primer array:");
		Arrays.muestraValores(a);
		
		System.out.println("\nSegundo array:");	
		Arrays.muestraValores(b);
	
		int i=0; //contador fusion
		int j=0; //contador a
		int k=0; //contador b
		
		
//		While para recorrer los arrays iniciales
		
		do {     
			
			if (a[j]>b[k]) {
				fusion[i] = b[k];
				k++;
			} else {
				fusion[i] = a[j];
				j++;
			}
			
			i++;
			
		} while (j<a.length && k<b.length);  
		
		
//		Como es un &&, se puede quedar algun elemento de uno de los arrays al terminar de recorrer el otro:
		
		
		while (j<a.length) {
			fusion[i] = a[j];
			j++;
			i++;
		}
		
		while (k<b.length) {
			fusion[i] = b[k];
			k++;
			i++;
		}
		

		
		System.out.println("\n\nFusion de ambos:");

		Arrays.muestraValores(fusion);
		
		
	}

}
