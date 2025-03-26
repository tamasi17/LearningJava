/**
 * 
 */
package pooInmobiliaria;

import java.util.ArrayList;

/**
 * 
 */
public class Agencia {

	
	private ArrayList<Inmueble> inmuebles;
	
//	ALQUILA (PlazaGaraje, LocalComercial, Vivienda)
	
//	VENDE (Solar, Vivienda)
	
	
	public String verInmueblesVenta(){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if ((in instanceof Vendible)){
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}

	public String verInmueblesAlquiler(){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if ((in instanceof Solar) || (in instanceof Vivienda)){
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}
	
	
	
	/**
	 *  Definir addInmueble()
	    verTodasVentaInmueble(), que muestra todos
	los inmuebles, la secuencia de inmuebles en venta de la agencia.
	
		verTodosAlquilerInmueble(), que muestra todos
	los inmuebles, la secuencia de inmuebles en alquiler de la agencia.
		
		
		1. inmueblesVenta(p), que muestra los inmuebles con un precio de
		venta inferior al parámetro.
	
		2. localesSegundaMano(m), que muestra los locales comerciales de 
		segunda mano con una superficie superior al parámetro.
		
		3. solaresRusticos(), que averigua cuántos solares no urbanos están en venta. 

		fusion(Agencia a)
	
	*/
	
	
}
