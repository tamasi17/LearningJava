/**
 * 
 */
package pooCircuitos;

import java.util.ArrayList;

/**
 * 
 */
public class CircuitoSerie extends Circuito {

	/**
	 * @param voltaje
	 * @param resistencias
	 */
	public CircuitoSerie(double voltaje) {
		super(voltaje);
	}

	@Override
	public double totalIntensidad() {
		double intensidad=this.voltaje;
		double resistencia=0;
		for (Resistencia r : this.resistencias) {
			resistencia += r.getOhmios();
		}
		return intensidad/resistencia;
	}

}
