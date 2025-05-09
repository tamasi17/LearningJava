package com.musicbox.model;

import java.io.Serializable;
import java.util.*;

import com.musicbox.util.Sello;

public class Artista implements Serializable {

	/**
	 * clase que no se que
	 */
	

	private int idArtista;
	private String nombre;
	private String nacionalidad;
	private String generoPrincipal;
	private List<Album> albumes;    //java evita ciclos infinitos en serializacion si Serializable esta bien implementado
	private Sello sello;

	
//	getters y setters
	
	
	
}
