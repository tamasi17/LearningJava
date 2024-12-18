package ejerciciosArrays;

import java.util.Random;
import java.util.Scanner;

// metodos para facilitar el uso de arrays (Ahorcado, Array Circular, Contabilidad, Capicua)
// la mayoria para int y char arrays, tambien hay algun metodo cuyos parametros no son arrays pero se usan en los mismo ejercicios.




// esta clase estaba creada antes del ejercicio para clase. Los metodos de la clase Arrays original los he puesto al principio.

public class Arrays {
	
	
	
	
	
	
// 	fill basico int (Arrays original)

	public static void fill(int[] array, int a ) {	
		
		int i;
		for (i=0; i<array.length ; i++) {
			
			array[i] = a;	
		}
			
	}
	

	
//	 sort (Arrays original)
	
    public static void sort(int[] array) {
    	
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
	
	
    
    
//     binary search (implementación binaria)
    
    public static int binarySearch(int[] array, int key) {
    	
        int min = 0, max = array.length - 1;
        while (min <= max) {
            int centro = (min + max) / 2;
            if (array[centro] == key) {
                return centro;
            } else if (array[centro] < key) {
                min = centro + 1;
            } else {
                max = centro - 1;
            }
        }
        return -1; // Devuelve -1 si no se encuentra
    }
    
    
    
    
    
    
	
// 	for para rellenar int arrays

	public static int[] fillManual(int[] array ) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		for (i=0; i<array.length ; i++) {
			
			System.out.println("Dame un numero:");
			array[i] = scanner.nextInt();
			
		}
		
		
		return array;
	}
	
	
//	 for para rellenar int arrays con numeros aleatorios del 1 al 100

	public static int[] introRandom(int[] array ) {	
		
		Random rand = new Random();
		
		for (int i=0; i<array.length ; i++) {	
			array[i] = rand.nextInt(100) + 1;  // random del 1 al 100
		}	
		
		return array;
	}
	
	
	

//	 mostrar enteros por pantalla
	
	public static void muestraValores(int[] array ) {	
		
		int i;
		for (i=0; i<array.length ; i++) {
			
			System.out.print(array[i] + " ");
		}
	}
	
	
	
// 	desplazar una posicion los numeros enteros
	
	public static void desplazar(int[] array) {	

		int ultimo = array[0];
		int i;
		
		for (i=0; i<(array.length-1); i++) {
			
			array[i] = array[i+1];
		}
		
		array[i]=ultimo;
		
	}
	
	
// 	para introducir chars
	
	public static char[] introChar(char[] array ) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		for (i=0; i<array.length ; i++) {
			
			System.out.println("Dame una letra:");
			array[i] = scanner.nextLine().charAt(0);
		}
		
		
		return array;
	}
	
	
// 	mostrar palabra hecha de chars por pantalla
	
	public static void muestraPalabra(char[] array ) {	
		
		int i;
		for (i=0; i<array.length ; i++) {
			
			System.out.print(array[i]);
		}
		
		return;
	}
	
	
//	muestra respuesta Ahorcado, si los chars de ambos arrays coinciden, salen por pantalla
	
	public static void muestraRespuesta(char[] array1, char[] array2 ) {	
		
		for (int i=0; i<array1.length ; i++) {
			
			if ( array1[i] == array2[i] ) {
				
				System.out.print(array1[i]);
				
			} else {
				
				System.out.print(" _ ");
			}
			
		}
	}
	
	
	
// 	confirma si un char esta dentro del array
	
	public static boolean estaDentro(char[] array, char c) {	
		
		boolean dentro=false;
		
		for (int i=0; i<array.length ; i++) {
			
			if (array[i] == c) {
				dentro=true;
				break;
			}
			
		}
		
		return dentro;
	}
	
	
	
// 	confirma si un int esta dentro del array (tiene el mismo nombre que el del char!)
	
	public static boolean estaDentro(int[] array, int a) {	
		
		boolean dentro=false;
		
		for (int i=0; i<array.length ; i++) {
			
			if (array[i] == a) {
				dentro=true;
				break;
			}
			
		}
		
		return dentro;
	}
	
	
	
	
// 	evalua si dos char arrays tienen los mismos valores
	
	public static boolean arraysIguales(char[] array1, char[] array2) {
	    
		boolean sonIguales=true;
		
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] != array2[i]) {
	            sonIguales=false;
	        }
	    }

	    return sonIguales;
	}
	
	
// 	confirma si el char que recibimos es una letra
	
	public static boolean esLetra(char c) {
	    
		boolean esLetra=false;
		
		int caracter = (int) c;
		
		// en este entorno --> a=97, z=122, ñ=241
		
		if (((caracter>=97) && (caracter<=122)) || (caracter==241)){
			esLetra=true;
		}
		
	    return esLetra;
	}
	
	
// 	confirma si un entero es cero
	
	public static boolean esCero(int a) {
	    
		boolean esCero=false;
		
		if (a==0) {
			esCero=true;
		}
		
	    return esCero;
	}
	
	
// 	confirma si un entero es positivo
	
	public static boolean esPositivo(int a) {
	    
		boolean esPositivo=false;
		
		if (a>0) {
			esPositivo=true;
		} else if (a==0)
			esPositivo=false;
		
	    return esPositivo;
	}
	
	
//	mostrar enteros positivos por pantalla
	
	public static void muestraPositivos(int[] array ) {	
		
		int i;
		for (i=0; i<array.length ; i++) {
			if (array[i]>0) {
			System.out.print(array[i] + " ");
			}
		}	
	}
	
	
// 	mostrar enteros negativos por pantalla

	
	public static void muestraNegativos(int[] array ) {	
		
		int i;
		for (i=0; i<array.length ; i++) {
			if (array[i]<0) {
			System.out.print(array[i] + " ");
			}
		}	
	}
	
	
// 	confirma si un numero que hemos convertido en array es capicúa
	
	public static boolean esCapicua(int[] array) {	
		
		boolean capicua=true;
		
//		Un contador empieza en el principio del numero y otro en el ultimo digito. A medida que se acercan al centro, confirmamos si son iguales.
		
		for (int i=0, j=array.length-1; i<(array.length/2) ; i++, j--) {
			
			if (array[i] != array[j]) {
				capicua=false;
				break;
			}
		
		}
		
		return capicua;
	}
	
	
	
	
}