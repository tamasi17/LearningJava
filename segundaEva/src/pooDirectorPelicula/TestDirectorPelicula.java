package pooDirectorPelicula;

/*
	Parte 3: Realizar los siguientes experimentos en el método main: 
	
	Experimento1 
	- Crear un objeto director para Woody Allen, nacido en Francia en 1935. 
	- Crear un objeto película con el constructor vacío para "Manhattan". 
	- Añadir al objeto los datos de su título, año de producción (1979) y director (Woody Allen). 
	- Imprimir los datos de la película por pantalla. 
	
	Experimento2 
	- Crear un objeto director para Peter Jackson, nacido en Nueva Zelanda en 1961. 
	- Crear un objeto película sabiendo únicamente que se titula "El Señor de los Anillos". 
	- Completar el objeto actualizando el año de producción (2001) y director (Peter Jackson). 
	- Imprimir los datos de la película por pantalla. 

	Experimento3 
	- Crear un objeto película sabiendo únicamente que será del director Woody Allen. 
	- Completar los datos de título ("Días de Radio") y año de producción (1987). 
	- Imprimir los datos de la película por pantalla. Experimento4 
	- Actualizar el siguiente dato exactamente de la siguiente forma: "el lugar de nacimiento del director de "Días de Radio" es Estados Unidos". 
	- Imprimir de nuevo en pantalla los datos de las tres películas y observar los resultados.

 	Objetivos de los ejercicios 
 	* Practicar con conceptos básicos de una clase: paquete, atributos, constructor y métodos. 
 	* Practicar con diferentes constructores. 
 	* Aclarar que los atributos de clase pueden ser objetos de otras clases (composición). 
 	* Practicar con el concepto de sobrecarga al presentar métodos con el mismo número de argumentos pero distinto tipo. 
 	* Demostrar la utilidad de los métodos get y set para consultar y actualizar atributos privados. 



*/


public class TestDirectorPelicula {

	public static void main(String[] args) {
		
		
/*		Experimento1

		Crear un objeto director para Woody Allen, nacido en Francia en 1935. 
		Crear un objeto película con el constructor vacío para "Manhattan". 
		Añadir al objeto los datos de su título, año de producción (1979) y director (Woody Allen). 
		Imprimir los datos de la película por pantalla.
*/		
		
		Director woody = new Director("Woody Allen", "Francia",1935);
		Pelicula manhattan = new Pelicula();
		manhattan.setTitulo("Manhattan");
		manhattan.setProduccion(1979);
		manhattan.setDirector(woody);
		
		System.out.println(manhattan.toString()+"\n");

		
/*		Experimento2
 
		Crear un objeto director para Peter Jackson, nacido en Nueva Zelanda en 1961. 
		Crear un objeto película sabiendo únicamente que se titula "El Señor de los Anillos". 
		Completar el objeto actualizando el año de producción (2001) y director (Peter Jackson). 
		Imprimir los datos de la película por pantalla.
*/		
		
		Director peter = new Director("Peter Jackson", "NZ",1961);
		Pelicula anillos = new Pelicula("El Señor de los Anillos");
		anillos.setProduccion(2001);
		anillos.setDirector(peter);
		
		System.out.println(anillos.toString()+"\n");
		
		
/*	Experimento3
  
	Crear un objeto película sabiendo únicamente que será del director Woody Allen. 
	Completar los datos de título ("Días de Radio") y año de producción (1987). 
	Imprimir los datos de la película por pantalla. 
	
	Experimento4 
	Actualizar el siguiente dato exactamente de la siguiente forma: "el lugar de nacimiento del director de "Días de Radio" es Estados Unidos". 
	Imprimir de nuevo en pantalla los datos de las tres películas y observar los resultados.
*/		
		
		Pelicula radio = new Pelicula(woody);
		radio.setProduccion(1987);
		radio.setTitulo("Dias de Radio");
		
		System.out.println(radio.toString()+"\n");
		
		
		radio.getDirector().setPais("USA");
		
		System.out.println(radio.toString()
				+"\n" + anillos.toString()
				+"\n" + manhattan.toString());
		
		

		
		
	}

}
