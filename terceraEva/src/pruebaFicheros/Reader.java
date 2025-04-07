package pruebaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {


	public static void main(String[] args) throws IOException  {
		
		//Todos los animales están en una única línea
		
			
		FileReader fr = new FileReader("D:\\LearningJava\\terceraEva\\src\\pruebaFicheros\\ficheroLeer.txt");
		
		BufferedReader bf = new BufferedReader(fr);
		
		String texto = bf.readLine(); //leemos la cadena con los números String[] subcadenas = texto.split(" ");
		
		String[] subcadenas = texto.split(" "); // separamos subcadenas
		
		
		System.out.println("Lista de animales: \n");
		
		for (String palabra : subcadenas) {
			System.out.println(palabra + "\n");
		}
		
		
	}
}
			
	