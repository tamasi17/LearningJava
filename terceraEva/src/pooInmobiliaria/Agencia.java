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
	private String nombre;
	
	
	public Agencia (String nombre) {
		this.nombre=nombre;
		this.inmuebles = new ArrayList<>();
	}
	
	
	
	
	
	
	
	
	
	
	
//	ALQUILA (PlazaGaraje, LocalComercial, Vivienda)
	
//	VENDE (Solar, Vivienda)
	
	
	
	public void addInmueble(Inmueble in) {
		this.inmuebles.add(in);
	}
	
	
	
	
	
	
	
//	inmueblesVenta(p) muestra los inmuebles con un precio de venta inferior al parametro.
	
	public String verInmueblesVenta(int precio){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if ((in instanceof Vendible) && (in.getPrecio()<precio)){ 
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}

//	verTodosAlquilerInmueble(), que muestra todos los inmuebles, la secuencia de inmuebles en alquiler de la agencia.
	
	public String verInmueblesAlquiler(){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if ((in instanceof Solar) || (in instanceof Vivienda)){
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}
	
	
	
	
//  localesSegundaMano(m), que muestra los locales comerciales de segunda mano con una superficie superior al par�metro.
	
	public String verSegundaMano(int superficie){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if (in instanceof LocalComercial){
				
				LocalComercial local = (LocalComercial) in;
				if (local.getAntiguedad() == Antiguedad.SEGUNDAMANO) { // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
					resultado+=local.toString();
				}
				
				
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}

	
	
	
	
	
	
	
	/**
	 *  Definir addInmueble()
	 

		
	
	
		
		3. solaresRusticos(), que averigua cu�ntos solares no urbanos est�n en venta. 

		fusion(Agencia a)
	
	*/
	
	
}
