/**
 * 
 */
package pooAtletaComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */
public class TestAtleta {

	
	public static void main(String[] args) {

		ArrayList<Atleta> atletasAL = new ArrayList<Atleta>();
		Atleta[] atletas = new Atleta[5];
		
		
		Atleta ana = new Atleta("Ana", 13);
		Atleta sofia = new Atleta("Sofia", 11);
		Atleta carlos = new Atleta("Carlos", 12);
		Atleta usain = new Atleta("Usain", 9);
		Atleta luis = new Atleta("Fede", 10);
		
		
		atletasAL.add(ana);
		atletasAL.add(sofia);
		atletasAL.add(carlos);
		atletasAL.add(usain);
		atletasAL.add(luis);
		
		System.out.println("\nArrayList sin ordenar\n");
		for (Atleta a : atletasAL) {
			System.out.println(a.getNombre() + ", " + a.getTiempo());
		}
		


		atletas = atletasAL.toArray(atletas);
		System.out.println("\nArray sin ordenar\n");
		for (Atleta atleta : atletas) {
			System.out.println(atleta.getNombre() + ", " + atleta.getTiempo());
		}
		
		Arrays.sort(atletas);
		
		
		System.out.println("\nArray Ordenado\n");
		for (Atleta atleta : atletas) {
			System.out.println(atleta.getNombre() + ", " + atleta.getTiempo());
		}
		
		System.out.println("\nArrayList Ordenado\n");
		
		Collections.sort(atletasAL);
		
		
		for (Atleta atleta : atletasAL) {
			System.out.println(atleta.getNombre() + ", " + atleta.getTiempo());
		}
	}

}
