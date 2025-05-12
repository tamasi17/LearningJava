package model;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Cancion> {

	@Override
	public int compare(Cancion c1, Cancion c2) {
		return c1.getTitulo().compareTo(c2.getTitulo());
	}

}
