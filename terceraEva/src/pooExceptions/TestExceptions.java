package pooExceptions;

public class TestExceptions {

	public static void main(String[] args) {

		
		int age = 17; // para comprobar ExceptionMayoriaEdad
		
		
		try {

			System.out.println(CheckerEdad.confirmarEdad(age));			
			
		} catch (ExceptionMayoriaEdad e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Esto siempre va a ocurrir, normalmente es para cerrar un fichero.");
		}
		
		
	}

}
