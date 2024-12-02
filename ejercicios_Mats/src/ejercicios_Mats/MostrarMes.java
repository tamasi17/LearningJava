package ejercicios_Mats;

import java.util.Scanner;

public class MostrarMes {

	public static void main(String[] args) {
		// se introduce numero del uno al doce, nos devuelve el mes por pantalla
		// con switch case
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige un número entre 1 y 12, por favor:");
		int mes = scanner.nextInt();
		
		while (mes!=-1) {
			
			//while ((mes > 12) || (mes < 1))  NO HACE FALTA ESTE WHILE si tienes el default como opción incorrecta
			
			
			switch (mes) {
			
			case 1:
				System.out.println("El mes es Enero");
				break;
				
			
			case 2:
				System.out.println("El mes es Febrero");
				break;
				
				
			case 3:
				System.out.println("El mes es Marzo");
				break;
				
				
			case 4:
				System.out.println("El mes es Abril");
				break;
				
				
			case 5:
				System.out.println("El mes es Mayo");
				break;
				
			case 6:
				System.out.println("El mes es Junio");
				break;
				
			case 7:
				System.out.println("El mes es Julio");
				break;
				
			case 8:
				System.out.println("El mes es Agosto");
				break;
				
			case 9:
				System.out.println("El mes es Septiembre");
				break;
				
			case 10:
				System.out.println("El mes es Octubre");
				break;
				
			case 11:
				System.out.println("El mes es Noviembre");
				break;
				
			case 12:
				System.out.println("El mes es Diciembre");
				break; 
				
			default:
				System.out.println("Elige un número entre 1 y 12, por favor:");
			
					
			}
			mes = scanner.nextInt();			
						
		} //final while mes hasta que -1
		
		System.out.println("Hasta pronto!");
		scanner.close();
		
	}

}
