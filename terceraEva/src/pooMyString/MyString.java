package pooMyString;

import java.util.*;

public class MyString {

//	Atributo un array de char
	
	private char[] cadena;

//	Constructores
	
	public MyString(String cadena) {
	    this.cadena = cadena.toCharArray();
	}

	public MyString(char[] cadena) {
	    this.cadena = Arrays.copyOf(cadena, cadena.length);
	}

	public MyString(ArrayList<Character> cadena) {
	    this.cadena = new char[cadena.size()];
	    for (int i = 0; i < cadena.size(); i++) {
	        this.cadena[i] = cadena.get(i);
	    }
	}

//	Metodos
	
	public char[] getCadena() {
	    return Arrays.copyOf(cadena, cadena.length);
	}

	public char myCharAt(int i) throws Exception {     // devuelve un char
	    if (i < 0 || i >= cadena.length) {
	        throw new Exception("Índice fuera de rango.");
	    }
	    return cadena[i];
	}

	public int myCompareTo(MyString cadena2) {
	    int i = 0;

	    while (i < this.cadena.length && i < cadena2.cadena.length) {
	        if (this.cadena[i] != cadena2.cadena[i]) {
	            return this.cadena[i] - cadena2.cadena[i];
	        }
	        i++;
	    }

	    // Si todas las letras hasta el más corto son iguales, la cadena más larga es "mayor"
	    return this.cadena.length - cadena2.cadena.length;
	}

	public int myCompareToIgnoreCase(MyString cadena2) {
	    int i = 0;

	    while (i < this.cadena.length && i < cadena2.cadena.length) {
	        char c1 = Character.toLowerCase(this.cadena[i]);
	        char c2 = Character.toLowerCase(cadena2.cadena[i]);

	        if (c1 != c2) {
	            return c1 - c2;
	        }
	        i++;
	    }
	    // Lo mismo pero todo pasado por toLowerCase
	    return this.cadena.length - cadena2.cadena.length;
	}

	
	public void myConcat(MyString cadena2) {
	    char[] nueva = new char[this.cadena.length + cadena2.cadena.length];
	    for (int i = 0; i < this.cadena.length; i++) {
	        nueva[i] = this.cadena[i];
	    }
	    for (int i = 0; i < cadena2.cadena.length; i++) {
	        nueva[this.cadena.length + i] = cadena2.cadena[i];
	    }
	    this.cadena = nueva;
	}

	
	public int myIndexOf(int caracter) {
	    for (int i = 0; i < cadena.length; i++) {
	        if (cadena[i] == (char) caracter) {
	            return i;
	        }
	    }
	    return -1;
	}

	public int myLastIndexOf(int caracter) {
	    for (int i = cadena.length - 1; i >= 0; i--) {
	        if (cadena[i] == (char) caracter) {
	            return i;
	        }
	    }
	    return -1;
	}

	
	public int myLength() {
	    return cadena.length;
	}

	
	public MyString myReplace(char antiguo, char nuevo) {
	    char[] nueva = new char[cadena.length];
	    for (int i = 0; i < cadena.length; i++) {
	        nueva[i] = (cadena[i] == antiguo) ? nuevo : cadena[i]; // si es igual que el antiguo, reemplaza por nuevo
	    }
	    return new MyString(nueva);
	}

	public MyString myToLowerCase() {
	    char[] nueva = new char[cadena.length];
	    for (int i = 0; i < cadena.length; i++) {
	        nueva[i] = Character.toLowerCase(cadena[i]);
	    }
	    return new MyString(nueva);
	}


	public MyString myToUpperCase() {
	    char[] nueva = new char[cadena.length];
	    for (int i = 0; i < cadena.length; i++) {
	        nueva[i] = Character.toUpperCase(cadena[i]);
	    }
	    return new MyString(nueva);
	}

	
	public MyString myTrim() {
	    int inicio = 0;
	    int fin = cadena.length - 1;

	    while (inicio <= fin && Character.isWhitespace(cadena[inicio])) {
	        inicio++;
	    }
	    while (fin >= inicio && Character.isWhitespace(cadena[fin])) {
	        fin--;
	    }

	    char[] nueva = new char[fin - inicio + 1];
	    for (int i = 0; i < nueva.length; i++) {
	        nueva[i] = cadena[inicio + i];
	    }

	    return new MyString(nueva);
	}

	
	public void imprimir() {
	    for (char c : cadena) {
	        System.out.print(c);
	    }
	    System.out.println();
	}

	
	public String myToString() {
	    return new String(cadena); 
	    // esto es un constructor de String que funciona directamente con un array de char
	}

	
	
}
