package com.musicbox.service;

import java.util.*;

import com.musicbox.model.Album;
import com.musicbox.model.Cancion;
import com.musicbox.model.Usuario;

public class Reproductor {

	/**
	 * clase que no se que
	 */
	
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
