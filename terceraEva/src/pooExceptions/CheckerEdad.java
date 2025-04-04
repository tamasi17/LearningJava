package pooExceptions;

public class CheckerEdad {

	
	public static String confirmarEdad(int age) throws ExceptionMayoriaEdad{
		
		if (age<18) {
			throw new ExceptionMayoriaEdad("Crece un poco pringao");
		}
		
		return "Acceso permitido";	
		
	}
	
	
	
}
