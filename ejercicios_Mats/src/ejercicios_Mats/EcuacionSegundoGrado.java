package ejercicios_Mats;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		// una ecuacion de segundo grado
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, root, abajo;  // abajo se refiere al divisor, era mas facil verlo así
		double discriminante;  // hay tres opciones de respuesta en funcion del discriminante
		double respuestaUno, respuestaDos;
		
		System.out.println("Ecuación de segundo grado: ");
		System.out.println("");
		
		System.out.println("Dame el valor de a: ");
		
		a = scanner.nextFloat();
		
		System.out.println("Dame el valor de b: ");

		b = scanner.nextFloat();
		
		System.out.println("Dame el valor de c: ");
		
		c = scanner.nextFloat();
		
		discriminante = ((Math.pow(b, 2)) - 4*a*c);
		
		
		if (discriminante < 0 ) {
			
			System.out.println("El discriminante es negativo, la ecuación no tiene ninguna solución real.");
			
		} else if ( discriminante == 0 ) {
			
			root = Math.sqrt(discriminante);
			
			System.out.println("La raíz es: " + root);
			
			abajo = 2*a;
			
			System.out.println("El divisor es: " + abajo);
			
			respuestaUno = ((-b) + discriminante)/abajo;
			respuestaDos = ((-b) - discriminante)/abajo;
			
			System.out.println("El discriminante es igual a cero. "
					+ "Las respuestas son iguales: " + respuestaUno + " y " + respuestaDos);
			
			
		} else { // discriminante positivo
			
			root = Math.sqrt(discriminante);
			
			System.out.println("La raíz es: " + root);
		
			abajo = 2*a;
			
			System.out.println("El divisor es: " + abajo);
			
			respuestaUno = ((-b) + discriminante)/abajo;
			respuestaDos = ((-b) - discriminante)/abajo;
			
			System.out.println("El discriminante es positivo. "
					+ "Las respuestas son: " + respuestaUno + " y " + respuestaDos);
			
		}
		
		scanner.close();
		
	}

}
