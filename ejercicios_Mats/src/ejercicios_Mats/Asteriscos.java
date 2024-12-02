package ejercicios_Mats;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		// dibujar con asteriscos
		// 1: una linea de asteriscos
		// 2: un cuadrado de n asteriscos de lado dados por el usuario
		// 3: un triangulo rectangulo hasta n dado por el usuario
		// 4: triangulo rectangulo hacia abajo
		
		
		Scanner scanner = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.println("Introduce un número de asteriscos\n");
		
		
		
		System.out.println("Línea de asteriscos\n");
		
		i = scanner.nextInt();    // número de asteriscos en la línea
		j=0;
		
		while (j<i) {
			System.out.print("#");
			j++;
		}
		
		
		System.out.println("\n");
		
		System.out.println("Cuadrado de asteriscos\n");
		
		i = scanner.nextInt(); // tamaño del lado del cuadrado
		j=1;  // j es el contador para las filas
		k=0; // k es el contador para las columnas
		
		while (j<=i) {
			
			while (k<i) {
				System.out.print("#");
				k++;
			}
			System.out.println("");
			k=0;
			j++;
		}
		
		System.out.println("\n");
		System.out.println("Triángulo de asteriscos");
		
		i = scanner.nextInt(); // numero de filas
		j=i; // para contar filas
		k=1; // para controlar el numero de asteriscos por fila
		
		while ( (i>=k) || (i==1) ) {
			
			while (j<=i) {
				System.out.print("#");
				j++;
			}
			System.out.println("");
			k++;
			j-=k;
		}
		
		
		System.out.println("");
		System.out.println("Triángulo inverso de asteriscos");
		
		
		i = scanner.nextInt();
		j=0;
	
		
		while (j<i) {
			
			while (j<i) {
				System.out.print("#");
				j++;
			}
			System.out.println("");
			j=0;
			i--;
		}
		
		
		
		scanner.close();
	}

}
