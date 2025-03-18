/**
 * 
 */
package pooCircuitos;

import java.util.ArrayList;

/**
 * Clase que define una Placa de Circuitos.
 */
public class Placa {
	
	protected String nombre;
	protected ArrayList<Circuito> circuitos;
	
	/**
	 * @param nombre
	 */
	public Placa(String nombre) {
		this.nombre = nombre;
		this.circuitos = new ArrayList<Circuito>();
	}



	
	
	
}
