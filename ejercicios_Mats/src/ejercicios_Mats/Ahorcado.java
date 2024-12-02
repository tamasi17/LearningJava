
package ejercicios_Mats;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		/* 
		 * Juego del ahorcado con arrays, dos jugadores
		 * 
		 * Array hecho con char
		 * 
		 * tres arrays: palabra secreta, la respuesta y los fallos
		 * 
		 * si los intentos son menos que 7 y las letras coinciden ganas
		 * 
		 * por cada intento se va dibujando en un metodo por separado el ahorcado
		 * 
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantas letras tiene tu palabra secreta?"); // para iniciar más facilmente los arrays palabra y respuesta
		
		int longitud = scanner.nextInt();
		
		char[] palabra = new char[longitud];  
		
		char[] respuesta = new char[longitud];
		
		char[] fallos = new char[27]; 	// array letras falladas
	
		
		char letra;
		boolean acierto;
		
		int i=0; // contador
		int intentosFallados=0;
		int oportunidades=7;
		
		
		System.out.println("Introduce las letras de la palabra de una en una.");
		
		MetodosArray.introChar(palabra); // metodo para introducir caracteres en un array
		
		//MetodosArray.muestraPalabra(palabra);  // descomentar para comprobar
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // para que el segundo jugador no vea la palabra secreta
		System.out.println("Tienes "+ oportunidades +" oportunidades.");
		
		
		
		do { // mientras la respuesta sea diferente de la palabra secreta y queden oportunidades.
		
			
			
			// comprueba si es una letra haciendo cast del char a int 
			// a=97, z=122, ñ=241
			//(no funciona si se usa otro Unicode)
			
			do {
				
				System.out.println("\nAdivina una letra: \n");
				
				letra = scanner.next().charAt(0);
				
			} while (MetodosArray.esLetra(letra)==false); 
			
			
			// comprueba si ya hemos usado la letra
			
			if ( (MetodosArray.estaDentro(respuesta, letra)==true) || (MetodosArray.estaDentro(fallos, letra)==true) ) {
				
				System.out.println("Elige una letra que no hayas usado, por favor.");
				
				
			// comprueba si la letra está en la palabra secreta	
				
			} else if ( (MetodosArray.estaDentro(palabra, letra)==true) ){
				
				
				for (i=0; i<palabra.length; i++) {  // añade la letra a la respuesta
					
					
					if ( letra == palabra[i] )
						
						respuesta[i] = letra;
					
				} 
				
				
				System.out.println("  Acertaste! Tienes "+ oportunidades +" oportunidades.");
				
				/*
				DibujoAhorcado.intentos(intentosFallados);
				
				System.out.print("Tu respuesta: ");
				MetodosArray.muestraRespuesta(respuesta, palabra);
				System.out.print("\nFalladas: ");
				MetodosArray.muestraPalabra(fallos);
				*/
			
			// si la letra no está en la palabra secreta		
				
			} else if ( (MetodosArray.estaDentro(palabra, letra)==false) ) {
				
				fallos[intentosFallados] = letra;
				
				oportunidades--;
				
				System.out.println("\nFatal txiki, te quedan "+ oportunidades +" oportunidades.");
				
				intentosFallados++;
				
			}

			DibujoAhorcado.intentos(intentosFallados);
			
			System.out.print("Tu respuesta: ");
			MetodosArray.muestraRespuesta(respuesta, palabra);
			
			System.out.print("\nFalladas: ");
			MetodosArray.muestraPalabra(fallos);
			
			
			
		} while ( (MetodosArray.arraysIguales(palabra, respuesta)==false) && (oportunidades>0) );   // FIN JUEGO
		
		
		// muestra si ganas o pierdes
		
		if (MetodosArray.arraysIguales(respuesta, palabra)==true) {
			System.out.println("Ganaste!!  d(^o^)b");
		} else {
			System.out.print("¯\\_(··)_/¯  Perdiste, la palabra que buscas es: ");
			MetodosArray.muestraPalabra(palabra);
		}
		
		
		/*
		 * quería comprobar si funcionaba esto si la letra que nos dan por teclado es una letra:
		 * haciendo el cast a int y viendo si ese char está entre 97 (a) y 122 (z) + ñ (241)
		 * en vez de hacer un array con todo el alfabeto
		 * 
		 */
		
		
	}
	

}
