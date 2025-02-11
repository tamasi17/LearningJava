/**
 * 
 */
package pooCuentaBancaria;

	/*
	 * 	Desarrollar un programa que modele una cuenta bancaria que tiene los siguientes atributos, que
	   	deben ser de acceso protegido:
			Saldo, de tipo float.
			Número de consignaciones con valor inicial cero, de tipo int.
			Número de retiros con valor inicial cero, de tipo int.
			Tasa anual (porcentaje), de tipo float.
			Comisión mensual con valor inicial cero, de tipo float.
			
		La clase Cuenta tiene un constructor que inicializa los atributos saldo y tasa anual con
		valores pasados como parámetros. La clase Cuenta tiene los siguientes métodos:
			
			Consignar una cantidad de dinero en la cuenta actualizando su saldo.
			Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe
			superar el saldo.
			Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
			Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés
			mensual correspondiente (invoca el método anterior).	
			Imprimir: muestra en pantalla los valores de los atributos.
	 * 
	 */



/**
 * Clase que define una Cuenta Bancaria
 */
public abstract class Cuenta {
	
	
	/**
	 * Atributos: saldo, tasa anual, consignaciones, retiros y comision mensual.
	 */
	private float saldo;
	private float tasaAnual;
	private int consignaciones=0;
	private int retiros=0;
	private float comisionMensual=0;
	
	/**
	 * Constructor con Saldo y Tasa Anual
	 * @param saldo
	 * @param tasaAnual
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	
	
//	Consignar una cantidad de dinero en la cuenta actualizando su saldo.
	
	/**
	 * Metodo para ingresar dinero, suma una consigna.
	 * @param cantidad
	 */
	public void ingresar(float cantidad) {
		this.saldo+=cantidad;
		consignaciones++;
	}
	
//	Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar el saldo.
	
	/**
	 * Metodo para sacar dinero, suma una consigna. Lanza excepcion si el saldo no es suficiente.
	 * @param cantidad
	 */
	
	public float retirar(float cantidad) throws Exception {
		
		if (cantidad>this.saldo) {
			throw new Exception("Estas intentando retirar más que el saldo disponible");
		} else {
			this.saldo-=cantidad;
			consignaciones++;			
			return cantidad;
		} // fin if
			
	}
	
//	Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
	
	public void interes() {
		
		float tasaMensual = this.tasaAnual/12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual;

	}
	
	
	
//	Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual correspondiente (invoca el método anterior).
	
	public void extractoMensual() {
		saldo -= this.comisionMensual;
		interes();
	}


//	Imprimir: muestra en pantalla los valores de los atributos (toString)

	@Override
	public String toString() {
		return saldo + ", tasaAnual: " + tasaAnual + ", consignas: " + consignaciones
				+ ", retiros: " + retiros + ", comisionMensual: " + comisionMensual;
	}
	
	
	
	
	
	
}
