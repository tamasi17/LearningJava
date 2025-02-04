package pooTarjeta;

import pooPersona.Persona;

import java.util.Scanner;


/*
	Se pide que creéis una clase Tarjeta
	Tiene como características 
	El número de cuenta que se asocia con la tarjeta, el saldo de la cuenta asociada a la tarjeta, 
	El número secreto de la tarjeta y la cantidad máxima diaria a sacar.

	Con la clase Tarjeta se puede realizar movimientos como sacar dinero, ingresar dinero y consultar el saldo
	También se puede realizar cambios en la cantidad máxima a sacar
	y realizar comprobaciones como introducir el número secreto y comprobar que sea el mismo que el de la tarjeta.

	Dentro del método de sacar dinero se tiene que tener en cuenta dos condiciones: 
	La primera es que no se puede dejar la cuenta en menos de 200 euros 
	y la segunda que no se puede pedir sacar cantidades superiores a la cantidad máxima diaria.

	Si esto sucediera se tendría que sacar por pantalla un mensaje que dijera por qué no se ha podido realizar la operación.

	Se pide también crear un programa principal main (puede ser dentro de la clase Tarjeta o en otra clase) 
	donde se cree un objeto tarjeta (o varios) y se añadan una serie de datos.

	Por ejemplo: número de cuenta 135, saldo disponible 2320 €, saldo máximo a sacar 500 € y el número secreto 3212.

	Después realizar los pasos que supuestamente realizarías en un cajero:

	• Introducir el código clave y comprobar que es el correcto, 
	Si no, dar un mensaje de error (esto se realiza llamando al método de la clase Tarjeta que implemente esta acción).

	• Si no da error, sacar dinero de la cuenta. Podéis probar a sacar una cantidad superior a la permitida, etc.


*/

public class TestTarjeta {

	public static void main(String[] args) {

//		Creamos instancias de Tarjeta
		
		Scanner scanner = new Scanner(System.in);

		
		Tarjeta amex = new Tarjeta(135, 2320, 3212, 500);
		int pin;
		
		
//		Pedir contraseña
		

		do {

			System.out.println("Dame pin pls: \n");
			pin = scanner.nextInt();
			
			if (!amex.password(pin)) {
				System.out.println("PIN Incorrecto");
			} 
			
		} while (!amex.password(pin));
		
		
		int opcion=0;
		
		
		do {
			
			
			System.out.println("\nEn este cajero puedes hacer las siguientes operaciones: \n"
					+ "1: sacar dinero \n"
					+ "2: ingresar dinero \n"
					+ "3: consultar saldo \n"
					+ "4: cambiar maximo diario \n"
					+ "5: salir \n");
			
			opcion=scanner.nextInt();

			switch (opcion) {
			case 1:
				
				
				System.out.println("¿Cuánto dinero vas a sacar? \n");
				double cantidadSacar = scanner.nextDouble();
				try {
					
					amex.sacarDinero(cantidadSacar);
					System.out.println("Has sacado: " + cantidadSacar 
										+ "\nTu saldo actual es: " + amex.getSaldo());
					
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
				
				break;

			case 2:
				
				
				System.out.println("¿Cuánto dinero vas a ingresar? \n");
				double cantidadIngresar = scanner.nextDouble();
				
				amex.ingresarDinero(cantidadIngresar);
				System.out.println("Has ingresado: " + cantidadIngresar 
								+ "\nTu saldo actual es: " + amex.getSaldo());
				
				break;
				
			case 3:
				
				System.out.println("Tu saldo actual es: " + amex.getSaldo());
				
				break;
				
				
			case 4:
				
				System.out.println("Cambia tu maximo diario: ");
				amex.setMax(scanner.nextDouble());
				
				break;
				
			default:
				break;
			}
			
			
			
		} while (opcion != 5);
		
	
		
		

		
		
		
		
		
		
		
	}

}
