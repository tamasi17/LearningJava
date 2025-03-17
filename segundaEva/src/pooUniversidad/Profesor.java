/**
 * 
 */
package pooUniversidad;

import pooPersona.Persona;

/**
 * @author Mats
 * @version 1.0.0
 */
public class Profesor extends Persona {
	
	
//	Atributos
	
	private String departamento;
	private String categoria;



	/**
	 * @param nombre
	 */
	public Profesor(String nombre) {
		super(nombre);
	}

	/**
	 * Constructor Estudiante con todos sus atributos
	 * @param nombre
	 * @param apellidos
	 * @param carrera
	 * @param semestre
	 */
	public Profesor(String nombre, String direccion, String departamento, String categoria) {
		super(nombre, direccion);
		this.departamento = departamento;
		this.categoria = categoria;
	}

	
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	
	

}
