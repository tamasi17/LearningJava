package pruebaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {


	public static void main(String[] args) throws IOException  {
		

		String rutaArchivo = "D:\\LearningJava\\terceraEva\\src\\pruebaFicheros\\ficheroEscribir.txt";
	       
		String[] lineas = {
	            "Primera linea, húsares.",
	            "Segunda línea, alabarderos.",
	            "Tercera línea, arqueros."
	       };
	
		
		FileWriter fw = new FileWriter(rutaArchivo);
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		
		
		
		
		
		
		
		
		FileReader fr = new FileReader(rutaArchivo);
		
		BufferedReader bf = new BufferedReader(fr);
		
		String texto = bf.readLine(); 
		
		//leemos la cadena con los números String[] subcadenas = texto.split(" ");
		
		String[] subcadenas = texto.split(" "); // separamos subcadenas
		
		
		System.out.println("Lista de animales: \n");
		
		for (String palabra : subcadenas) {
			System.out.println(palabra + "\n");
		}
		
		
	}
}
			
	