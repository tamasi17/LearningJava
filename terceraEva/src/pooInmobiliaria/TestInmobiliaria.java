/**
 * 
 */
package pooInmobiliaria;

/**
 * 
 */
public class TestInmobiliaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/**
		
		Definir un m�todo p�blico precio() que calcula el precio que tiene
		una superficie.
		
		Definir un m�todo verTodasVentaInmueble(), que muestra todos
		los inmuebles, la secuencia de inmuebles en venta de la agencia.

		Definir un m�todo verTodosAlquilerInmueble(), que muestra todos
		los inmuebles, la secuencia de inmuebles en alquiler de la agencia.
		
		1. inmueblesVenta(p), que muestra los inmuebles con un precio de
		venta inferior al par�metro.
		2. localesSegundaMano(m), que muestra los locales comerciales de
		segunda mano con una superficie superior al par�metro.
		3. solaresRusticos(), que averigua cu�ntos solares no urbanos est�n
		en venta. 
		
		4.Ver todas las viviendas a alquilar de m�s de dos dormitorios.
		5.Ver todas las viviendas para comprar de m�s de 1 dormitorios.
		6.Ver todos los garajes p�blicos.
		
		*/
		
		
		Agencia ag = new Agencia("Evergrande");
		
		Vivienda viv1 = new Vivienda(1000, 600000, 3, 2, Antiguedad.SEGUNDAMANO);
		Vivienda viv2 = new Vivienda(1300, 750000, 4, 1, Antiguedad.NUEVA);
		Solar solar1 = new Solar();
		PlazaGaraje plaza1 = new PlazaGaraje();
		LocalComercial local1 = new LocalComercial(12, 42, Antiguedad.NUEVA); //params
		
		
		ag.addInmueble(viv1);
		
		
		
		
		//  1.  Inmuebles con un precio de venta inferior al parametro
		
		
		
	}

}
