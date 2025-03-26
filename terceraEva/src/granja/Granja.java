/**
 * 
 */
package granja;

import java.util.ArrayList;

/**
 * Clase Granja para trabajar con ArrayLists.
 */
public class Granja {

//	Atributos
	
	private ArrayList<Animal> lista;

	/**
	 * @param lista
	 */
	public Granja() {
		this.setLista(new ArrayList<Animal>());
	}

	/**
	 * @return the lista
	 */
	public ArrayList<Animal> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<Animal> lista) {
		this.lista = lista;
	}
	
	
	
}
