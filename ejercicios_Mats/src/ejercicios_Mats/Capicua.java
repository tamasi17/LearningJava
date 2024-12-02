package ejercicios_Mats;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {


	
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Dame un numero y te digo si es capicúa");
		String palabra = scanner.next();
		int numero = Integer.parseInt(palabra); //convertir el numero a entero
		
		System.out.println("\nEste es tu número: "+ numero);
		System.out.println("Tu número tiene "+ palabra.length()+ " cifras."); // pedimos el formato String para saber cuantos digitos tiene
		
		int[] digitos = new int[palabra.length()];
		
		
		// INTRODUCIR LOS DIGITOS EN CADA POSICION DEL ARRAY
		
		for (int i = (digitos.length-1); i>=0; i--) { //empezando por la ultima posicion (el numero más a la derecha)
			
			digitos[i]= numero % 10; // esto nos da el digito más a la derecha
			numero /= 10; // como es un int, al mover la coma, el ultimo digito desaparece
			
		}
		
		
//		MetodosArray.muestraValores(digitos);   //descomentar para comprobar
		
		
//		El metodo esCapicua toma el primer y ultimo digito del array y compara a medida que se acercan al punto medio del numero si coinciden los valores.
		
		if (MetodosArray.esCapicua(digitos)) {
			System.out.println("El número " + palabra + " es capicúa!");
		} else {

			System.out.println("El número " + palabra + " no es capicúa.");
		}
		
		
		
		
	}

}
