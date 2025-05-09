package com.musicbox.model;

import java.io.Serializable;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.musicbox.util.Ordenable;

public class Playlist implements Serializable, Ordenable {

	/**
	 * Clase que define una Playlist. Incluye un id, titulo y descripcion.
	 * Las canciones pueden repetirse. No tienen un orden fijo.
	 */
	
	private static int contador;
	private int idPlaylist;
	private String titulo;
	private String descripcion;
	private List<Cancion> canciones;
	
	

	/**
	 * @param titulo
	 */
	public Playlist(String titulo) {
		this.titulo = titulo;
		contador++;
		this.idPlaylist=contador;
	}

	/**
	 * @return the idPlaylist
	 */
	public int getIdPlaylist() {
		return idPlaylist;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the canciones
	 */
	public List<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	public void agregarCanciones(Cancion... canciones ) {
		this.canciones.addAll(Arrays.asList(canciones));
	}
	
	public Duration getDuracionTotal() {  
		Duration dur = Duration.ZERO;
		for (Cancion cancion : canciones) {
			dur = dur.plus(cancion.getDuracion());
		}
		return dur;
	}

	@Override
	public void ordenarPorDuracion() {
		// falta ComparatorDuracion
		
	}

	@Override
	public void ordenarPorTitulo() {
		// falta ComparatorTitulo
	}
	
	
}
