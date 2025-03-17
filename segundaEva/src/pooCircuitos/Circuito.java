/**
 * 
 */
package pooCircuitos;

/**
 * 
 * Una placa electrónica está formada por una serie de circuitos, podemos añadir circuitos a la placa, y podemos calcular la intensidad total de la placa. 
 * Los circuitos podrán ser de dos tipos, circuitos en serie y circuitos en paralelo.
 * Los circuitos (ya sean serie o paralelo) sabemos que tienen las siguientes características, voltaje y un conjunto de resistencias.
 * El voltaje se nos dará en el momento de creación del circuito, en cambio las resistencias necesitamos ir añadiéndolas, con un método añadir resistencias.
 * La única diferencia de los circuitos serie y paralelo es la forma en cómo se calcula la intensidad, que ya sabemos que en los circuitos en serie es:
 * 
 * Intensidad=Voltaje/(r1+r2...)
 * 
 * En los circuitos en paralelo, la intensidad se calcula:
 * Intensidad=Intensidad1+Intensidad2+... = Voltaje1/R1+Voltaje/R2+...
 * 
 * Realiza un paquete con todas las clases que necesites, para resolver este problema.
 * 
 * El test con todas estas partes:
 * 
 * 	Crea un circuito en serie con 34 voltios, añade 3 resistencias, una de 200, una de 400 y otra de 500.
 * 	Crea otro circuito en serie con 45 voltios, y añade las resistencias de 50 y 70.
 * 	Crea un circuito en paralelo con 100 voltios y añade la resistencia de 100.
 * 	Crea una placa y añade los tres circuitos anteriores.
 * 
 * Calcula la intensidad total de la placa.
 * 
 */
public abstract class Circuito {

	protected double voltaje;
	protected ArrayList<Resistencia> resistencias;
	
	/**
	 * @param voltaje
	 * @param resistencias
	 */
	public Circuito(double voltaje, ArrayList<Resistencia> resistencias) {
		this.voltaje = voltaje;
		this.resistencias = new ArrayList<Resistencia>();
	}
	
	
	
	
	
}
