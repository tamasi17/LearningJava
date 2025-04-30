/**
 * 
 */
package pooInmobiliaria;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	
	/** Estos tres puntos son un varargs, ahora podemos pasar cero, uno o N argumentos. 
	 *  Java lo convierte en array automaticamente.
	 *  Asi podemos usar addAll junto con la clase Arrays.
	 *  
	 */
	public void addInmuebles(Inmueble... inmuebles) {  
		this.inmuebles.addAll(Arrays.asList(inmuebles)); 
	}
	
	
	public String verInmuebles(){
		String resultado="";
		for (Inmueble in : inmuebles) {
					resultado+= "\n" + in.toString();
				}
		return resultado;
	}
	
	
	
	
	
	
//	inmueblesVenta(p) muestra los inmuebles con un precio de venta inferior al parametro.
	
	public String verInmueblesVenta(int precio){
		String resultado="";
		for (Inmueble in : inmuebles) {
			
			/* Esto es un smartcast, sustituye al cast original a partir de Java 16.
			 * Confirma instanceof y hace el cast en una sola linea.
			 * 
			 * if (in instanceof Vendible) {
			 *       Vendible v = (Vendible) in; // cast 'in' to Vendible
			 */
			
			if (in instanceof Vendible v) {

				if (v.getPrecioVenta() < precio) { 
					resultado+= "\n" + in.toString();
				}
			
			}
		}
		return resultado;
	}

	
	
	/**Metodo que muestra todos los inmuebles en alquiler.
	 * 
	 * @return resultado: secuencia de inmuebles en alquiler de la agencia.
	 */
	public String verInmueblesAlquiler(){  // sin usar el smartcast, pero tambien podria hacerse con instanceof Alquilable.
		String resultado="";
		for (Inmueble in : inmuebles) {
			if ((in instanceof Solar) || (in instanceof Vivienda)){
				resultado+= "\n" + in.toString();
			}
		}
		return resultado;
	}
	
	

	
	

	/**
	 * 
	 * @return locales comerciales de segunda mano con una superficie superior al parametro.
	 */
	public String verSegundaMano(int superficie){
		String resultado="";
		for (Inmueble in : inmuebles) {
			if (in instanceof LocalComercial lc){
				
				if ((lc.getAntiguedad() == Antiguedad.SEGUNDAMANO) && (lc.getMetros() > superficie)) { 
					resultado+= "\n" + in.toString();
				}
				
			}
		}
		return resultado;
	}

	
	

	/**
	 * 
	 * @return solares no urbanos en venta. 
	 */
	public String solaresRusticos() {
		String resultado="";
		
		for (Inmueble in : inmuebles) {
			
			if (in instanceof Solar s) {

				if (s.getZona() == Zona.RUSTICA) { 
					resultado+= "\n" + in.toString();
				}
			
			}
		}
		
		return resultado;
	}
	
	
	
	
	
	/**
	 * 
	 * @return viviendas a alquilar de más de 2 dormitorios.
	 */
	public String verViviendasAlquiler(){ 
		String resultado="";
		for (Inmueble in : inmuebles) {
			
			if (in instanceof Vivienda v) {

				if (v.getHabitaciones() > 2) { 
					resultado+= "\n" + in.toString();
				}
			
			}
		}
		return resultado;
	}
	
	
	
	/**
	 * 
	 * @return viviendas a vender de más de 1 dormitorio.
	 */
	public String verViviendasVenta(){ 
		String resultado="";
		for (Inmueble in : inmuebles) {
			
			if (in instanceof Vivienda v) {

				if (v.getHabitaciones() > 1) { 
					resultado+= "\n" + in.toString();
				}
			
			}
		}
		return resultado;
	}
	
	
	
	/**
	 * 
	 * @return garajes públicos.
	 */
	public String verGarajesPublicos(){ 
		String resultado="";
		for (Inmueble in : inmuebles) {
			
			if (in instanceof PlazaGaraje g) {

				if (g.getGaraje() == TipoGaraje.PUBLICO) { 
					resultado+= "\n" + in.toString();
				}
			
			}
		}
		return resultado;
	}
	
	
	
	
	/** métodofusion(ag)
	 * 
	 * @return agencia nueva a partir de la agencia que
	 *	invoca el método y la del parámetro dado..
	 */
	public Agencia fusionAgencias(Agencia otraAgencia, String nombre) {
		Agencia agenciaNueva = new Agencia(nombre);
		// Añadimos ambas agencias a la nueva, sin referenciar las anteriores.
		agenciaNueva.inmuebles.addAll(this.inmuebles);
		agenciaNueva.inmuebles.addAll(otraAgencia.inmuebles);
		return agenciaNueva;
	}
	
	
	
}
