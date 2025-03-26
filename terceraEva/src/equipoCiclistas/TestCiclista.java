/**
 * 
 */
package equipoCiclistas;

/**
 * 
 */
public class TestCiclista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Equipo sky = new Equipo("Sky", "USA");
		
		Ciclista vel = new Velocista("Geralt Thomas", 90, 80, 120);
		
		sky.addCiclista(vel);
		
		// CAMBIA TOSTRING PARA VER POTENCIAS Y COSAS DE ESAS
		System.out.println(sky.toString());
		
		System.out.println(sky.visualizaTipoCiclista());
		
		System.out.println("Tiempo total: " + sky.muestraTiempoTotal());
	}

}
