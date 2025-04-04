/**
 * 
 */
package pooInmobiliaria;

/**
 * 
 */
public abstract class Superficie extends Inmueble {

	protected int precioMetroCuadrado;
	protected int superficie;
	
	
	
	
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

	
	
	
}
