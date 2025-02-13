/**
 * 
 */
package pooCuentaBancaria;

/*
 *  La clase Cuenta tiene dos clases hijas: Cuenta de ahorros
		 
		Posee un atributo para determinar si la cuenta de ahorros está
		activa (tipo boolean). Si el saldo es menor a $10 000, la cuenta está inactiva, en caso contrario
		se considera activa. Los siguientes métodos se redefinen: 
		
		Consignar: se puede consignar dinero si la cuenta está activa. Debe invocar al método heredado.

		Retirar: es posible retirar dinero si la cuenta está activa. Debe invocar al método
		heredado.
		
		Extracto mensual: si el número de retiros es mayor que 4, por cada retiro adicional, se
		cobra $1000 como comisión mensual. Al generar el extracto, se determina si la cuenta está
		activa o no con el saldo.
		
		Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión
		mensual y el número de transacciones realizadas (suma de cantidad de consignaciones y retiros).
		
 */

/**
 * Clase para las Cuentas de Ahorros
 */
public class CuentaAhorros extends Cuenta {

//	Atributos

	private boolean estaActiva;
	private int retiros=0;

	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if (saldo > 10000) {
			estaActiva = true;
		}
	}

	/**
	 * Constructor vacio
	 */
	public CuentaAhorros() {
	}

//	Consignar una cantidad de dinero en la cuenta actualizando su saldo.

	/**
	 * Metodo para ingresar dinero, suma una consigna.
	 * 
	 * @param cantidad
	 */
	public void ingresar(float cantidad) {
		if (estaActiva) {
			this.saldo += cantidad;
			consignaciones++;
		} else {
			System.out.println("Tu cuenta no está activa.");
		}

	}

//	Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar el saldo.

	/**
	 * Metodo para sacar dinero. Lanza excepcion si el saldo no es suficiente o la cuenta no esta activa. 
	 * 
	 * @param cantidad
	 */

	public float retirar(float cantidad) throws Exception {

		if (estaActiva) {
			if (cantidad > this.saldo) {
				throw new Exception("Estas intentando retirar más que el saldo disponible");
			} else {
				this.saldo -= cantidad;
				retiros++;
				if (retiros>4) {
					this.comisionMensual+=1000;
				}
				return cantidad;
			} 	
		} else {
			throw new Exception("Tu cuenta no está activa.");
		}
		
		

	}

//	Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual correspondiente (invoca el método anterior).

	
	public void extractoMensual() {
		saldo -= this.comisionMensual;
		interes();
		if (saldo>10000) {  // esto por qué?
			estaActiva=true;
		}
		
	}

//	Imprimir: muestra en pantalla los valores de los atributos (toString)

	
	
	@Override
	public String toString() {
		return "Tu saldo: " + saldo + ""  
				+ (consignaciones != 0 ? consignaciones + " consignaciones." : "")
				+ (retiros != 0 ? retiros + " retiros." : "")
				+ (retiros != 0 ? retiros + " retiros." : "")
				+ ", comisionMensual: " + comisionMensual;
	}
	



}
