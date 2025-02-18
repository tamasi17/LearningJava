/**
 * 
 */
package pooAlmacen;

/**
 *  Clase que define los Articulos del Almacen. Abstracta, solo se instancia Ropa, Alimento o Electronico
 *  Precio, nombre, static total, código de barras=1000 y luego se calcula +=total
 */
public abstract class Articulo {

//	Atributos
	
	
	protected float precio;
	protected String nombre;
	protected static int total;
	protected int codigo=1000;
	
//	Constructores
	
	/**
	 * @param precio
	 * @param nombre
	 * @param codigo
	 */
	public Articulo(float precio, String nombre, int codigo) {
		this.precio = precio;
		this.nombre = nombre;
		nuevoArticulo();
		this.codigo+=total;
	}
	
	
	
	
	
//	Getters y Setters
	
	
	
//	Otros metodos
	
	static void nuevoArticulo() {
		total++;
	}
	
	
}
