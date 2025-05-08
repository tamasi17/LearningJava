package pooVuelos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class TestVuelos {

	public static void main(String[] args) {

		
		List<Vuelo> vuelos = new LinkedList<Vuelo>();
		
		Vuelo madridroma = new Vuelo("Madrid", "Roma",11, 3);
		Vuelo parismilan = new Vuelo("Paris", "Milan",10, 2);
		Vuelo cphlondres = new Vuelo("Copenhague", "Londres",15, 1);
		Vuelo oslomalaga = new Vuelo("Oslo", "Malaga",21, 5);
		Vuelo palmabarna = new Vuelo("Palma", "Barcelona",9, 1);
		
		vuelos.addAll(Arrays.asList(madridroma,parismilan,cphlondres,oslomalaga,palmabarna));
		
		
		System.out.println("----- Orden natural: \n");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.toString());
		}
		
		
		Collections.sort(vuelos, new ComparadorDuracion());
		System.out.println("-------- Orden duracion: \n");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.toString());
		}
		
		
		Collections.sort(vuelos, new ComparadorOrigen());
		System.out.println("-------- Orden por origen: \n");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.toString());
		}
		
		Collections.sort(vuelos, new ComparadorDestino());
		System.out.println("-------- Orden por destino: \n");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.toString());
		}
		
		
		Collections.sort(vuelos, new ComparadorSalida());
		System.out.println("-------- Orden por hora de salida: \n");
		for (Vuelo vuelo : vuelos) {
			System.out.println(vuelo.toString());
		}
		
		
		System.out.println("\n ----- Orden inverso (con miArray.reversed() invierte orden natural): \n" + vuelos.reversed().toString() + "\n");
		
	}

}
