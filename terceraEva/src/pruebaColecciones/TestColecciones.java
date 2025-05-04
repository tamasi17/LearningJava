package pruebaColecciones;

import java.util.*;

public class TestColecciones {

	public static void main(String[] args) {

		
		String pedro = "Pedro";
		String paco = "Paco";
		String pamela = "Pamela";
		String pablo = "Pablo";
		String penelope = "Penelope";
		

		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();

//		Listas:  elementos en orden, permiten duplicados, acceso por indice get(index)
		
		
		arrayList.addAll(Arrays.asList(pedro,pedro,pedro,paco,pamela,pablo,penelope)); // duplicamos pedro
		linkedList.addAll(arrayList);
		linkedList.remove(6); // quitamos a Penelope
		
		System.out.println("- Array List: iterado con for each");

		for (String nombre : arrayList) {
			System.out.println(nombre);
		}
		
		System.out.println("\n- Linked List: iterado con for tradicional, sin Penelope");
		
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		System.out.println("\nElementos en nuestro ArrayList: " + arrayList.size() + "\n");
		System.out.println("Elementos en nuestro LinkedList: " + linkedList.size() + "\n");
		
		
//		Sets: no garantizan orden, no permiten duplicados.
		
		Set<String> hashSet = new HashSet<>();
		
		
		hashSet.addAll(arrayList); // nuestro arrayList tiene duplicados, pero no se añaden al hashSet.
		
		System.out.println("- Hash Set: comprobamos que no hay duplicados.");
		for (String n : hashSet) {
			System.out.println(n);
		}
		
		System.out.println("\n");
		
//		Probamos otros metodos comunes a Collections:
		
		
		arrayList.add("Jamal");
		hashSet.add("Sven");
		
		System.out.println("arrayList contains Jamal? " + arrayList.contains("Jamal"));
		System.out.println("hashSet contains Jamal? " + hashSet.contains("Jamal"));
		
		linkedList.clear();
		System.out.println("linkedList esta vacia? " + linkedList.isEmpty());
		
		arrayList.add(7, "Curtis");
		System.out.println("en que posicion de arrayList se encuentra Curtis? " + arrayList.indexOf("Curtis"));
		
		arrayList.remove(2);
		arrayList.remove(1); // remove por indices
		
		
		System.out.println("\nComprobamos nuestro arrayList:");
		for (String nombre : arrayList) {
			System.out.println(nombre);
		}
	}

}
