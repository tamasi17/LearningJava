package pooDirectorPelicula;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Parte 2 
	Desarrollar una clase "Pelicula" dentro del mismo paquete "ejercicio5". 
	La clase tendrá tres atributos privados que representan el título, el año de producción y el director de una película. 
	Añadir tres constructores: uno que reciba únicamente el título, otro que reciba únicamente el director, y uno que no reciba argumentos. 
	Añadir los métodos get y set, toString.
	
*/

public class Pelicula {
	

//	Atributos
	
//	título, año de produccion, director
	
	private String titulo;
	private Director director;
	private int produccion; //año de produccion
	
	
//	Constructores
	
	
	public Pelicula() {
	}
	
	
	public Pelicula(String titulo, Director director, int produccion) {
		this.titulo = titulo;
		this.director = director;
		this.produccion = produccion;
	}


	public Pelicula(String titulo) {
	this.titulo = titulo;
	}


	public Pelicula(Director director) {
		this.director = director;
	}


//	Metodos
	
	
//	Getters y Setters


	
	

	


	public String getTitulo() {
		return titulo;
	}


	public Director getDirector() {
		return director;
	}


	public int getProduccion() {
		return produccion;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setDirector(Director director) {
		this.director = director;
	}


	public void setProduccion(int produccion) {
		this.produccion = produccion;
	}


	@Override
	public String toString() {
		return (titulo != null ? titulo : "")
				+ (produccion != 0 ? " (" + produccion + ")" : "")
				+ (director != null ? ", " + director : "");
	}

	
		
	
	
	
	
	
	
	
}
