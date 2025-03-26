/**
 * 
 */
package granja;

/**Clase para el objeto Animal
 * @author Mati Eidelman
 * @version 1.0.0
 */

public class Animal {

	
//	Atributos
	
	private String nombre; // nombre del animal
	private int edad;
	private static int totalAnimales=0; //inicia en 0
	private static int totalEnfermedades=0; //inicia en 0, recuento de enfermedades de todos los animales
	private static int totalVacunas=0; //inicia en 0, recuento de vacunas de todos los animales
	private Cartilla cartilla; // se crea el objeto cartilla con el new en el constructor de Animal
	private Granja granja; // los animales pertenecen a una granja
	
	
//	Constructor

	
	/** Constructor con el nombre y la edad del animal
	 * @param nombre
	 * @param edad
	 * @throws Exception 
	 */
	public Animal(String nombre, int edad, Granja granja) throws Exception {
		if (edad>0) {
		this.edad = edad;
		this.nombre = nombre;
		totalAnimales++;
		this.granja=granja;
		this.granja.getLista().add(this);
		this.cartilla= new Cartilla(2025-edad); // constructor solo con fecha de nacimiento
		} else {
			throw new Exception("La edad de " + nombre + " tiene que ser mayor que cero.");
		}
	}
	
	

//	Getters y Setters
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) throws Exception {
		if (edad<0) {
			throw new Exception("La edad no puede ser negativa");
		} else {
			this.edad = edad;
		}
		
	}


	/**
	 * @return the totalAnimales
	 */
	public static int getTotalAnimales() {
		return totalAnimales;
	}

	// Elimino el set de totalAnimales, se controla automaticamente.

	


	/**
	 * @return the totalEnfermedades
	 */
	public static int getTotalEnfermedades() {
		return totalEnfermedades;
	}


	/**
	 * @return the totalVacunas
	 */
	public static int getTotalVacunas() {
		return totalVacunas;
	}


	/**
	 * @param totalVacunas the totalVacunas to set
	 */
	public static void setTotalVacunas(int totalVacunas) {
		Animal.totalVacunas = totalVacunas;
	}



	/**
	 * @return the cartilla
	 */
	public Cartilla getCartilla() {
		return cartilla;
	}


	/**
	 * @return the granja
	 */
	public Granja getGranja() {
		return granja;
	}



	/**
	 * @param granja the granja to set
	 */
	public void setGranja(Granja granja) {
		this.granja = granja;
	}


//	Otros metodos
	
	

	public String hacerSonido() {
		return "Hace sonidos de animal...";
	}
	public String comer() {
		return "Come...";
	}
	public String moverse() {
		return "Se mueve...";
	}
	
	public void enfermar(String vet) {
 
		this.cartilla.setVeterinario(vet);
		this.cartilla.addEnfermedades();
		this.totalEnfermedades++;
		
	}
	
	public void vacunar(String vet) {
		
		this.cartilla.setVeterinario(vet);
		this.cartilla.addVacunas();
		this.totalVacunas++;
		
	}


	
	
	@Override
	public String toString() {
		return  (nombre != null ? nombre + "\n" : "") 
				+ (edad > 0 ? "Edad: " + this.edad : "") + "\n"
				+ (cartilla != null ? cartilla.toString() : "");
	}

	

	
	
	
	
}
