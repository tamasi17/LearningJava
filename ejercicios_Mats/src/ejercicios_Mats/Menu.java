package ejercicios_Mats;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// un menu, si entra en las tres primeras opciones se despliegan, si es la cuarta, se sale
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Puedes elegir entre tres menús: \n"
				+ "1: Pescaito frito y presa ibérica.\n"
				+ "2: Tortilla de patatas y pimientos de padrón.\n"
				+ "3: Burratta y spaghetti carbonara.\n"
				+ "Para salir, pulsa 4.\n");
		
		int menu = 0;
		
		while (menu != 4) {
			
				
				menu = scanner.nextInt();
			 	
				switch (menu) {
				
				case 1:
					System.out.println("Pescaito frito y presa ibérica. \nQuieres algo más?");
					break;

				case 2:
					System.out.println("Tortilla de patatas y pimientos de padrón. \nQuieres algo más?");
					break;

				case 3:
					System.out.println("Burratta y spaghetti carbonara. \nQuieres algo más?");
					break;
					
				case 4:
					System.out.println("Seguro que quieres salir?");
					break;
					
				default:
					System.out.println("Puedes pedir otro menú o salir al menú principal");
					//menu = scanner.nextInt();
				
				}
				
			
		} // fin while
		
		menu = scanner.nextInt();
		
		System.out.println("\nSaliendo al menú principal. Gracias por su visita.");
		
		scanner.close();

	}

}
