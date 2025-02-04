package pooTarjeta;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Se pide que creéis una clase Tarjeta
	Tiene como características 
	El número de cuenta que se asocia con la tarjeta, el saldo de la cuenta asociada a la tarjeta, el número secreto de la tarjeta y la cantidad máxima diaria a sacar.

	Con la clase Tarjeta se puede realizar movimientos como sacar dinero, ingresar dinero y consultar el saldo
	También se puede realizar cambios en la cantidad máxima a sacar
	y realizar comprobaciones como introducir el número secreto y comprobar que sea el mismo que el de la tarjeta.

	Dentro del método de sacar dinero se tiene que tener en cuenta dos condiciones: 
	La primera es que no se puede dejar la cuenta en menos de 200 euros y la segunda que no se puede pedir sacar cantidades superiores a la cantidad máxima diaria.

	Si esto sucediera se tendría que sacar por pantalla un mensaje que dijera por qué no se ha podido realizar la operación.

	Se pide también crear un programa principal main (puede ser dentro de la clase Tarjeta o en otra clase) 
	donde se cree un objeto tarjeta (o varios) y se añadan una serie de datos.

	Por ejemplo: número de cuenta 135, saldo disponible 2320 €, saldo máximo a sacar 500 € y el número secreto 3212.

	Después realizar los pasos que supuestamente realizarías en un cajero:

	• Introducir el código clave y comprobar que es el correcto, 
	Si no, dar un mensaje de error (esto se realiza llamando al método de la clase Tarjeta que implemente esta acción).

	• Si no da error, sacar dinero de la cuenta. Podéis probar a sacar una cantidad superior a la permitida, etc.

	• Ir pidiendo por teclado una serie de números enteros e irlos sumando. 
	Se deja de pedir números al usuario cuando la cantidad supera el valor 50. 
	Escribir por pantalla la suma de todos los números introducidos.

	• Pedir al usuario dos números “a” y “b” entre el 1 y el 10. 
	Mientras uno de ellos sea menor que el otro, escribir un símbolo “*” en la pantalla e incrementar en una unidad el número menor.

*/


public class TestTarjeta {

	public static void main(String[] args) {

//		Creamos instancias de Tarjeta
		
		
		Tarjeta amex = new Tarjeta(135, 2320, 500, 3212);
		
		
//		try catch para sacar dinero
		
		try {
			amex.sacarDinero(2200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
//		prueba otros try catch
		
		
		
		
		
	}

}
