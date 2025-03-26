/**
 * 
 */
package granja;

/**Clase para el objeto Cartilla
 * @author Mati Eidelman
 * @version 1.0.0
 */

public class Cartilla {

	
//	Atributos
	
	private String veterinario;
	private int nacimiento;
	private int vacunas=0; //inicia en 0
	private int enfermedades=0; //inicia en 0
	
	
//	Constructor
	
	/**Constructor con todos los atributos
	 * @param veterinario
	 * @param nacimiento
	 * @param vacunas
	 * @param enfermedades
	 */
	public Cartilla(String veterinario, int nacimiento, int vacunas, int enfermedades) {
		this.veterinario = veterinario;
		this.nacimiento = nacimiento;
		this.vacunas = vacunas;
		this.enfermedades = enfermedades;
	}


//	Getters y Setters
	
	
	/**
	 * @param nacimiento
	 */
	public Cartilla(int nacimiento) {
		this.nacimiento = nacimiento;
	}


	/**
	 * @return the veterinario
	 */
	public String getVeterinario() {
		return veterinario;
	}


	/**
	 * @param veterinario the veterinario to set
	 */
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}


	/**
	 * @return the nacimiento
	 */
	public int getNacimiento() {
		return nacimiento;
	}


	/**
	 * @param nacimiento the nacimiento to set
	 */
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}


	/**
	 * @return the vacunas
	 */
	public int getVacunas() {
		return vacunas;
	}


	/**
	 * @param vacunas the vacunas to set
	 */
	public void setVacunas(int vacunas) {
		this.vacunas = vacunas;
	}

	
	/** Añade una vacuna
	 * @param vacunas
	 */
	public void addVacunas() {
		this.vacunas++;
	}

	/**
	 * @return the enfermedades
	 */
	public int getEnfermedades() {
		return enfermedades;
	}


	/**
	 * @param enfermedades the enfermedades to set
	 */
	public void setEnfermedades(int enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
	/** Añade una enfermedad
	 * @param vacunas
	 */
	public void addEnfermedades() {
		this.enfermedades++;
	}


	@Override
	public String toString() {
		return "Cartilla:\n" 
				+ (veterinario != null ? "Veterinario: " + veterinario + "\n" : "") 
				+ "Año de nacimiento: " + nacimiento + "\n"
				+ "Vacunas: " + vacunas + "\n"
				+ "Enfermedades: " + enfermedades + "\n";
	}


	

	
	
	
	
	
	
	

	
	
	
}
