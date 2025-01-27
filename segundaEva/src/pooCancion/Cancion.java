package pooCancion;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Desarrolla una clase Cancion con los siguientes atributos:
 		titulo: una variable String que guarda el título de la canción.
		autor: una variable String que guarda el autor de la canción.
	
*/

public class Cancion {
	

//	Atributos
	
//	título, autor (usa la clase Persona)
	
	private String titulo, album;
	private Persona autor;
	
	
	
//	Constructores
	
	

	public Cancion(String titulo) {
		this.titulo=titulo;		
	}
	

	public Cancion(String titulo, Persona autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Cancion(String titulo, String album) {
		this.titulo = titulo;
		this.album = album;
	}
	
	public Cancion(String titulo, String album, Persona autor) {
		this.titulo = titulo;
		this.album = album;
		this.autor = autor;
	}

//	Metodos

//	Getters y Setters

	public String getTitulo() {
		return titulo;
	}


	public String getAlbum() {
		return album;
	}


	public Persona getAutor() {
		return autor;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public void setAutor(Persona autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return  (titulo != null ? titulo : "")
				+ (album != null ? ", " + album : "") 
				+ (autor != null ? ", " + autor : "");
	}
	

	
	
	
	



	
		
	
	
	
	
	
	
	
}
