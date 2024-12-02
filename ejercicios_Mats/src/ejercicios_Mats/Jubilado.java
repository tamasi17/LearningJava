package ejercicios_Mats;

import java.util.Scanner;

public class Jubilado {

	public static void main(String[] args) {
		
			
			Scanner scanner = new Scanner(System.in);
		
			int diaActual, mesActual, añoActual; // la fecha actual
			int dia, mes, año;                   // el nacimiento del usuario
			
			
			 // Fecha actual (entrada por teclado) 
			
			System.out.println("Que dia es hoy?");
			 diaActual = scanner.nextInt();
			System.out.println("Mes?");
			 mesActual = scanner.nextInt();
			System.out.println("Año?");
			 añoActual = scanner.nextInt();
			 
			 // Nacimiento para calcular la edad
			
			System.out.println("Qué dia naciste (1-31) ?");
			 dia = scanner.nextInt();
			System.out.println("Qué mes naciste (1-12) ?");
			 mes = scanner.nextInt();
			System.out.println("En que año?");
			 año = scanner.nextInt();
			 
			 // Comparación edad con fecha actual
			 
			if (añoActual-año > 65) {
				System.out.println("Ya podrías estar jubilado!");
			
		} else if (añoActual-año == 65) {
			if (mesActual < mes) {
				System.out.println("Ya podrías estar jubilado!");
			
			} else {
				if (mesActual == mes) {
					if (diaActual <= dia) { 
						System.out.println("Ya podrías estar jubilado!");
					} else {
						System.out.println("Tienes que trabajar un poquito más, ánimo :( ");
					}
				}
			}
		} else {
			System.out.println("Tienes que trabajar un poquito más, ánimo :( ");
		}
		
		
		scanner.close();

	}

}
