package pooCancion;
import pooPersona.Persona;
import pooFecha.Fecha;

/*
Crea una clase Cancion

*/


public class TestCancion {

	public static void main(String[] args) {

//		Creamos instancias de Cancion
		
		
		Persona interprete1 = new Persona("Andrew", "Weatherall");
		Persona interprete2 = new Persona("Amaarae");
		Cancion cancion1 = new Cancion("Frankfurt Advice - Heretic Remix", "Consolamentum", interprete1);
		Cancion cancion2 = new Cancion("Angels in Tibet");
		
		System.out.println(cancion1.toString()+"\n");
		System.out.println(cancion2.toString()+"\n");
		System.out.println("Cambiamos datos...\n");
		
//		Usamos gets, sets, toString
		
		
		cancion2.setAlbum("Fountain Baby");
		cancion2.setAutor(interprete2);
		
		System.out.println(cancion1.toString()+"\n");
		System.out.println(cancion2.toString()+"\n");
		
		
		
	}

}
