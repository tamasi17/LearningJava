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

	
	public double totalIntensidad() {
		double total=0;
		for (Circuito c : this.circuitos) {
			total+=c.totalIntensidad();
		}
		return total;
	}

	
	public String mostrarCircuitos() {  // para evitar el formato del toString automatico
		String info="";
		for (Circuito c : circuitos) {
			info+=c.toString();
		}
		return info;
	}
	

	@Override
	public String toString() {
		return "Placa: " + nombre + "\n"
				+ (circuitos != null ? "\n" + mostrarCircuitos() + "\n" : "") 
				+ "Total Intensidad: " + totalIntensidad();
	}

	
	
	
}
