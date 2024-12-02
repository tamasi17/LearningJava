package ejercicios_Mats;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		/*
		 *  Piedra papel tijera contra el ordenador, que saca un numero del 1 al 3
		 *  
		 *  Lee nuestro número (entre 1, 2 y 3) y comprueba si ganamos o perdemos.
		 * 
		 *  Suerte!
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		int jugador;
		int ordenador = rand.nextInt(3)+1; // random del 1 al 3
		//System.out.println(ordenador);  //descomentar para comprobar
		
		System.out.println("Elige piedra, papel o tijera:\n"
				+ "Piedra: 1\n"
				+ "Papel: 2\n"
				+ "Tijera: 3\n");
		

		do { //verificar numero entre 1 y 3
			
			jugador = scanner.nextInt();
			
		} while ((jugador<1)||(jugador>3));
		
		
		switch (ordenador) {
		
		
		case 1:
			System.out.println("El ordenador ha elegido piedra.");
			
			
			if (jugador == 1) {
				System.out.println("Empate!");
			} else if (jugador == 2) {
				System.out.println("Ganaste!");
			} else {
				System.out.println("Has perdido...");
			}
		
			break;
			
		case 2:
			System.out.println("El ordenador ha elegido papel.");
			
			
			if (jugador == 1) {
				System.out.println("Has perdido...");
			} else if (jugador == 2) {
				System.out.println("Empate!");
			} else {
				System.out.println("Ganaste!");
			}
			
			break;
			
		case 3:
			System.out.println("El ordenador ha elegido tijera.");
			
			
			if (jugador == 1) {
				System.out.println("Ganaste!");
			} else if (jugador == 2) {
				System.out.println("Has perdido...");
			} else {
				System.out.println("Empate!");
			}
			
			break;
			
		default:
			
			System.out.println("Este default no va a aparecer. "
					+ "Queria practicar el do while asi que hice el switch en funcion del ordenador"
					+ "Si lo hiciera con el jugador, el default seria una entrada incorrecta de teclado (fuera del 1, 2 y 3 o con otros caracteres).");
			
		}
		
		
		scanner.close();
	}

}
