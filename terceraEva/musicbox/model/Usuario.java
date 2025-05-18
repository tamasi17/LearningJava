package model;

import java.io.Serializable;
import java.util.*;

import exceptions.UnderageException;


/**
 * Clase abstracta Usuario, instanciada en Usuario Estandar o Premium. Incluye excepcion comprobante de Edad en el constructor.
 */
public abstract class Usuario implements Serializable {

	
	protected int idUsuario;
	private static int contador=1;
	protected String nombre;
	protected String email;
	protected int edad;
	
	/** Constructor con comprobante de edad
	 * @exception UnderageException
	 * @param idUsuario
	 * @param nombre
	 */
	public Usuario(String nombre, int edad) throws UnderageException {
		if (edad<12) {
			throw new UnderageException();
		}
		this.idUsuario = contador++;
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**@exception UnderageException
	 * @param edad
	 */
	public void setEdad(int edad) throws UnderageException {
		if (edad<12) {
			throw new UnderageException();
		}
		this.edad = edad;
	}



	/** Reproducir permite polimorfismo en funcion de Usuario Estandar o Premium
	 */
	public abstract void reproducir(Cancion cancion);
	

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return idUsuario == other.idUsuario;
	}
	
	

}
