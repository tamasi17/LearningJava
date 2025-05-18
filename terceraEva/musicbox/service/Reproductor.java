package service;

import java.util.*;

import model.Album;
import model.Cancion;
import model.Usuario;

/**
 * Clase que define el reproductor de las canciones, que luego delega en Usuarios para comprobar su plan: Estandar o Premium.
 * Esta es una idea por si decido continuar este proyecto.
 * Al separar Reproductor en otra clase, sigo principios de encapsulamiento que me permitiran escalar y mantener el codigo con mas facilidad.
 */
public class Reproductor {

	
	
	private final Usuario usuario;
	private final List<Cancion> historial = new ArrayList<>();
	private Cancion cancionActual;
	
	/**
	 * @param usuario
	 */
	public Reproductor(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public void reproducirAlbum(Album album) {
		for (Cancion cancion : album.getCanciones()) {
			usuario.reproducir(cancion);
		}
	}
	
//	reproducirAlbum()
//	reproducirPlaylist()   ambos for para recorrer sus respectivas listas
//	reproducirCancion()  que invoque a usuario para polimorfismo con estandar/premium
//	mostrarHistorial()
//	getCancionActual()
	
	
	
//	clase instanciable para guardar ultima cancion reproducida, historial, estadisticas, volumen...
	
//	reproducirCancion() checkea si usuario es premium o estandar
//	reproducirPlaylist()
	
	
	
}
