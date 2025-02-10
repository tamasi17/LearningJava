/**
 * 
 */
package pooCuentaBancaria;

/*
 *  La clase Cuenta tiene dos clases hijas: Cuenta corriente
		
		Posee un atributo de sobregiro, el cual se inicializa en cero. Se
		redefinen los siguientes métodos: Retirar: se retira dinero de la cuenta actualizando su saldo. Se
		puede retirar dinero superior al saldo. El dinero que se debe queda como sobregiro.
		
		Consignar: invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce
		el sobregiro.
		
		Extracto mensual: invoca al método heredado.
		Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión
		mensual, el número de transacciones realizadas (suma de cantidad de consignaciones y retiros) y
		el valor de sobregiro.
		
		Realizar un método main que implemente un objeto Cuenta de ahorros y llame a los
		métodos correspondientes.
		
 */



/**
 * 
 */
public class CuentaCorriente extends Cuenta {

	/**
	 * 
	 */
	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}

}
