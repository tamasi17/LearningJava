package ejercicios_Mats;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {
		/*
		 * Tenemos un array para guardar las notas de una clase en formato decimal
		 * 
		 * El tamaño del array será el número de alumnos de la clase
		 * 
		 * Mostraremos el siguiente informe con datos calculados; 
		 *    Nota máxima, nota mínima, nota media, número de alumnos por encima y debajo de la media
		 * 
		 * Introducir las notas, visualizar las notas
		 * 
		 */

		// tipo [] nombreArray = new tipo[tamaño];
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Cuantos alumnos hay en Sistemas Informaticos?");
		
		// introducimos numeros
		
		int alumnos = scanner.nextInt();
		
		int i=0;             //contador para llenar el array
		
		double suma=0;       // para hacer la media
		double media=0;
		
		double min=999999;   // nota minima
		double max=0;        // nota maxima
				
		
		double[] notas = new double[alumnos];       // declarar array
		
		
		
		for (i=0; i<notas.length; i++) {        // Introduce datos con un for por posicion
			
			System.out.println("Dame la nota del alumno " + (i+1));   // introducimos notas
			notas[i] = scanner.nextDouble();
		}
		
		
		for (i=0; i<notas.length; i++) {        // Para visualizar los datos
			
			System.out.println("El alumno " + (i+1) + " tiene un: " + notas[i]);
		}
		
		
		for (i=0; i<notas.length; i++) {        // Para hacer la media
			
			suma+=notas[i];
		}
		
		System.out.println("La media es de " + (suma/notas.length)); // se puede escribir así pero
		media = suma/notas.length;                                   // necesitamos la variable media para el ultimo apartado
		
		
		
		for (i=0; i<notas.length; i++) {        // Para el maximo y minimo
			
			min = (min<notas[i]) ? min : notas[i];

			max = (max>notas[i]) ? max : notas[i];
				
		}
		
		System.out.println("La nota mínima es " + min + " y la nota máxima " + max);
		
		
		
		// si estan por encima de la media "aprueban", por debajo "suspenden"
		
		int aprobados=0;
		int suspensos=0;
		
		for (i=0; i<notas.length; i++) {        // cantidad de aprobados y suspensos
			
			if  (notas[i]>=media){
				
				aprobados++;
			} else {
				suspensos++;
			}	
				
		}
		

		double[] top = new double[aprobados]; // guarda los que aprueban
		double[] low = new double[suspensos]; // guarda los que suspenden
		int j=0;
		int k=0;
		
		
		for (i=0; i<notas.length; i++) {       // reparte las notas entre aprobadas y suspensas
			
			if  (notas[i]>=media){
				
				top[j] = notas[i];
				j++;
				
			} else {
				low[k] = notas[i];
				k++;
			}	
				
		}
		
		for (j=0; j<top.length; j++) {        // Para visualizar los datos
			
			System.out.println("El alumno aprobado " + (j+1) + " está por encima de la media con un: " + top[j]);
		}
		
		for (k=0; k<low.length; k++) {        // Para visualizar los datos
			
			System.out.println("El alumno suspenso " + (k+1) + " está por debajo de la media con un: " + low[k]);
		}	
		
		
		scanner.close();  
	
	}

}