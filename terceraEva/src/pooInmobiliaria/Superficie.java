/**
 * 
 */
package pooInmobiliaria;

/**
 * 
 */
public abstract class Superficie extends Inmueble {

	protected int precioMetroCuadrado;
	
	
	
	/**
	 * @param precioMetroCuadrado
	 * @param superficie
	 */
	public Superficie(String ubi, int metros, int precioMetroCuadrado) {
		super(ubi, metros);
		this.precioMetroCuadrado = precioMetroCuadrado;
	}


	/**
	 * @return the precioMetroCuadrado
	 */
	public int getPrecioMetroCuadrado() {
		return precioMetroCuadrado;
	}
	/**
	 * @param precioMetroCuadrado the precioMetroCuadrado to set
	 */
	public void setPrecioMetroCuadrado(int precioMetroCuadrado) {
		this.precioMetroCuadrado = precioMetroCuadrado;
	}	
	
	public int getPrecio() {
		return this.precioMetroCuadrado*this.metros;
	}


	@Override
	public String toString() {
		return super.toString() + "Precio metro cuadrado: " + precioMetroCuadrado + "\nSuperficie: ";
	}

	
	
	
}
