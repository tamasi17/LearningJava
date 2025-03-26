/**
 * 
 */
package granja;

import java.util.Iterator;

/**
 * Para comprobar Animal, Cartilla, Perro y Gato
 */
public class TestGranja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instancia Granja de animales
		
		Granja filipinas = new Granja();
		
		try {
			
			// Try Catch para la excepcion de la edad (tiene que ser positiva)
			// Puedes probar a introducir una edad negativa.
			
//			Creamos instancias de Perro (3) y Gato (2).
			
			Perro mastin = new Perro("Rufo", 7, filipinas, "Mastin", "Alto");
			Perro corgi = new Perro("Toby", 4, filipinas, "Corgi", "Alto");
			Perro shiba = new Perro("Hachiko", 5, filipinas, "Shiba Inu", "Bajo");
			
			Gato pardo = new Gato("Fred", 3, filipinas, "Marron", "Belgica");
			Gato persa = new Gato("Jasper", 3, filipinas, "Blanco", "Armenia");
			
//			Agregamos a los animales a la granja directamente desde el constructor.
			
			
//			Vacunamos a todos
			
			for (Animal animal : filipinas.getLista()) {
				animal.vacunar("Paco");
			}
			
			
//			Enfermamos a alguno
			
			persa.enfermar("Adam");
			corgi.enfermar("Richard");
			
//			Mostramos sonidos, lo que comen, como se mueven
			
			for (Animal animal : filipinas.getLista()) {
				System.out.println(animal.getNombre() + ":\n" + animal.hacerSonido());
				System.out.println(animal.comer());
				System.out.println(animal.moverse() + "\n");
			}
			
//			Mostramos total de animales historico 
			System.out.println("Total animales calculado con el static: " + Animal.getTotalAnimales());
			
//			Este seria el total actual, cambiaria si alguna vez un animal no formase parte de la granja
			System.out.println("Total calculado con el size de la ArrayList: " + filipinas.getLista().size());
			
			
//			Tambien he incluido totales de vacunas y enfermedades tambien)
			System.out.println("Total enfermedades: " + Animal.getTotalEnfermedades());
			System.out.println("Total vacunas: " + Animal.getTotalVacunas() + "\n");
			
			
			for (Animal animal : filipinas.getLista()) {
				System.out.println(animal.toString());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
		
		
		
		
		
		
	}

}
