/**
 * 
 */
package pooCircuitosGrafica;

/**
 * Clase que define una Resistencia
 * 
 * Segun he entendido el enunciado y como se comentó en clase, parece que se pedia Resistencia como una clase.
 * Otra forma de hacerlo sería usando un ArrayList<Double> llamado Resistencias como atributo de un Circuito.
 */
public class Resistencia {

//	Atributos
	
	private double ohmios; // valor de la resistencia

	
//	Constructor

	/**
	 * @param ohmios
	 */
	public Resistencia(double ohmios) {
		this.ohmios = ohmios;
	}


//	Getters y Setters
	
	/**
	 * @return the ohmios
	 */
	public double getOhmios() {
		return ohmios;
	}


	/**
	 * @param ohmios the ohmios to set
	 */
	public void setOhmios(double ohmios) {
		this.ohmios = ohmios;
	}
	
	
	
	
	
}
