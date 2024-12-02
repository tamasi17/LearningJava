package ejercicios_Mats;

import java.util.Scanner;

public class TresEnRayaNotWorking {

	public static void main(String[] args) {

//		Tres en raya con array bidimensional.
		
		
//		Array bidimensional, dos opciones X y O, una para cada turno, asi la jugadora solo tiene que elegir posicion. 
		

		
		
//		En la entrada, comprobar si esa posicion ya esta jugada. 
		
//		Luego comprobar los numeros que esten alrededor.

		
		Scanner scanner = new Scanner(System.in);
		
		
		int [][] posiciones = new int[3][3];  // array para explicar las posiciones a los jugadores visualmente (1-9)
		
		int pos=1;
		for (int i = 0; i < posiciones.length; i++) {
			for (int j = 0; j < posiciones.length; j++) {
				posiciones[i][j]=pos;
				pos++;
			}
		}
		
		
		System.out.println("Tres en raya para dos jugadores.\nCada jugador marca del 1 al 9 la posicion que juegan cada turno: \n");
		
		
		
		
		char [][] tres = new char[3][3];      // aqui se juega el Tres En Raya
		
		for (int i = 0; i < tres.length; i++) {
			for (int j = 0; j < tres.length; j++) {
				tres[i][j]='-';
			}
		}
		
		
		
		boolean turnoX = true;       // para cambiar turno
		boolean yaJugada = false;    // para comprobar si la posicion está ya utilizada
		boolean hayGanador = false;  // se sigue jugando mientras no haya ganador
		
		
		
		do{
			
			while (!yaJugada) {   // switch 1 - 9 - representan [0][0] al [2][2], confirmamos si se ha jugado esa posicion
				
				System.out.println("");
				ArraysBidi.muestraBidi(posiciones);
				System.out.println("\n----- Marca tu posición del 1 al 9: \n");
				ArraysBidi.muestraBidi(tres);
				
				pos=scanner.nextInt();

				yaJugada=ArraysBidi.posicionJugada(0, 0, tres);
				
				switch (pos) {
				
				case 1:
					
					yaJugada=ArraysBidi.posicionJugada(0, 0, tres);
					
					if (!yaJugada) { // si no se ha jugado
						
						tres[0][0] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 2:
					yaJugada=ArraysBidi.posicionJugada(0, 1, tres);

					if (!yaJugada) { // si no se ha jugado
						
						tres[0][1] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 3:
					yaJugada=ArraysBidi.posicionJugada(0, 2, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[0][2] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 4:
					yaJugada=ArraysBidi.posicionJugada(1, 0, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[1][0] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 5:
					yaJugada=ArraysBidi.posicionJugada(1, 1, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[1][1] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 6:
					yaJugada=ArraysBidi.posicionJugada(1, 2, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[1][2] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 7:
					yaJugada=ArraysBidi.posicionJugada(2, 0, tres);

					if (!yaJugada) { // si no se ha jugado
						
						tres[2][0] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				case 8:
					yaJugada=ArraysBidi.posicionJugada(2, 1, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[2][1] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					
				
				case 9:
					yaJugada=ArraysBidi.posicionJugada(2, 2, tres);


					if (!yaJugada) { // si no se ha jugado
						
						tres[2][2] = turnoX ? 'X':'O';
						turnoX=!turnoX;
					  
					}
					
					break;
					

				default:
					yaJugada=true;
					break;
					
				} //fin switch
				
			} // fin while confirmando si la posicion ya se ha jugado
			
			hayGanador = ArraysBidi.ganaAlguien(tres);
			
			
		} while (!hayGanador);
		
		
		
	}

}