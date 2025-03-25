/**
 * 
 */
package examenCiclista;

import java.util.ArrayList;

/**
 * Clase que define un Equipo formado por ciclistas
 * @author Mati
 * @version 1.0.0
 * 
 */
public class Equipo {

//	Atributos
	
	private ArrayList<Ciclista> ciclistas;
	private String nombreEquipo;
	private static float tiempoTotal;
	private int ganadores;

	
//	Constructor
	
	/** Constructor con el nombre del equipo
	 * @param nombreEquipo
	 */
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.ciclistas = new ArrayList<Ciclista>();
	}
	
	
	
/** Constructor que define una instancia de Equipo con ganadores
 * @param ciclistas
 * @param nombreEquipo
 * @param ganadores
 */
public Equipo(ArrayList<Ciclista> ciclistas, String nombreEquipo, int ganadores) {
	this.ciclistas = ciclistas;
	this.nombreEquipo = nombreEquipo;
	this.ganadores = ganadores;
}



//	Metodos
	
	public void addCiclista(Ciclista c) {
		this.ciclistas.add(c);
	}
	
	public void listar() {
		for (Ciclista c : ciclistas) {
			c.toString();
		}
	}
	
	public float calculaTiempoTotal() {
		
		return FALTA ALGO AQUI;
	}
	
	
	
}
