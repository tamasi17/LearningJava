package pooVuelos;

import java.util.Comparator;

public class ComparadorSalida implements Comparator<Vuelo> {

	@Override
	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getSalida()-o2.getSalida();
	}

}
