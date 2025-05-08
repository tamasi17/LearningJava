package pooPalindroma;

import java.util.ArrayList;

public class ComprobadorPalindromos {
	
    private String frase;

    public ComprobadorPalindromos(String frase) {
        this.frase = frase;
    }

    public boolean esPalindromo() {
        ArrayList<Character> caracteres = new ArrayList<>();

        // Agregar solo letras y números, ignorando espacios y pasando a minúscula
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                caracteres.add(Character.toLowerCase(c));
            }
        }

        // Comprobación de palíndromo
        int izquierda = 0;
        int derecha = caracteres.size() - 1;

        while (izquierda < derecha) {
            if (!caracteres.get(izquierda).equals(caracteres.get(derecha))) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

	/**
	 * @return the frase
	 */
	public String getFrase() {
		return frase;
	}
    
    
    
}