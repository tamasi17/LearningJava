package pooLibro;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: 
título, autor (usa la clase Persona), ISBN, páginas, edición, editorial
lugar (ciudad y país) y fecha de edición (usa la clase Fecha).

La clase debe proporcionar los siguientes servicios: accedentes y mutadores, método para leer la información y método para mostrar la información. 
Este último método mostrará la información del libro con este formato:


Título: Introduction to Java Programming
3a. edición
Autor: Liang, Y. Daniel
ISBN: 0-13-031997-X
Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de
2001
784 páginas

*/


public class TestLibro {

	public static void main(String[] args) {

//		Creamos instancias de Fecha
		
		
		Persona autor = new Persona("Y. Daniel", "Liang");
		Libro libro1 = new Libro("Introduction to Java Programming", "0-13-031997-X", autor);
		
		
		System.out.println(libro1.toString()+"\n");
		
		
//		Usamos gets, sets, toString
		
		
		Fecha fechaEdicion = new Fecha(2001,11,16);
		libro1.setFechaEdicion(fechaEdicion);
		
		System.out.println(libro1.toString()+"\n");
		
		libro1.setCiudad("New Jersey");
		libro1.setPais("USA");
		libro1.setPaginas(784);
		
		System.out.println(libro1.toString()+"\n");
		
		libro1.setEditorial("Prentice-Hall");
		
		
	}

}
