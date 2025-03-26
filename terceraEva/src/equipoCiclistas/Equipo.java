/**
 * 
 */
package equipoCiclistas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que define un Equipo formado por ciclistas
 * @author Mati
 * @version 1.0.0
 * 
 */
public class Equipo {

//	Atributos
	
	private String nombreEquipo;
	private ArrayList<Ciclista> ciclistas;
	private static float tiempoTotal;
	private String pais;
	private int ganadores;

	
//	Constructor
	
	/** Constructor con el nombre del equipo
	 * @param nombreEquipo
	 */
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.ciclistas = new ArrayList<Ciclista>();
	}



	/**
	 * @param nombreEquipo
	 * @param pais
	 */
	public Equipo(String nombreEquipo, String pais) {
		this.nombreEquipo = nombreEquipo;
		this.pais = pais;
		this.ciclistas = new ArrayList<Ciclista>();
	}






//	Metodos
	
	public void addCiclista(Ciclista c) {
		this.ciclistas.add(c);
		tiempoTotal+=c.getTiempoCarrera();
	}
	
	public void listar() {
		for (Ciclista c : ciclistas) {
			c.toString();
		}
	}
	
	public static float muestraTiempoTotal() {
		return tiempoTotal;
	}
	
	public String visualizaTipoCiclista() {
		String resultado="";
		for (Ciclista c : ciclistas) {
			resultado+="\n" + c.getNombre() + ". " + c.visualizaTipoCiclista();
		}
		return resultado;
	}



	@Override
	public String toString() {
		return  (nombreEquipo != null ? "nombreEquipo=" + nombreEquipo + ", " : "")
				+ (ciclistas != null ? "ciclistas=" + ciclistas.toString() + ", " : "") 
				+ (pais != null ? "pais=" + pais : "");
	}
	
	
	
	
}
