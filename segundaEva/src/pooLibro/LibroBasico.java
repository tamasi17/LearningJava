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

public class LibroBasico {
	

//	Atributos
	
//	título, autor (usa la clase Persona), ISBN, páginas, edición, editorial
//	lugar (ciudad y país) y fecha de edición (usa la clase Fecha).
	
	private String titulo, edicion, editorial, ciudad, pais, isbn;
	private int paginas;
	private Persona autor;
	private Fecha fechaEdicion;
	
	
	
//	Constructores
	
	public LibroBasico(String titulo, String edicion, String editorial, String ciudad, String pais, int paginas, String isbn,
			Persona autor, Fecha fechaEdicion) {
		this.titulo = titulo;
		this.edicion = edicion;
		this.editorial = editorial;
		this.ciudad = ciudad;
		this.pais = pais;
		this.paginas = paginas;
		this.isbn = isbn;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
	}

	public LibroBasico(String titulo) {
		this.titulo=titulo;		
	}
	

	public LibroBasico(String titulo, String isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}
	

	public LibroBasico(String titulo, String isbn, Persona autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public LibroBasico(String titulo, Persona autor, Fecha fechaEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
	}

	
//	Metodos
	
	
	
//	Getters y Setters

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

	public Persona getAutor() {
		return autor;
	}

	public Fecha getFechaEdicion() {
		return fechaEdicion;
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

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public void setFechaEdicion(Fecha fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	
	
/*
	Título: Introduction to Java Programming
	3a. edición
	Autor: Liang, Y. Daniel
	ISBN: 0-13-031997-X
	Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de
	2001
	784 páginas
	
*/
	
//	El toString automatico genera los ternarios en caso de que no haya informacion en alguno de los atributos (excepto en ints que es mio)
	@Override
	public String toString() {
		return  (titulo != null ? titulo : "")
				+ (edicion != null ? edicion + " edición.\n" : "")
				+ (autor != null ? " Autor: " + autor + "\n" : "")
				+ (isbn != null ? "ISBN: " + isbn + "\n" : "")
				+ (editorial != null ? editorial + ", " : "")
				+ (ciudad != null ? ciudad + ", " : "") + (pais != null ? "(" + pais + ")\n" : "")
				+ (fechaEdicion != null ? fechaEdicion + "\n" : "")
				+ (paginas != 0 ? paginas + " paginas" : "");
	}


	
		
	
	
	
	
	
	
	
}
