package pooPalindroma;

public class testPalindroma {

	public static void main(String[] args) {

		
		ComprobadorPalindromos ejemplo1 = new ComprobadorPalindromos("Se verlas al reves");
		
        System.out.println(ejemplo1.getFrase() + "\n¿Es palíndromo? " + ejemplo1.esPalindromo());

        ComprobadorPalindromos ejemplo2 = new ComprobadorPalindromos("Cualquier frase no palindroma");
        
        System.out.println(ejemplo2.getFrase() + "\n¿Es palíndromo? " + ejemplo2.esPalindromo());
		
	}

}
