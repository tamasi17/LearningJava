package pooBiblioteca;
import pooPersona.Persona;

import java.util.Arrays;
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

/**
 * Clase que representa una Biblioteca con una coleccion de libros.
 */
public class Biblioteca {
	

//	Atributos
	
/**
 * Atributos: nombre de la biblioteca, array coleccion de libros y contador para la cantidad de libros.	
 */
	private String nombre;
	private Libro [] coleccion;
	private int contador=0;

	
	
	
//	Constructores
	
	/**
	 * Constructores
	 * @param nombre
	 * @param coleccion
	 */

	public Biblioteca(String nombre, Libro[] coleccion) {
		this.nombre = nombre;
		this.coleccion = coleccion;
		
	}
	
	/**
	 * Constructores
	 * @param nombre
	 *
	 */

	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.coleccion = new Libro[100];
	}




//	Metodos
	
	
	 /**
     * Agrega un libro a la biblioteca.
     * @param libro El libro a agregar.
     */
	
	public void addLibro(Libro libro) {
			this.coleccion[contador]=libro;
			contador++;	
	}

	/**
	 * Quita un libro de la biblioteca
	 * @param libro
	 */
	
	public void deleteLibro(Libro libro) {
		
//		Recorremos hasta contador buscando el libro
		for (int i = 0; i < contador; i++) {  
			
//			Si encontramos el libro
			if (libro.getTitulo().equals(this.coleccion[i].getTitulo())) { 
				
				// recorremos desde la posicion del libro hasta el penultimo
				for (int j = i; j < contador-1; j++) {	
					
					// sustituyendolos para que no queden espacios vacios
					this.coleccion[i]=this.coleccion[j+1];      	
				}
				
				// borramos el ultimo y reducimos contador
				this.coleccion[contador-1]=null;  
				contador--; 
				break; 
			}
		}
	}
	
	

	
	
	
//	Para mostrar los libros de una biblioteca, generamos un array solo con los libros que hay actualmente, se visualiza con bucle syso en el test
	
	/**
	 * Metodo para poder mostrar libros por pantalla
	 * @return Un array con los libros disponibles en la biblioteca.
	 */
	
	public Libro[] listLibros() {
		
//		Nuevo array de libros
		Libro[] librosDisponibles = new Libro[this.contador];
		
//		Copiamos los libros reales
		for (int i = 0; i < librosDisponibles.length; i++) {
			librosDisponibles[i]=coleccion[i];
		}
		
		return librosDisponibles;
		
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


	@Override
	public String toString() {
		return  (nombre != null ? nombre : "")
				+ (coleccion != null ? "\n" 
				+ Arrays.toString(coleccion) : "") 
				+ (contador != 0 ? contador + " libros." : "");	
	}
	
	
	
	
}
