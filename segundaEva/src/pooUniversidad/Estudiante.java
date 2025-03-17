/**
 * 
 */
package pooUniversidad;

import pooPersona.Persona;

/**
 * @author Mats
 * @version 1.0.0
 */
public class Estudiante extends Persona {
	
	
//	Atributos
	
	private String carrera;
	private int semestre;



	/**
	 * @param nombre
	 */
	public Estudiante(String nombre) {
		super(nombre);
	}

	/**
	 * Constructor Estudiante con todos sus atributos
	 * @param nombre
	 * @param apellidos
	 * @param carrera
	 * @param semestre
	 */
	public Estudiante(String nombre, String direccion, String carrera, int semestre) {
		super(nombre, direccion);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	/**
	 * Constructor para inicio de carrera (primer semestre)
	 * @param nombre
	 * @param carrera
	 */
	public Estudiante(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
		this.semestre=1;
	}

	/**
	 * @param nombre
	 * @param carrera
	 * @param semestre
	 */
	public Estudiante(String nombre, String carrera, int semestre) {
		super(nombre);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	
	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	
	
	
	
	

}
