package pooAtletaComparable;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Atleta> {

	@Override
	public int compare(Atleta a, Atleta b) {
		return a.getNombre().compareTo(b.getNombre());
	}

}
