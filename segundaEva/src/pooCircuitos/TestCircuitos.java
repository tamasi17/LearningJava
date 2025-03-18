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
		// System.out.println(c1.toString());
		
//		new circuito en serie 45v, 2res: 50, 70
		
		CircuitoSerie c2 = new CircuitoSerie(45);
		c2.addResistencia(50);
		c2.addResistencia(70);
		// System.out.println(c2.toString());
		
//		new circuito paralelo 100v, 1res: 40
		
		CircuitoParalelo c3 = new CircuitoParalelo(100);
		c3.addResistencia(100);
		
//		new placa con los tres circuitos
		
		Placa arduino = new Placa("Arduino");
		arduino.circuitos.add(c1);
		arduino.circuitos.add(c2);
		arduino.circuitos.add(c3);
		
//		intensidad total placa
		
		System.out.println(arduino.toString());
		
	}

}
