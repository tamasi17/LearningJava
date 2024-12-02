package ejercicios_Mats;

import java.util.Scanner;

public class EvaluaParImpar {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      // Solicitamos al usuario que ingrese un número
        
		        System.out.print("Dame un número: ");
		        int numero = scanner.nextInt();

		        // si el número es cero
		        if (numero == 0) {
		            System.out.println("El número es cero.");
		        } 
		        // si el número no es cero, ver si es par o impar
		        else if (numero % 2 == 0) {
		            System.out.println("El número es par.");
		        } else {
		            System.out.println("El número es impar.");
		        }

		        scanner.close();
	
	}

}
