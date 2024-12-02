package ejercicios_Mats;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// un algoritmo que reconozca si un numero es primo
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Dame un número");
		int numeroDado=0;
		
		
		do { //verificar numero mayor que 0
			
			numeroDado = scanner.nextInt();
			
		} while (numeroDado<=0);
		
		int divisor= numeroDado-1;
		
		while (divisor>1) {
			
			if (numeroDado % divisor == 0) {       // se puede dividir
				System.out.println("El numero no es primo.");
				divisor=0;
			} else {
				
				while (numeroDado % divisor != 0) { //sigue intentando dividir hasta que no queden numeros
					divisor--;
				}
				
				if (divisor==1)      //si solo hay una instruccion no necesitas llaves
					System.out.println("El número es primo.");
					
			}
			
		}
		
		
		
		scanner.close();

	}

}
