package ejercicios_Mats;

import java.util.Scanner;

public class NumerosOrdenados {

	public static void main(String[] args) {
		// nos pide una serie de tres numeros, los devuelve por pantalla en orden
		
		// podria hacerlo con IFs cuando ya nos han dado los tres numeros pero queria practicar ternarios
		
		// para practicar ternarios he ido reasignando variables a medida que nos las dan
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Primer número");
		int a = scanner.nextInt();
		
		int masBajo=a;
		int medio=a;
		int masAlto=a;

		System.out.println("Segundo número");
		int b = scanner.nextInt();

		masBajo = (a<b) ? a : b;

		masAlto = (a>b) ? a : b;
		
		medio = masAlto;
		
		System.out.println("Tercer número");
		int c = scanner.nextInt();
		
		masBajo = (masBajo<c) ? masBajo : c;
		
		masAlto = (masAlto>c) ? masAlto : c;
		/*
		medio = ((c>masBajo)&&(c<masAlto)) ? c : medio;
		*/
	
		if ((c>masBajo)&&(c<masAlto)) {
			
			medio = c;
		} else if ((a>masBajo)&&(c<masAlto)) {
			
			medio = a;
			
			} else {
				medio = b;
			}
			
	
		
		System.out.println("El número más bajo es: " + masBajo);
		System.out.println("El número del medio es: " + medio);
		System.out.println("El número más alto es: " + masAlto);
		
		scanner.close();

	}

}
