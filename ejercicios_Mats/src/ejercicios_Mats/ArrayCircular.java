package ejercicios_Mats;

import java.util.Scanner;

public class ArrayCircular {

	public static void main(String[] args) {
		/*
		 *  Desplaza los elementos del array circularmente:
		 *  
		 *  del n al n-1 y asi hasta cero. el del cero va al n
		 *  y asi sucesivamente
		 *  
		 */

		Scanner scanner = new Scanner(System.in);
		int tamaño=1;
		
		do {
			
			// tamaño array
			
			System.out.println("De qué tamaño es el array?");
			tamaño = scanner.nextInt();
			int i; //contador para el for
			
			// introducir datos
			
			int [] circulo = new int[tamaño];
			
			
			MetodosArray.introValores(circulo);
			
			
			System.out.println("\nAsí se ve tu array original:");
			MetodosArray.muestraValores(circulo);
			
			
			/* desplazar circularmente
			 * 
			 * guardar el valor de la posicion 0 en una variable
			 * 
			 * en la posicion 0 guardar el valor de la posicion 0+1
			 * 
			 * así hasta circulo.length
			 * 
			 * y cuando lleguemos a la posicion numero circulo.length 
			 * recuperar el valor de la variable que creamos al principio
			 * 
			 */
			
			int continuar=1;
			
			while (continuar!=0) {
				
				MetodosArray.desplazar(circulo);
				
				System.out.println("Este es tu array desplazado:");
				MetodosArray.muestraValores(circulo);
				
				
				System.out.println("\nSi quieres parar, pulsa 0. "
						+ "Pulsa cualquier otro numero para seguir desplazando el array");
				
				continuar=scanner.nextInt();
				
			}
			
			
			System.out.println("Quieres hacer otro array?"
					+ " Si quieres parar, pulsa 0");
			
			tamaño=scanner.nextInt();
			
		} while (tamaño!=0);
		
		
		System.out.println("Gracias!");
		
		
		
	}

}