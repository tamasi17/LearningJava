package ejercicios_Mats;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		/* tira un dado 1000 veces
		   porcentajes de los resultados
		
		   para tirar el dado: funcion rand
		   en un array, salvando el cero, se van guardando las tiradas
		   
		   visualizar los porcentajes de cada resultado del 1 al 6
		   
		*/
		
		Random random = new Random();

		double uno=0;
		double dos=0;
		double tres=0;
		double cuatro=0;
		double cinco=0;
		double seis=0;
		
		// recuento de resultados
		
		for (int i=0; i<1000; i++) {
		
			int resultado = random.nextInt(6)+1;
		
			switch (resultado) {
		
				case 1:
					uno++;
					break;	

				case 2:
					dos++;
					break;

				case 3:
					tres++;
					break;

				case 4:
					cuatro++;
					break;

				case 5:
					cinco++;
					break;
			
				default:
					seis++;
		
			} 
		
		
		} //fin for
		
		// muestra porcentajes por pantalla
		
		System.out.println("Porcentajes:\n"
				+ "1: " + uno/10 + "%"
				+ "\n2: " + dos/10 + "%"
				+ "\n3: " + tres/10 + "%"
				+ "\n4: " + cuatro/10 + "%"
				+ "\n5: " + cinco/10 + "%"
				+ "\n6: " + seis/10 + "%");
		
		
	}

}