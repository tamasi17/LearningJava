/**
 * 
 */
package pooAlmacen;

/**
 * 
 */
public class Ropa extends Articulo {
	
//	Atributos
	
	private Material material; // material principal: algodon, lycra, cuero, lana
	

	/**
	 * @param precio
	 * @param nombre
	 * @param codigo
	 */
	public Ropa(double precio, String nombre, Material m) {
		super(precio, nombre);
		this.material=m; 

	
	}
	
	
	
	
	
	
	

}
