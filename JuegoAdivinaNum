package ejercicios_Mats;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNum {

	public static void main(String[] args) {
		// juego: adivina el número
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Juego: Número Aleatorio");
		Random rand = new Random();
		int numRand = rand.nextInt(100) + 1;  // random del 1 al 100
		
		System.out.println(numRand); //para comprobar
		
		
		System.out.println("Cuántas oportunidades quieres tener?");
		int intentos = scanner.nextInt();
		int i=1;
		
		System.out.println("Adivina el número del 1 al 100. Tienes " + intentos + " intentos.");
		int answer = scanner.nextInt();
		
		while ((answer<0) || (answer>100)){
			System.out.println("Ese numero no está entre 1 y 100. Sigue intentando");
			i++;
			answer = scanner.nextInt();
		}
		
		

		while ( (answer != numRand) && ((intentos-i)>0) ){
			
			if (answer < numRand) {
				
				i++;
				System.out.println("El número " + answer + " es menor que el que buscas.");
				System.out.println("Busca un número más grande.");
				System.out.println("Llevas " + i + " intento(s).");
				answer = scanner.nextInt();
				
			} else {
				
				i++;
				System.out.println("El número " + answer + " es mayor que el que buscas.");
				System.out.println("Busca un número más pequeño.");
				System.out.println("Llevas " + i + " intento(s).");
				answer = scanner.nextInt();
			}	

		}
		
		
		if (answer != numRand) {
			System.out.println("Has gastado todos tus intentos.\n"
					+ "El número que buscabas es: " + numRand);
		} else {
			System.out.println("Muy bien txiki!\n"
					+ "Has acertado en " + i + " intentos.");
		}
		
		
		scanner.close();
		
	}

}
