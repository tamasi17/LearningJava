package pruebaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {


	public static void main(String[] args) {
		
		//Todos los animales estn en una unica linea
		
		
		try {
			
			/* Descomentar para prueba en IES Filipinas
			 */
//			FileReader fr = new FileReader("D:\\LearningJava\\terceraEva\\src\\pruebaFicheros\\miFichero.txt");
		       

			/* Descomentar para prueba en MSI GF63
			 */
			FileReader fr = new FileReader("C:\\Users\\matei\\LearningJava\\terceraEva\\src\\pruebaFicheros\\miFichero.txt");	
			
			BufferedReader bf = new BufferedReader(fr);
			
			String texto = bf.readLine(); 
			
			//leemos la cadena con los numeros String[] subcadenas = texto.split(" ");
			
			String[] subcadenas = texto.split(" "); // separamos subcadenas
			
			
			System.out.println("Lista de animales: \n");
			
			for (String palabra : subcadenas) {
				System.out.println(palabra + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		
	}
}
			
	