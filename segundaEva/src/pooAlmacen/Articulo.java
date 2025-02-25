/**
 * 
 */
package pooAlmacen;

import java.util.ArrayList;

/**
 *  Clase que define los Articulos del Almacen. Abstracta, solo se instancia Ropa, Alimento o Electronico
 *  Precio, nombre, static total, código de barras=1000 y luego se calcula +=total
 */
public abstract class Articulo {

//	Atributos
	
	
	protected double precio;
	protected String nombre;
	protected static int total;
	protected int codigo=1000;
	protected static ArrayList <Articulo> lista = new ArrayList<Articulo>();  
	
//	Constructores
	
	/**
	 * @param precio
	 * @param nombre
	 * @param codigo
	 */
	public Articulo(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
		lista.add(this);
		total++;
		this.codigo+=total;
		
	}
	
	
	
	
	
//	Getters y Setters
	
	
	
//	Otros metodos
	
	public static double precioTotal() {
		double pTotal=0;
		
		for (Articulo articulo : lista) {
			pTotal+=articulo.precio;
		}
		return pTotal;
		
	}
	
	
	
	
	
}
