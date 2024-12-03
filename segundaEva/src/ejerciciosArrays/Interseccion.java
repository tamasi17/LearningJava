package ejerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class Interseccion {

	public static void main(String[] args) {

//		Dos arrays. Genera la interseccion de ambos en un tercero (solo se añaden al tercer array aquellos que coinciden).
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un tamaño de array:");
		int tamaño = scanner.nextInt();
		
		int[] a = new int[tamaño];
		int[] b = new int[tamaño];
		int[] interseccion = new int[tamaño];
		
		
		
//		Numeros aleatorios del 1 al 6 como un dado para que coincidan algunos.
		
		for (int i=0; i<a.length ; i++) {	
			a[i] = rand.nextInt(6) + 1;  // random del 1 al 100
			b[i] = rand.nextInt(6) + 1;  // random del 1 al 100
		}
		
		
		System.out.println("Primer array:");
		Arrays.muestraValores(a);
		System.out.println("\nSegundo array:");	
		Arrays.muestraValores(b);
		
	

		
		for (int i=0; i<a.length ; i++) {	// para recorrer a
			
				
			if (!(Arrays.estaDentro(interseccion, a[i]))) {  // comprueba si el int a[i] está en interseccion[]
					
				for (int j = 0; j < interseccion.length; j++) {  // para recorrer b por cada posicion de a
						
					if ((a[i]==b[j])) {  // si coinciden a y b, asigna valor a interseccion
							interseccion[i]=a[i];
					}		
			
				} // fin for b
					
			}	
		
		} // fin for que recorre a
		
		
		
	
		
		System.out.println("\n\nIntersección:");	
		
		
		for (int k=0; k<interseccion.length ; k++) {  // saca por pantalla los valores que no sean 0
			
			if (interseccion[k]!=0)
			System.out.print(interseccion[k] + " ");
		}
	
		
	}

}
