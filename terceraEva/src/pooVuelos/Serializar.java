package pooVuelos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Serializar {

	public static void main(String[] args) {
		
		List<Vuelo> vuelos = new LinkedList<Vuelo>();
		
		Vuelo madridroma = new Vuelo("Madrid", "Roma", 3);
		Vuelo parismilan = new Vuelo("Paris", "Milan", 2);
		Vuelo cphlondres = new Vuelo("Copenhague", "Londres", 1);
		Vuelo oslomalaga = new Vuelo("Oslo", "Malaga", 5);
		
		vuelos.addAll(Arrays.asList(madridroma,parismilan,cphlondres,oslomalaga));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vuelos.ser"))){
			oos.writeObject(vuelos);
			System.out.println("Archivo guardado.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
