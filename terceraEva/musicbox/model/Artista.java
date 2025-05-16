package model;

import java.io.Serializable;
import java.util.*;

import util.Sello;

public class Artista implements Serializable {

	/**
	 * clase que no se que
	 */
	

	private int idArtista;
	private static int contador=1;
	private String nombre;
	private String nacionalidad;
	private String generoPrincipal;
	private List<Album> albumes;    //java evita ciclos infinitos en serializacion si Serializable esta bien implementado
	private Sello sello;
	/**
	 * @param nombre
	 */
	public Artista(String nombre) {
		this.nombre = nombre;
		this.idArtista=contador++;
	}
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
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the generoPrincipal
	 */
	public String getGeneroPrincipal() {
		return generoPrincipal;
	}
	/**
	 * @param generoPrincipal the generoPrincipal to set
	 */
	public void setGeneroPrincipal(String generoPrincipal) {
		this.generoPrincipal = generoPrincipal;
	}
	/**
	 * @return the albumes
	 */
	public List<Album> getAlbumes() {
		return albumes;
	}
	/**
	 * @param albumes the albumes to set
	 */
	public void setAlbumes(List<Album> albumes) {
		this.albumes = albumes;
	}
	/**
	 * @return the sello
	 */
	public Sello getSello() {
		return sello;
	}
	/**
	 * @param sello the sello to set
	 */
	public void setSello(Sello sello) {
		this.sello = sello;
	}
	/**
	 * @return the idArtista
	 */
	public int getIdArtista() {
		return idArtista;
	}
	/**
	 * @return the contador
	 */
	public static int getContador() {
		return contador;
	}
	@Override
	public String toString() {
		return (nombre != null ? nombre + "\n" : "")
				+ (nacionalidad != null ? nacionalidad + ", " : "")
				+ (generoPrincipal != null ? generoPrincipal + ", " : "")
				+ (sello != null ? "sello=" + sello : "")
				+ (albumes != null ? "Albumes:\n" + albumes.toString() + ", " : "");
	}

	
	
	
//	getters y setters
	
	
	
}
