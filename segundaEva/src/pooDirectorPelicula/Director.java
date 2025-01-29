package pooDirectorPelicula;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Desarrollar una clase "Director" dentro de un paquete.
	La clase tendrá tres atributos privados que representan el nombre, el país de origen y el año de nacimiento de un director. 
	Añadir un constructor con tres argumentos correspondientes a sus tres atributos. 
	Añadir un método público llamado "imprimir", que escriba en pantalla los datos del director. 
	Para ir haciendo pruebas, añade una clase Test con el método main.
	
*/

public class Director {
	

//	Atributos
	
//	nombre, pais de origen, año de nacimiento
	
	private String nombre, pais;
	private int nacimiento;
	
	
	
//	Constructores
	
	
	public Director(String nombre, String pais, int nacimiento) {
		this.nombre = nombre;
		this.pais = pais;
		this.nacimiento = nacimiento;
	}
	
	public Director(String nombre) {
		this.nombre = nombre;
	}
	
	public Director(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	
	
	

	
//	Metodos
	
	
	
//	Getters y Setters

	
	public String getNombre() {
		return nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public int getNacimiento() {
		return nacimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	

	
//	toString
	
	
	@Override
	public String toString() {
		return (nombre != null ? nombre : "")
				+ (pais != null ? ", " + pais : "")
				+ (nacimiento != 0 ? ", " + nacimiento : "");
	}


	





	
		
	
	
	
	
	
	
	
}
