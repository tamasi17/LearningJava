package calculadoraPOO;

import java.util.Scanner;



public class TestCalculadora {

	public static void main(String[] args) {
		
//		Calculadora con memorias, acumulativa.
		
//		Cuando se opera, solo se usa el numero que se encuentra en la variable acumulador.
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int operacion;
		double num = 0;
		
		// Crear instancia de Calculadora (acumulador, memoriaUno, memoriaDos)
		
		Calculadora calculadora = new Calculadora (0, 0, 0);
				
		
		// Siempre que se usa un metodo para una operacion, tambien se muestra por pantalla (bucle)
		
		
		do {
		
		System.out.println("\nEn esta calculadora puedes hacer las siguientes operaciones: \n"
				+ "1: suma \n"
				+ "2: resta \n"
				+ "3: multiplicacion \n"
				+ "4: division \n"
				+ "5: potencia \n"
				+ "6: porcentaje \n"
				+ "7: guardar en memoria 1\n"
				+ "8: guardar en memoria 2\n"
				+ "9: salir");

		
		operacion = scanner.nextInt();
		
	
		
		
		// SWITCH
		
		switch (operacion) {
		
		case 1:
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.suma(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			
		case 2:
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.resta(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			
		case 3:
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.producto(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			
		case 4:
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.division(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			
			
		case 5:
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.potencia(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			
		case 6:
			System.out.println("Función en desarrollo");

			
			break;
			
		case 7:
			System.out.println("Función en desarrollo");

			
			break;
		
			
		case 8: //factorial
			System.out.println("Función en desarrollo");
			
			break;
			
			
			
		default:
			System.out.println("Hasta luego!");
			
			
		} // fin SWITCH

		} while (operacion != 9);
		
		scanner.close();

	}

}
