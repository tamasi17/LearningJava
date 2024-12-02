package ejercicios_Mats;

import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		
		// saca los primeros n numeros de la serie de Fibonacci
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuántos numeros de la escala de Fibonacci quieres ver?");

		int cantidad = scanner.nextInt();
		
		int valorActual = 0;
		int valorAnterior = 0;
		int fibonacci = 0; //salida por pantalla
		int i = 0; //contador
		
		while (i<cantidad) {
			
			//if else para los primeros tres numeros,
			//pensaba que era trampa iniciar los dos primeros en 0 y 1 directamente
			
			if (valorActual == 0) {
				System.out.println(fibonacci);
				valorActual=1;
				fibonacci=1;
				i++;
			} else if (valorActual == 1) {
				System.out.println(fibonacci);
				valorActual=2;
				i++;
		
			} else {                         // else a partir del tercer numero
				System.out.println(fibonacci); // muestra fibonacci por pantalla
				valorAnterior=fibonacci; // se sustituyen las variables, avanzando una posicion
				fibonacci=valorActual;
				valorActual=valorAnterior + valorActual;
				i++; // contador para la cantidad
			}
			
		}
		
		
		scanner.close();
	}

}
