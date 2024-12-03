package ejerciciosMats;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

//		Tres en raya con array bidimensional.
		
		
//		Array bidimensional, dos opciones X y O, una para cada turno, asi la jugadora solo tiene que elegir posicion. 
		
//		No estamos usando la clase Arrays para este ejercicio.
		
		
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
		
		
		int turnos=1;                // a los 9 turnos se termina
		
		boolean turnoX = true;       // para cambiar turno
		
		boolean hayGanador = false;  // se sigue jugando mientras no haya ganador
		
		
		
		do{
			
			boolean yaJugada = false;    // para comprobar si la posicion está ya utilizada
			
			
			
			
			while (!yaJugada) {   // switch 1 - 9 - representan [0][0] al [2][2], confirmamos si se ha jugado esa posicion
				
				
				
				System.out.println("");
				ArraysBidi.muestraBidi(posiciones);
				System.out.println("\n----- Marca tu posición del 1 al 9: \n");
				ArraysBidi.muestraBidi(tres);
				
				pos=scanner.nextInt();
				
				
//				Primero confirma si la posicion esta jugada:
				
				switch (pos) {
				
				case 1: yaJugada=ArraysBidi.posicionJugada(0, 0, tres);
				break;
				case 2: yaJugada=ArraysBidi.posicionJugada(0, 1, tres);
				break;
				case 3: yaJugada=ArraysBidi.posicionJugada(0, 2, tres);
				break;
				case 4: yaJugada=ArraysBidi.posicionJugada(1, 0, tres);
				break;
				case 5: yaJugada=ArraysBidi.posicionJugada(1, 1, tres);
				break;
				case 6: yaJugada=ArraysBidi.posicionJugada(1, 2, tres);
				break;
				case 7: yaJugada=ArraysBidi.posicionJugada(2, 0, tres);
				break;
				case 8: yaJugada=ArraysBidi.posicionJugada(2, 1, tres);
				break;
				case 9: yaJugada=ArraysBidi.posicionJugada(2, 2, tres);
				break;
				
				default:
					System.out.println("Elige una posición del 1 al 9, por favor.");
					continue;          // el continue sirve para volver al principio del while (en vez de break que lo finaliza)
				}
				
				
				
//				Una vez confirmado que se puede jugar esa posicion, se juega en funcion del turno que toque:

				
				if (yaJugada) {
					
					System.out.println("Esa posicion ya está jugada, elige otra.");
						
				} else {
					
					switch (pos) {
					
					case 1:
												
						tres[0][0] = turnoX ? 'X':'O';
						break;
						
					case 2:
						
						tres[0][1] = turnoX ? 'X':'O';
						break;
						
					case 3:
						
						tres[0][2] = turnoX ? 'X':'O';
						break;
						
					case 4:
						
						tres[1][0] = turnoX ? 'X':'O';
						break;
						
					case 5:
						
						tres[1][1] = turnoX ? 'X':'O';
						break;
						
					case 6:
						
						
						tres[1][2] = turnoX ? 'X':'O';
						break;
						
					case 7:
						
						tres[2][0] = turnoX ? 'X':'O';
						break;
						
					case 8:
						
						tres[2][1] = turnoX ? 'X':'O';
						break;
						
					
					case 9:

						tres[2][2] = turnoX ? 'X':'O';
						break;
						
					} //fin switch jugar posicion
					
					
					turnoX=!turnoX;      // cambio de turno
					turnos++;
					
				} // fin else juego de turno
				
				
			hayGanador = ArraysBidi.ganaAlguien(tres);
			
			if (hayGanador || (turnos>8) ) break; // si se ha ganado, rompe el bucle while
				
			} // fin while
			
//		Añadir un break de nueve turnos ?????
			
			
		} while (!hayGanador && (turnos<8) );
		
		System.out.println("\nCantidad de turnos: " + turnos);
		if (hayGanador) System.out.println("\nGanaste!");  // el ultimo en jugar esa posicion ha ganado
		if (turnos>8) System.out.println("Empate!");
		ArraysBidi.muestraBidi(tres);
		
		// queda comprobar si hay empate
		
	}

}