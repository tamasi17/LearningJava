package ejercicios_Mats;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		/*
		 * 	se introducen una serie de sueldos por teclado
		 * obtenemos el sueldo mayor, el sueldo menor, media de los sueldos
		 * finaliza al introducir -1
		 * 
		 * como no necesitamos poner en orden, solo sueldoMayor sueldoMenor y un contador para hacer la media después
		 * pero sí hay que guardar los sueldos que nos dan para ir haciendo la media
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un sueldo:");
		
		int sueldo = scanner.nextInt();
		
		int sueldoMax = sueldo;
		int sueldoMin = sueldo;
		float media = 0;
		int suma = 0;
		int i = 0;
		
		while (sueldo != -1) {
			
			i++;
			//System.out.println("Cantidad de sueldos: " + i); //para comprobar
			
			suma += sueldo;
			//System.out.println("La suma es: " + suma); //para comprobar
			
			media = suma/i;
			//System.out.println("La media es: " + media); //para comprobar
			
			sueldoMax = (sueldo>sueldoMax) ? sueldo : sueldoMax;
			sueldoMin = (sueldo<sueldoMin) ? sueldo : sueldoMin;
			
			System.out.println("Escribe un sueldo para continuar o '-1' para parar:");
			sueldo = scanner.nextInt();
			
			
		} //fin while sueldo hasta -1
		
		
		System.out.println("El sueldo más grande es: " + sueldoMax);
		System.out.println("El sueldo más pequeño es: " + sueldoMin);
		System.out.println("La media es: " + media);
		
		
		scanner.close();

	
	}
	
}
