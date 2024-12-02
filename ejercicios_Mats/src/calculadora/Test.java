package calculadora;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// realiza una clase matematica con metodos y pruebala en otra clase que lleve el metodo main
		
		Scanner scanner = new Scanner(System.in);
		
		int operacion;
		
		
		do {
		
		System.out.println("\nEn esta calculadora puedes hacer las siguientes operaciones: \n"
				+ "1: suma \n"
				+ "2: resta \n"
				+ "3: multiplicacion \n"
				+ "4: division \n"
				+ "5: potencia \n"
				+ "6: porcentaje \n"
				+ "7: absoluto\n"
				+ "8: factorial\n"
				+ "9: salir");
		
		int a = 0; 
		int b = 0;

		
		operacion = scanner.nextInt();
		
	
		
		
		// SWITCH
		
		switch (operacion) {
		
		case 1:
			System.out.println("Primer número:");
			a = scanner.nextInt();
			System.out.println("Segundo número:");
			b = scanner.nextInt();
			System.out.println("La suma es: " + Matematicas.suma(a,b));
			
			break;
			
		case 2:
			System.out.println("Primer número:");
			a = scanner.nextInt();
			System.out.println("Segundo número:");
			b = scanner.nextInt();
			System.out.println("La resta es: " + Matematicas.resta(a,b));
			
			break;
			
		case 3:
			System.out.println("Primer número:");
			a = scanner.nextInt();
			System.out.println("Segundo número:");
			b = scanner.nextInt();
			System.out.println("La multiplicación es: " + Matematicas.multiplicacion(a,b));
			
			break;
			
		case 4:
			System.out.println("Primer número:");
			a = scanner.nextInt();
			System.out.println("Segundo número:");
			b = scanner.nextInt();
			System.out.println("La división es: " + Matematicas.division(a,b));
			
			break;
			
			
		case 5:
			System.out.println("Base:");
			a = scanner.nextInt();
			System.out.println("Exponente:");
			b = scanner.nextInt();
			System.out.println("La potencia es: " + Matematicas.potencia(a,b));
			
			break;
			
		case 6:
			System.out.println("Primer número:");
			a = scanner.nextInt();
			System.out.println("Segundo número:");
			b = scanner.nextInt();
			System.out.println("El porcentaje es: " + Matematicas.porcentaje(a,b));
			
			break;
			
		case 7:
			System.out.println("Dame un número:");
			a = scanner.nextInt();
			System.out.println("El absoluto es: " + Matematicas.abs(a));
			
			break;
		
			
		case 8: //factorial
			System.out.println("Dame un número:");
			
			a = scanner.nextInt();
			
			while (a<0) {
				System.out.println("Introduce un número positivo: ");
				a = scanner.nextInt();
			}
			
			System.out.println("El factorial es: " + Matematicas.factorial(a));
			
			break;
			
			
			
		default:
			System.out.println("Hasta luego!");
			
			
		} // fin SWITCH

		} while (operacion != 9);
		
		scanner.close();
	}

}
