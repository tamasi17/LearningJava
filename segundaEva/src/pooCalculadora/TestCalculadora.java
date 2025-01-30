package pooCalculadora;

import java.util.Scanner;



public class TestCalculadora {

	public static void main(String[] args) {
		
//		Calculadora con memorias, acumulativa.
		
//		Cuando se opera, solo se usa el numero que se encuentra en la variable acumulador.
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int operacion;
		double num = 0;
		
		// Crear instancia de Calculadora (acumulador, memoriaUno, memoriaDos)
		
		Calculadora calculadora = new Calculadora();
				
		
//		He empezado preguntando el tipo de operacion y luego el uso de memorias, otra opcion habria sido invertir ese orden.
		
		
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
				+ "Cualquier otro número: salir");

		
		operacion = scanner.nextInt();
		int memorias = 0;
		
	
		
		
		// SWITCH
		
		switch (operacion) {
		
		
		case 1:
			
			System.out.println("Sumando... ¿Quieres usar un numero guardado en la memoria?"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.suma(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.suma(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.suma(num);
			System.out.println(calculadora.getAcumulador());
			break;
			}
			
		case 2:
			
			System.out.println("Restando... ¿Quieres usar un numero guardado en la memoria?\n"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.resta(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.resta(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.resta(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			}
			
		case 3:
			
			System.out.println("Multiplicando... ¿Quieres usar un numero guardado en la memoria?\n"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.producto(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.producto(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.producto(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			}
			
		case 4:
			System.out.println("Division... ¿Quieres usar un numero guardado en la memoria?\n"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.division(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.division(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.division(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			}
			
			
		case 5:
			
			System.out.println("Potencia... ¿Quieres usar un numero guardado en la memoria?\n"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.potencia(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.potencia(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.potencia(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			}
			
		case 6:
			System.out.println("Porcentaje... ¿Quieres usar un numero guardado en la memoria?\n"
					+ "\nPulsa 1 para memoria 1: " + calculadora.getMemoriaUno()
					+ "\nPulsa 2 para memoria 2: " + calculadora.getMemoriaDos()
					+ "\nOtros: cualquier otro número.\n");
			memorias = scanner.nextInt();
			
			if (memorias==1) {
				
			calculadora.porcentaje(calculadora.getMemoriaUno());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else if (memorias==2) {
			
			calculadora.porcentaje(calculadora.getMemoriaDos());
			System.out.println(calculadora.getAcumulador());
			break;
				
			} else {
			
			System.out.println("Introduce un número:");
			num = scanner.nextInt();
			calculadora.porcentaje(num);
			System.out.println(calculadora.getAcumulador());
			
			break;
			}
			
		case 7:
			calculadora.setMemoriaUno(calculadora.getAcumulador());
			System.out.println("Guardado en memoria uno: " + calculadora.getAcumulador());
			
			break;
		
			
		case 8: 
			calculadora.setMemoriaDos(calculadora.getAcumulador());
			System.out.println("Guardado en memoria dos: " + calculadora.getAcumulador());
			
			break;
			
			
			
		default:
			System.out.println("Hasta luego!");
			
			
		} // fin SWITCH

		} while (operacion != 9);
		
		scanner.close();

	}

}
