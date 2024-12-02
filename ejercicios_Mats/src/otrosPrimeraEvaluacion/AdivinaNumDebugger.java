package otrosPrimeraEvaluacion;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumDebugger {

	public static void main(String[] args) {
		
		        // Inicializar objetos para entrada de usuario y número aleatorio
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        // Generar un número aleatorio entre 1 y 100
		        int numeroSecreto = random.nextInt(100) + 1;
		        int intento = 0;
		        int numeroUsuario;
		        boolean adivinado = false;

		        System.out.println("¡Bienvenido al juego de adivinanza!");
		        System.out.println("Adivina el número entre 1 y 100.");

		        // Ciclo principal del juego
		        while (!adivinado) {
		            System.out.print("Introduce tu número: ");
		            numeroUsuario = scanner.nextInt();
		            intento++;

		            // Comparar el número del usuario con el número secreto
		            if (numeroUsuario == numeroSecreto) {
		                adivinado = true;
		                System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
		            } else if (numeroUsuario < numeroSecreto) {
		                System.out.println("El número es mayor. ¡Intenta de nuevo!");
		            } else {
		                System.out.println("El número es menor. ¡Intenta de nuevo!");
		            }
		        }

		        // Finalizar el juego
		        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
		        scanner.close();
	

	}

}
