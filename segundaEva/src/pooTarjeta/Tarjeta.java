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

	
*/

/**
 * Clase que representa una Tarjeta
 */

public class Tarjeta {
	

//	Atributos 


	
//	
	
	/**
	 * Atributos:El número de cuenta que se asocia con la tarjeta, el saldo de la cuenta asociada a la tarjeta, el número secreto de la tarjeta y la cantidad máxima diaria a sacar.
	 */
	private int pin, numCuenta;
	private double saldo, max;

//	Constructores
	
	/**
	 * Constructor vacio
	 */
	public Tarjeta() {
		this.numCuenta = 135;
		this.saldo = 2320;
		this.pin = 3212;
		this.max = 500;
	}
	
	
	
	/**
	 * Constructor
	 * @param numCuenta
	 * @param saldo
	 * @param pin
	 * @param max
	 */

	public Tarjeta(int numCuenta, int saldo, int pin, int max) {
	this.numCuenta = numCuenta;
	this.saldo = saldo;
	this.pin = pin;
	this.max = max;
	}
	
	

	/**Constructor
	 * @param numCuenta
	 */
	public Tarjeta(int numCuenta) {
	this.numCuenta = numCuenta;
	}


//	Metodos
	
	/*
	 * 	Con la clase Tarjeta se puede realizar movimientos como sacar dinero, ingresar dinero y consultar el saldo
		También se puede realizar cambios en la cantidad máxima a sacar
		y realizar comprobaciones como introducir el número secreto y comprobar que sea el mismo que el de la tarjeta.
	 */
	
	
	public boolean password(int pass) {
		if (this.pin==pass) {
			return true;
		} 
		return false;
	}
	
	
	
	public double sacarDinero(double cantidad) throws Exception {
		
		if ( (this.saldo-cantidad)<200) {
		throw new Exception("No puedes. Te quedarías con menos del mínimo.\nSaldo actual: " + this.saldo );
		} else if (cantidad>max) {
			throw new Exception("Supera el máximo diario");
		} else {
			this.saldo-=cantidad;
			return cantidad;
		}
	}
	
	public void ingresarDinero(double cantidad){
		
			this.saldo+=cantidad;
	}
	
	
	
//	Getters y Setters
	

	/**
	 * @return numCuenta
	 */
	public int getNumCuenta() {
		return numCuenta;
	}

	/**
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @return the max amount of money to withdraw per day
	 */
	public double getMax() {
		return max;
	}

	/**
	 * @param numCuenta 
	 */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	/**
	 * @param saldo 
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @param pin 
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	/**
	 * @param max amount per day
	 */
	public void setMax(double max) {
		this.max = max;
	}



	@Override
	public String toString() {
		return "Tarjeta [numCuenta=" + numCuenta + ", saldo=" + saldo + ", pin=" + pin + ", max=" + max + "]";
	}	
	
	


	


	
		
	
	
	
	
	
	
	
}
