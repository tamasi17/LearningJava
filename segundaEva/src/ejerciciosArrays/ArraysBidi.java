package ejerciciosArrays;

public class ArraysBidi {
	
	
//	Clase para guardar metodos utiles en Arrays Bidimensionales
	
	
//	Incluido en: Tres en raya
	
	
//	Para mostrar por pantalla un array bidimensional:
	
	
	
	public static void muestraBidi(char[][] array) {	
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println("");
		}	

	} // fin muestraBidi
	
	
	public static void muestraBidi(int[][] array) {	
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println("");
		}	

	} // fin muestraBidi
	
	
	public static boolean posicionJugada(int a, int b, char[][] array) {	
		
		boolean posicionJugada=false;
		
		if ( array[a][b] != '-') {
			posicionJugada=true;
		}
		
		return posicionJugada;

	} // fin posicionJugada
	

	
	
	
	public static boolean ganaAlguien(char[][] array) {	// confirma si alguien ha ganado en el Tres en Raya
		
//		boolean ganaAlguien=false;
		
		for (int i = 0; i < array.length; i++) {   // for para confirmar por filas
			
			if ( (array[i][0]) != '-' && (array[i][0]) == (array[i][1]) && (array[i][2]) == (array[i][0]) ) { // que no sea '-' y que sean iguales
				return true;
//				ganaAlguien=true;
//				break;
			}		
		}	
		
		for (int j = 0; j < array.length; j++) {   // for para confirmar por columnas
			
			if ( (array[0][j]) != '-' && (array[0][j]) == (array[1][j]) && (array[2][j]) == (array[0][j]) ) { 
				return true;
//				ganaAlguien=true;
//				break;
			}
		}
		
		if ( (array[0][0]) != '-' && (array[0][0]) == (array[1][1]) && (array[2][2]) == (array[0][0]) ) {  // diagonal uno
			return true;
//			ganaAlguien=true;
		}
		
		if ( (array[0][2]) != '-' && (array[0][2]) == (array[1][1]) && (array[2][0]) == (array[0][2]) ) {  // diagonal dos
			return true;
//			ganaAlguien=true;
		}
		
//		System.out.println("Estado actual del tablero:");      //descomentar estas tres para comprobar cosas
//		ArraysBidi.muestraBidi(array);
//		System.out.println("¿Hay un ganador? " + ganaAlguien);
		
		return false;
//		return ganaAlguien;

	} // fin ganaAlguien para Tres en Raya
	
	

}