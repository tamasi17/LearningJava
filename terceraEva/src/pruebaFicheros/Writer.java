package pruebaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {


	public static void main(String[] args) throws IOException  {
		

		/* Descomentar para prueba en IES Filipinas
		 */
//		String rutaArchivo = "D:\\LearningJava\\terceraEva\\src\\pruebaFicheros\\escribirFichero.txt";
	       

		/* Descomentar para prueba en MSI GF63
		 */
		String rutaArchivo = "C:\\Users\\matei\\LearningJava\\terceraEva\\src\\pruebaFicheros\\escribirFichero.txt";
	       
		
		String[] lineas = {
	            "Primera linea, husares.",
	            "Segunda linea, alabarderos.",
	            "Tercera linea, arqueros."
	       };
	
		/*   SINTAXIS BASICA
		 * 
			FileWriter fw = new FileWriter(rutaArchivo);
			BufferedWriter writer = new BufferedWriter(fw);   // se puede escribir en una sola linea
		*/
		
		
		/* Try-with-resources:
		 * 
		 * Forma especial del bloque try que gestiona automáticamente el cierre de recursos
		 * (archivos, sockets o streams)
		 * 
		 * Es lo mismo que escribir un try catch con finally incluyendo writer.close();
		 */
		
	    // Escribir el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : lineas) {
                writer.write(linea);		// Escribe esa linea en el archivo
                writer.newLine();			// Salta de linea
            }
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
            return;
        }
		
		
     // Crear objeto File
        File archivo = new File(rutaArchivo);  // hay que importar clase File

        
     // Metodos utiles de la clase File, incluyendo verificar si el archivo existe
        if (archivo.exists()) {
            System.out.println("\n--- Información del archivo ---");
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("¿Es archivo?: " + archivo.isFile());
            System.out.println("¿Es directorio?: " + archivo.isDirectory());
            System.out.println("¿Se puede leer?: " + archivo.canRead());
            System.out.println("¿Se puede escribir?: " + archivo.canWrite());
            System.out.println("Tamaño (bytes): " + archivo.length());
            
        } else {
            System.out.println("El archivo no existe. No se pueden mostrar sus propiedades.");
        }

        

        
//      Comprobar el texto escrito con un Reader es complicado por los saltos de linea:
        
//      Para eso, usamos Stringbuilder
        StringBuilder contenido = new StringBuilder();
        
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
        	String linea="";
        	
        	while (( (linea = reader.readLine()) != null )) { // guarda en linea  = readLine(), que lee hasta que no quedan lineas, devuelve null.
        		contenido.append(linea).append("\n"); // acumula linea y añade salto en el Stringbuilder
        	}
        	System.out.println("\n----- Contenido del archivo -----\n" + contenido.toString());
        	
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        
        
		
		
		

		
	}
}
			
	