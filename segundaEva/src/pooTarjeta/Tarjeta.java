package pooTarjeta;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Se pide que creéis una clase Tarjeta
	Tiene como características 
	El número de cuenta que se asocia con la tarjeta, el saldo de la cuenta asociada a la tarjeta, el número secreto de la tarjeta y la cantidad máxima diaria a sacar.

	Con la clase Tarjeta se puede realizar movimientos como sacar dinero, ingresar dinero y consultar el saldo
	También se puede realizar cambios en la cantidad máxima a sacar
	y realizar comprobaciones como introducir el número secreto y comprobar que sea el mismo que el de la tarjeta.

	Dentro del método de sacar dinero se tiene que tener en cuenta dos condiciones: 
	La primera es que no se puede dejar la cuenta en menos de 200 euros y la segunda que no se puede pedir sacar cantidades superiores a la cantidad máxima diaria.

	Si esto sucediera se tendría que sacar por pantalla un mensaje que dijera por qué no se ha podido realizar la operación.

	Se pide también crear un programa principal main (puede ser dentro de la clase Tarjeta o en otra clase) 
	donde se cree un objeto tarjeta (o varios) y se añadan una serie de datos.

	Por ejemplo: número de cuenta 135, saldo disponible 2320 €, saldo máximo a sacar 500 € y el número secreto 3212.

	Después realizar los pasos que supuestamente realizarías en un cajero:

	• Introducir el código clave y comprobar que es el correcto, 
	Si no, dar un mensaje de error (esto se realiza llamando al método de la clase Tarjeta que implemente esta acción).

	• Si no da error, sacar dinero de la cuenta. Podéis probar a sacar una cantidad superior a la permitida, etc.

	• Ir pidiendo por teclado una serie de números enteros e irlos sumando. 
	Se deja de pedir números al usuario cuando la cantidad supera el valor 50. 
	Escribir por pantalla la suma de todos los números introducidos.

	• Pedir al usuario dos números “a” y “b” entre el 1 y el 10. 
	Mientras uno de ellos sea menor que el otro, escribir un símbolo “*” en la pantalla e incrementar en una unidad el número menor.
	
*/

public class Tarjeta {
	

//	Atributos 

//	AUN TIENE LAS DE LIBRO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
//	título, autor (usa la clase Persona), ISBN, páginas, edición, editorial
//	lugar (ciudad y país) y fecha de edición (usa la clase Fecha).
	
	private String titulo, edicion, editorial, ciudad, pais, isbn;
	private int paginas;
	private Persona autor;
	private Fecha fechaEdicion;
	
	
	
//	Constructores
	
	public Tarjeta(String titulo, String edicion, String editorial, String ciudad, String pais, int paginas, String isbn,
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

	public Tarjeta(String titulo) {
		this.titulo=titulo;		
	}
	

	public Tarjeta(String titulo, String isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}
	

	public Tarjeta(String titulo, String isbn, Persona autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public Tarjeta(String titulo, Persona autor, Fecha fechaEdicion) {
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


	
		
	
	
	
	
	
	
	
}
