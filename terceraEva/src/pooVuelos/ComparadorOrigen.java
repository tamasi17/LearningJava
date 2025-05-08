package pooVuelos;

import java.util.Comparator;

public class ComparadorOrigen implements Comparator<Vuelo> {

	@Override
	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getOrigen().compareTo(o2.getOrigen());
	}

	
}
