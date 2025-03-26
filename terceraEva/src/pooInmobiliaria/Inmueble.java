/**
 * 
 */
package pooInmobiliaria;

/**
 *  Un inmueble viene dado por su ubicación y los metros
	cuadrados que ocupa,precio y tienen un identificador. Hay dos tipos
	de inmuebles: superficies y construcciones. Los primeros tienen su
	precio por metro cuadrado. 

 * 
 */
public abstract class Inmueble {

	protected String ubi;
	protected int metros;
	protected int precio;
	protected static int contador=0;
	protected int id=0;
	
	// DOS TIPOS DE INMUEBLE : Superficie (precioMetroCuadrado) y Construccion (NUEVA o SEGUNDAMANO)
	
	// DOS SUPERFICIES: Solar (zona RUSTICA o URBANA) y PlazaGaraje (garaje PUBLICO o PRIVADO)
	
	// DOS CONSTRUCCIONES: Vivienda (precioAlquiler, precioVenta, habitaciones, piso) y LocalComercial (precioMetroCuadrado)
	
	// Agencia: conjunto de Inmuebles (ArrayList?)
	
	// Agencia: ALQUILA (PlazaGaraje, LocalComercial, Vivienda), VENDE (Solar, Vivienda)
	
	
	
}
