/**
 * 
 */
package pooCuentaBancaria;

/*
 *  La clase Cuenta tiene dos clases hijas: Cuenta corriente
		
		Posee un atributo de sobregiro, el cual se inicializa en cero. 
		Se redefinen los siguientes métodos: 
		
		Retirar: se retira dinero de la cuenta actualizando su saldo. Se
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

	
//	Atributos
	
	float sobregiro=0;
	
	/**
	 * Constructor saldo y tasa, recupera el resto del super()
	 * @param saldo
	 * @param tasaAnual
	 */
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual, 0, 0, 0);
		this.sobregiro=0;	
		}

	
	/**
	 * Constructor vacio
	 */
	public CuentaCorriente() {
		super(0, 0, 0, 0, 0);
		this.sobregiro=0;	
	}


	
//	Getters y Setters

	/**
	 * @return the sobregiro
	 */
	public double getSobregiro() {
		return sobregiro;
	}


	/**
	 * @param sobregiro the sobregiro to set
	 */
	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}

	
//	Metodos

	@Override
	public float retirar(float cantidad) throws Exception {
		/*
		  	Retirar: se retira dinero de la cuenta actualizando su saldo. Se
			puede retirar dinero superior al saldo. El dinero que se debe queda como sobregiro.
		 */
		
		if (cantidad>saldo) {
			this.sobregiro+=(cantidad-saldo);
			return super.retirar(saldo);
		} else {			
			return super.retirar(cantidad);
		}
	}
	
	
	@Override
	public void ingresar(float cantidad) {
			
		// Consignar: invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce el sobregiro.
		
		
		if (sobregiro>0) {
			float dif=cantidad-sobregiro;
			if (dif>=0) {
			super.ingresar(dif);
			this.sobregiro=0;
			} else {
				this.sobregiro-=dif;
			}
		} else {
			super.ingresar(cantidad);
		}
	}




	@Override
	public void extractoMensual() {
		super.extractoMensual();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Bienvenido a tu cuenta corriente.\nTu saldo actual: " + saldo + "\n"  
				+ (sobregiro != 0 ? "Cantidad de sobregiro actual: " + sobregiro + "\n" : "")
				+ (consignaciones != 0 ? "\n" + consignaciones + " consignaciones. " : "")
				+ (retiros != 0 ? retiros + " retiros. " : "")
				+ ((retiros+consignaciones) != 0 ? (retiros+consignaciones) + " movimientos en total. \n" : "")
				+ (tasaAnual != 0 ? tasaAnual + " tasa anual. " : "")
				+ (comisionMensual != 0 ? comisionMensual + " comision mensual.\n" : "");
	}
	
	
	
	
	
}
