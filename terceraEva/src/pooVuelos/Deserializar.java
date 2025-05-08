package pooVuelos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Deserializar {

	public static void main(String[] args) {
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vuelos.ser"))){
			LinkedList<Vuelo> vuelos = (LinkedList<Vuelo>) ois.readObject();
			System.out.println(vuelos.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
