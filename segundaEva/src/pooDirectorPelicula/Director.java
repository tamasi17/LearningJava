package pooDirectorPelicula;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
	Desarrollar una clase "Director" dentro de un paquete.
	La clase tendrá tres atributos privados que representan el nombre, el país de origen y el año de nacimiento de un director. 
	Añadir un constructor con tres argumentos correspondientes a sus tres atributos. 
	Añadir un método público llamado "imprimir", que escriba en pantalla los datos del director. 
	Para ir haciendo pruebas, añade una clase Test con el método main.
	
	Parte 2 
	Desarrollar una clase "Pelicula" dentro del mismo paquete "ejercicio5". La clase tendrá tres atributos privados que representan el título, el año de producción y el director de una película. 
	Añadir tres constructores: uno que reciba únicamente el título, otro que reciba únicamente el director, y uno que no reciba argumentos. 
	Añadir los métodos get y set, así como un método público llamado toSring, que escriba en pantalla los datos de la película incluyendo los datos del director. 
	Parte 3 
	Realizar los siguientes experimentos en el método main: 
	
	Experimento1 
	- Crear un objeto director para Woody Allen, nacido en Francia en 1935. 
	- Crear un objeto película con el constructor vacío para "Manhattan". 
	- Añadir al objeto los datos de su título, año de producción (1979) y director (Woody Allen). 
	- Imprimir los datos de la película por pantalla. 
	Experimento2 
	- Crear un objeto director para Peter Jackson, nacido en Nueva Zelanda en 1961. 
	- Crear un objeto película sabiendo únicamente que se titula "El Señor de los Anillos". 
	- Completar el objeto actualizando el año de producción (2001) y director (Peter Jackson). 
	- Imprimir los datos de la película por pantalla. 

	Experimento3 
	- Crear un objeto película sabiendo únicamente que será del director Woody Allen. 
	- Completar los datos de título ("Días de Radio") y año de producción (1987). 
	- Imprimir los datos de la película por pantalla. Experimento4 
	- Actualizar el siguiente dato exactamente de la siguiente forma: "el lugar de nacimiento del director de "Días de Radio" es Estados Unidos". 
	- Imprimir de nuevo en pantalla los datos de las tres películas y observar los resultados.

 	Objetivos de los ejercicios 
 	* Practicar con conceptos básicos de una clase: paquete, atributos, constructor y métodos. 
 	* Practicar con diferentes constructores. 
 	* Aclarar que los atributos de clase pueden ser objetos de otras clases (composición). 
 	* Practicar con el concepto de sobrecarga al presentar métodos con el mismo número de argumentos pero distinto tipo. 
 	* Demostrar la utilidad de los métodos get y set para consultar y actualizar atributos privados. 


	
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
				+ (nacimiento != 0 ? nacimiento : "");
	}


	





	
		
	
	
	
	
	
	
	
}
