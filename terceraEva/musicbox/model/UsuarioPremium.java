package model;

import java.io.Serializable;
import java.util.*;

import exceptions.UnderageException;

/**
 * Clase que define a un usuario Premium (sin anuncios).
 */
public class UsuarioPremium extends Usuario {

	
	protected int idUsuario;
	protected String nombre;
	protected String email;
	protected int edad;
	
	/** Constructor con comprobante de edad
	 * @exception UnderageException
	 * @param idUsuario
	 * @param nombre
	 */
	public UsuarioPremium(String nombre, int edad) throws UnderageException {
		super(nombre, edad);
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
		if (edad<13) {
			throw new UnderageException();
		}
		this.edad = edad;
	}



	/** Reproducir permite polimorfismo en funcion de Usuario Estandar o Premium
	 */
	public void reproducir(Cancion cancion) {
		System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista() + " (" + cancion.getDuracion() + ")");
		System.out.println(".\n..\n...\nPasate al plan premium para escuchar tu musica sin anuncios!");
	}
	

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
		UsuarioPremium other = (UsuarioPremium) obj;
		return idUsuario == other.idUsuario;
	}



	@Override
	public String toString() {   
		return (nombre != null ? nombre + "\n" : "")
				+ (edad > 0 ? "Edad: " + edad + "\n" : "")
				+ (email != null ? "Email: " + email : "")
				+ "\nUsuario Premium";
	}
	
	
	

}
