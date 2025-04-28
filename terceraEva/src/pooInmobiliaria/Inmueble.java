/**
 * 
 */
package pooInmobiliaria;

/**
 * 
 */
public abstract class Inmueble {

	protected String ubi;
	protected int metros;
	protected static int contador=0;
	protected int id=0;
	
	// DOS TIPOS DE INMUEBLE : Superficie (precioMetroCuadrado, precio()) y Construccion (NUEVA o SEGUNDAMANO)
	
	// DOS SUPERFICIES: Solar (zona RUSTICA o URBANA) y PlazaGaraje (garaje PUBLICO o PRIVADO)
	
	// DOS CONSTRUCCIONES: Vivienda (precioAlquiler, precioVenta, habitaciones, piso) y LocalComercial (precioMetroCuadrado)
	
	
	
	/**
	 * @param ubi
	 * @param metros
	 */
	public Inmueble(String ubi, int metros) {
		this.ubi = ubi;
		this.metros = metros;
		this.id = contador++;
	}
	
	
	
	@Override
	public String toString() {
		return  (ubi != null ? "Ubicación: " + ubi + "\n" : "") 
				+ "Metros cuadrados: " + metros + "\n"
				+ "Identificador: " + id + "\n";
	}

	

	/**
	 * @return the metros
	 */
	public int getMetros() {
		return metros;
	}

	/**
	 * @param metros the metros to set
	 */
	public void setMetros(int metros) {
		this.metros = metros;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	
	
}
