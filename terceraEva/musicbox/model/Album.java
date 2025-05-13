package model;

import java.io.Serializable;
import java.time.Duration;
import java.util.*;

import util.Ordenable;
import util.TipoAlbum;

public class Album implements Serializable {

	/**
	 * Clase que define un Album. Incluye un id, titulo, artista, tipo de album, fecha y genero.
	 * Las canciones no pueden repetirse. Tienen un orden fijo.
	 */
	
	private static int contador=0;
	private int idAlbum;
	private String titulo;
	private Date fecha;
	private String genero;
	private Artista artista;
	private TipoAlbum tipoAlbum;
	private final Set<Cancion> canciones; // composicion    
	
	/** Constructor basico que inicializa HashSet canciones.
	 * @param titulo
	 * @param artista
	 */
	public Album(String titulo, Artista artista) {
		this.titulo = titulo;
		this.artista = artista;
		this.canciones = new HashSet<>();
		contador++;
		this.idAlbum=contador;
	}

	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}

	/**
	 * @return the idAlbum
	 */
	public int getIdAlbum() {
		return idAlbum;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
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
	 * @return the tipoAlbum
	 */
	public TipoAlbum getTipoAlbum() {
		return tipoAlbum;
	}

	/**
	 * @return the canciones
	 */
	public Set<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	/**
	 * @param tipoAlbum the tipoAlbum to set
	 */
	public void setTipoAlbum(TipoAlbum tipoAlbum) {
		this.tipoAlbum = tipoAlbum;
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
	
	
}
