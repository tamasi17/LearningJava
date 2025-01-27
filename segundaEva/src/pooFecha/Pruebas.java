package pooFecha;

import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {

		LocalDate today=LocalDate.now();
		System.out.println(today);
		today.getDayOfMonth();
	
	try {
		int a=4/0;
	} catch (ArithmeticException e) {
		System.out.println("No se puede dividir por cero");
	} catch (NullPointerException e){
		// algo aqui
	} 
	
		
		
		
	}
}
