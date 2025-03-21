package pooBiblioteca;
import pooPersona.Persona;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

import pooFecha.Fecha;
import pooLibro.LibroBasico;


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
	private TreeSet<Libro> coleccion;
	private int contador=0;

	
	
	
//	Constructores
	
	/**
	 * Constructores
	 * @param nombre
	 * @param coleccion
	 */

	public Biblioteca(String nombre, TreeSet<Libro> coleccion) {
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
		this.coleccion = new TreeSet<Libro>();
	}




//	Metodos
	

	
	
//	Getters y Setters

	public String getNombre() {
		return nombre;
	}


	public TreeSet<Libro> getColeccion() {
		return coleccion;
	}


	public int getContador() {
		return contador;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setColeccion(TreeSet<Libro> coleccion) {
		this.coleccion = coleccion;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	@Override
	public String toString() {
		return  (nombre != null ? nombre : "")
				+ (coleccion != null ? "\n" 
				+ coleccion.toString() : "") 
				+ (contador != 0 ? contador + " libros." : "");	
	}
	
	
	
	
}
