package pooBiblioteca;
import pooPersona.Persona;

import java.util.Objects;

import pooFecha.Fecha;




public abstract class Libro implements Comparable<Libro> {
	

//	Atributos
	
	
	protected String titulo, edicion, editorial, ciudad, pais, isbn;
	protected int paginas;
	protected String autor;
	
	
	
//	Constructores
	

	public Libro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	
//	Metodos
	

	@Override
	public abstract int compareTo(Libro o);
	
	
	@Override
	public abstract String toString();
	
	
	
	
	
//	Getters y Setters

	@Override
	public int hashCode() {
		return Objects.hash(paginas);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return paginas == other.paginas;
	}


	public String getTitulo() {
		return titulo;
	}

	public String getEdicion() {
		return edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public int getPaginas() {
		return paginas;
	}

	public String getIsbn() {
		return isbn;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	
	
	


	
		
	
	
	
	
	
	
	
}
