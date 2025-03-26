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
	protected int precioBase;
	protected static int contador=0;
	protected int id=0;
	
	// DOS TIPOS DE INMUEBLE : Superficie (precioMetroCuadrado, precio()) y Construccion (NUEVA o SEGUNDAMANO)
	
	// DOS SUPERFICIES: Solar (zona RUSTICA o URBANA) y PlazaGaraje (garaje PUBLICO o PRIVADO)
	
	// DOS CONSTRUCCIONES: Vivienda (precioAlquiler, precioVenta, habitaciones, piso) y LocalComercial (precioMetroCuadrado)
	
	
	
	@Override
	public String toString() {
		return  (ubi != null ? "ubi=" + ubi + "\n" : "") 
				+ "Metros cuadrados: " + metros + "\n"
				+ "Precio original: " + precioBase + "\n"
				+ "Identificador: " + id + "\n";
	}
	
	
}
