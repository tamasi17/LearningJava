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
		
		Vivienda viv1 = new Vivienda("San Blas", 84, Antiguedad.SEGUNDAMANO, 1400, 800000, 3, 1);
		Vivienda viv2 = new Vivienda("Pinar del Rey", 90, Antiguedad.NUEVA, 1500, 850000, 4, 3);
		
		Solar solar1 = new Solar("La Pedriza", 30, 75, 150000, Zona.RUSTICA);
		Solar solar2 = new Solar("Goya", 20, 90, 160000, Zona.URBANA);

		PlazaGaraje plaza1 = new PlazaGaraje("Centro", 2, 35, 200, TipoGaraje.PRIVADO);
		PlazaGaraje plaza2 = new PlazaGaraje("La Peseta", 2, 20, 100, TipoGaraje.PUBLICO);
		
		LocalComercial local1 = new LocalComercial("Vallecas", 41, Antiguedad.SEGUNDAMANO, 60);
		LocalComercial local2 = new LocalComercial("Aluche", 37, Antiguedad.NUEVA, 42);
		
		
		
		ag.addInmueble(viv1);
		
		ag.addInmuebles(viv2,solar1,solar2,plaza1,plaza2,local1,local2);
		
		
		
		// Ver todos los inmuebles
		
		System.out.println("------------Inmuebles en alquiler:--------------- \n " + ag.verInmueblesAlquiler() + "\n\n");
		
		System.out.println("----------------Inmuebles en venta: --------------- \n" + ag.verInmueblesVenta(50000000) + "\n\n");
		
		
		
		//  1.  Inmuebles con un precio de venta inferior al parametro
		
		
		
	}

}
