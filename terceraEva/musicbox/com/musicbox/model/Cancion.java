package com.musicbox.model;
import java.io.Serializable;
import java.time.Duration;
import java.util.Objects;

public class Cancion implements Comparable, Serializable {

	

	/**
	 * clase que no se que
	 */
	
	private int contador;
	private int idCancion;
	private String titulo;
	private Duration duracion; // para aprender a usar el tipo Duration
	private String genero;
	private Artista artista;
	
	
	



	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}



	/**
	 * @return the idCancion
	 */
	public int getIdCancion() {
		return idCancion;
	}



	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}



	/**
	 * @return the duracion
	 */
	public Duration getDuracion() {
		return duracion;
	}



	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}



	/**
	 * @return the artista
	 */
	public Artista getArtista() {
		return artista;
	}



	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}



	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}



	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}



	/**
	 * @param artista the artista to set
	 */
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idCancion);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return idCancion == other.idCancion;
	}
	
	
	@Override
	public int compareTo(Object o) {
										// Elegir orden natural
		return 0;
	}
	
}
