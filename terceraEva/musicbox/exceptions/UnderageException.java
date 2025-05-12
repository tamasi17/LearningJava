package exceptions;

public class UnderageException extends Exception {

	public UnderageException() {
		super("Necesitas 12 a�os para tener tu propia cuenta.");
	}

	public UnderageException(String message) {
		super(message);
	}

}
