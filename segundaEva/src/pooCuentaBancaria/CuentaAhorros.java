/**
 * 
 */
package pooCuentaBancaria;

/*
 *  La clase Cuenta tiene dos clases hijas: Cuenta de ahorros
		 
		Posee un atributo para determinar si la cuenta de ahorros está
		activa (tipo boolean). Si el saldo es menor a $10 000, la cuenta está inactiva, en caso contrario
		se considera activa. Los siguientes métodos se redefinen: Consignar: se puede consignar dinero
		si la cuenta está activa. Debe invocar al método heredado.

		Retirar: es posible retirar dinero si la cuenta está activa. Debe invocar al método
		heredado.
		
		Extracto mensual: si el número de retiros es mayor que 4, por cada retiro adicional, se
		cobra $1000 como comisión mensual. Al generar el extracto, se determina si la cuenta está
		activa o no con el saldo.
		
		Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión
		mensual y el número de transacciones realizadas (suma de cantidad de consignaciones y retiros).
		
 */



/**
 *  Clase para las Cuentas de Ahorros
 */
public class CuentaAhorros extends Cuenta {

	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}


	
	
}
