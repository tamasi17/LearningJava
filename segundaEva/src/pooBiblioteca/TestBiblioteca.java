package pooBiblioteca;
import pooPersona.Persona;

import java.util.Arrays;

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

Visualiza los libros.

Elimina un libro.

Visualiza los libros.

*/


public class TestBiblioteca {

	public static void main(String[] args) {

//		Creamos instancias de Biblioteca
		
		
		Biblioteca trinity = new Biblioteca("Trinity College");
		
//		addLibro
		
		Libro cien = new Libro("Cien años de Soledad");
		trinity.addLibro(cien);
		
		
		Libro rayuela = new Libro("Rayuela");
		trinity.addLibro(rayuela);
		
		
		Libro tiaJulia = new Libro("La Tia Julia y el Escribidor");
		trinity.addLibro(tiaJulia);
		
		
		
		
//		Usamos listLibros:
		
		System.out.println("La colección de " + trinity.getNombre() + ":\n" + Arrays.toString(trinity.listLibros()));
		
		
		
		
		
		
	}

}
