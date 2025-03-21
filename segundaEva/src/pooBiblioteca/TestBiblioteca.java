package pooBiblioteca;
import pooPersona.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import pooFecha.Fecha;
import pooLibro.LibroBasico;



public class TestBiblioteca {

	public static void main(String[] args) {
		
		
		Biblioteca trinity = new Biblioteca("Trinity College"); // funciona con un TreeSet llamado coleccion
		
		Libro comic1 = new Comic("Invencible", "Robert Kirkman", 130, 3);
		Libro comic2 = new Comic("Spiderman", "Stan Lee", 220, 700);
		Libro comic3 = new Comic("Batman", "Bob Kane", 220, 700);
		
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		libros.add(comic1);
		
		
		Libro en1 = new Enciclopedia("Larousse Ilustrado", "Pedro", 1002, 7);
		Libro en2 = new Enciclopedia("National Geographic", "Juan", 3503, 10);
		
		TreeSet<Libro> tree = new TreeSet<>();
		
		tree.add(en1);
		tree.add(en2);
		
		System.out.println(tree.toString());
		
				
	}

}
