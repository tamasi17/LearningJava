package pooBiblioteca;
import pooPersona.Persona;

import java.util.Iterator;

import pooFecha.Fecha;
import pooLibro.Libro;

/*
	Una biblioteca tiene un nombre (String) y una colección de libros. 
	Se requiere que la biblioteca tenga un constructor que reciba el nombre de la biblioteca e inicialize la colección de libros. 
	La biblioteca posee  los métodos:

	addLibro() agrega un libro a la biblioteca
	deleteLibro() elimina un libro de la biblioteca.
	listLibros()  visualiza todos los libros de la biblioteca.
	El Libro tiene titulo, autor, editorial,isbn, todos String 
	y año de publicación es un int.

	Añade 3 Libros.(Cien años de soledad, Rayuela, la Tia Julia y el escribidor)

	Visualiza lo libros.

	Elimina un libro.

	Visualiza los libros.
	
*/

public class Biblioteca {
	

//	Atributos
	
//	nombre y coleccion de libros
	
	private String nombre;
	private Libro [] coleccion = new Libro[100];
	private int contador=0;

	
	
	
//	Constructores

	public Biblioteca(String nombre, Libro[] coleccion) {
		this.nombre = nombre;
		this.coleccion = coleccion;
		
	}


//	Metodos
	
	
	public void addLibro(Libro libro) {
			this.coleccion[contador]=libro;
			contador++;
		
	}

	public void deleteLibro(Libro libro) {
		
		for (int i = 0; i < contador; i++) {  // recorremos hasta contador buscando el libro
			
			if (libro.getTitulo().equals(this.coleccion[i].getTitulo())) { // si encontramos el libro
				
				for (int j = i; j < contador-1; j++) {			// recorremos desde la posicion del libro hasta el penultimo	
					this.coleccion[i]=this.coleccion[j+1];      // sustituyendolos para que no queden espacios vacios	
				}
				this.coleccion[contador-1]=null;  // borramos el ultimo
				contador--; // reducimos contador
				break; // y paramos el proceso
			}
		}
	}
	
	
	
//	Getters y Setters

	public String getNombre() {
		return nombre;
	}


	public Libro[] getColeccion() {
		return coleccion;
	}


	public int getContador() {
		return contador;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setColeccion(Libro[] coleccion) {
		this.coleccion = coleccion;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}
	
	


	
	
	
	
	

	
	
	
/*
	
//	El toString automatico genera los ternarios en caso de que no haya informacion en alguno de los atributos.
	@Override
	public String toString() {
		return "Libro: \n" + (titulo != null ? "Titulo: " + titulo + "\n" : "")
				+ (edicion != null ? edicion + " edición.\n" : "")
				+ (autor != null ? "Autor: " + autor + "\n" : "")
				+ (isbn != null ? "ISBN: " + isbn + "\n" : "")
				+ (editorial != null ? editorial + ", " : "")
				+ (ciudad != null ? ciudad + ", " : "") + (pais != null ? "(" + pais + ")\n" : "")
				+ (fechaEdicion != null ? fechaEdicion + "\n" : "")
				+ (paginas != 0 ? paginas + " paginas" : "");
	}

*/
	
		
	
	
	
	
	
	
	
}
