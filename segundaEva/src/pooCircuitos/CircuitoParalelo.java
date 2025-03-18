/**
 * 
 */
package pooCircuitos;

import java.util.ArrayList;

/**
 * Una placa electrónica está formada por una serie de circuitos
 * Podemos añadir circuitos a la placa, y podemos calcular la intensidad total de la placa. 
 * Los circuitos podrán ser de dos tipos, circuitos en serie y circuitos en paralelo.
 * Los circuitos (ya sean serie o paralelo) sabemos que tienen las siguientes características, voltaje y un conjunto de resistencias.
 * El voltaje se nos dará en el momento de creación del circuito, en cambio las resistencias necesitamos ir añadiéndolas, con un método añadir resistencias.
 * 
 * En los circuitos en paralelo, la intensidad se calcula:
 * Intensidad=Intensidad1+Intensidad2+... = Voltaje1/R1+Voltaje/R2+...
 * 
 * 
 */
public class CircuitoParalelo extends Circuito {

	/**
	 * @param voltaje
	 * @param resistencias
	 */
	public CircuitoParalelo(double voltaje) {
		super(voltaje);
	}

	
	@Override
	public double totalIntensidad() {
		double intensidad=0;
		for (Resistencia r : this.resistencias) {
			intensidad += this.voltaje/r.getOhmios();
		}
		return intensidad;
	}

}
