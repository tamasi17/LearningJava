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
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Estudiante con todos sus atributos
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param carrera
	 * @param semestre
	 */
	public Estudiante(String dni, String nombre, String apellidos, String carrera, int semestre) {
		super(dni, nombre, apellidos);
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

	
	
	
	
	

}
