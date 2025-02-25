/**
 * 
 */
package pooAlmacen;

/**
 * 
 */
public class Electronico extends Articulo {
	
//	Atributos
	
	private double garantia = 8.5; // plus por garantia de tres años
	

	/**
	 * @param precio
	 * @param nombre
	 * @param codigo
	 */
	public Electronico(double precio, String nombre) {
		super(precio, nombre);
		this.precio+=garantia;

	
	}
	
	
	
	
	
	
	
	

}
