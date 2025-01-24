package pooTiempo;

/**
  	Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construída indicando los tres atributos,
	sólo la hora y minuto o sólo la hora. Crear además los métodos necesarios para modificar la hora en cualquier momento de forma manual.
	Mantenga la integridad de los datos en todo momento.
	Crear una clase PruebaTiempo que prueba una hora concreta y la modifique a su gusto mostrándola por pantalla.
	
 */
public class PruebaTiempo {

	public static void main(String[] args) {

//		Creamos instancias de Fecha

		Tiempo tiempo1 = new Tiempo();
		Tiempo tiempo2 = new Tiempo(13,12);
		Tiempo tiempo3 = new Tiempo(21,30,45);
		
		System.out.println("La hora uno es: " + tiempo1.toString());
		System.out.println("La hora dos es: " + tiempo2.toString());
		System.out.println("La hora tres es: " + tiempo3.toString());
		
//		Usamos gets, sets, toString
		
		tiempo1.setHora(tiempo3.getHora());
		tiempo1.setMinuto(20);
		System.out.println("\n...cambiando hora");
		System.out.println("La hora uno ahora es: " + tiempo1.toString());
		tiempo1.setSegundo(2);
		System.out.println("...cambiando hora");
		System.out.println("La hora uno ahora es: " + tiempo1.toString());
		
		
		
	}

}
