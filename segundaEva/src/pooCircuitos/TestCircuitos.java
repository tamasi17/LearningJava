/**
 * 
 */
package pooCircuitos;

/**
 * 
 * 	Crea un circuito en serie con 34 voltios, añade 3 resistencias, una de 200, una de 400 y otra de 500.
 * 	Crea otro circuito en serie con 45 voltios, y añade las resistencias de 50 y 70.
 * 	Crea un circuito en paralelo con 100 voltios y añade la resistencia de 100.
 * 	Crea una placa y añade los tres circuitos anteriores.
 * 
 * Calcula la intensidad total de la placa.
 * 
 */
public class TestCircuitos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
//		new circuito en serie 34v 3res: 200, 400, 500
		
		CircuitoSerie c1 = new CircuitoSerie(34);
		c1.addResistencia(200);
		c1.addResistencia(500);
		c1.addResistencia(400);
		System.out.println(c1.totalResistencia() + " ohmios.");
		System.out.println(c1.totalIntensidad() + " amperios.");
		
		System.out.println(c1.toString());
		
//		new circuito en serie 45v, 2res: 50, 70
		
//		new circuito paralelo 100v, 1res: 40
		
//		new placa con los tres circuitos
		
//		intensidad total placa
		
		
	}

}
