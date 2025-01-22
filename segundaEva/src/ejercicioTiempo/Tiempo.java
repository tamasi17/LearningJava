package ejercicioTiempo;

/*
	Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construída indicando los tres atributos,
	sólo la hora y minuto o sólo la hora. Crear además los métodos necesarios para modificar la hora en cualquier momento de forma manual.
	Mantenga la integridad de los datos en todo momento.
	Crear una clase PruebaTiempo que prueba una hora concreta y la modifique a su gusto mostrándola por pantalla.
*/

public class Tiempo {
	

//	Atributos
	
	int hora, minuto, segundo;
	
	
//	Constructores
	
	public Tiempo() {

		this.hora=0;
		this.minuto=0;
		this.segundo=0;
		
	}
	
	public Tiempo(int hora) {
		
		this.hora=hora;
		this.minuto=0;
		this.segundo=0;
		
	}
	
	public Tiempo(int hora, int minuto) {
		
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=0;
	}
	
	public Tiempo(int hora, int minuto, int segundo) {
		
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
		
	}
	
//	Metodos
	

//	Devuelve un boolean si el tiempo esta en formato correcto (24h, 60min, 60sec)
	private boolean tiempoCorrecto(int hora, int minuto, int segundo) {
		
		if (hora < 24 && hora >= 0) {
			
			if (minuto < 60 && minuto >= 0) {
				
				if (segundo < 60 && segundo >= 0) {
					
					return true;
					
				} else { // segundo>60 || segundo<0
					return false;
				}
				
			} else { // minuto>60 || minuto<0
				return false;
			}
			
		} else { // hora>24 || hora<0
			return false;
		}
	} //fin tiempoCorrecto
	
	
//	Getters y Setters

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		
		if (tiempoCorrecto(hora, this.minuto, this.segundo)) {			
			this.hora = hora;
		}
	}

	public void setMinuto(int minuto) {
		
		if (tiempoCorrecto(this.hora, minuto, this.segundo)) {			
			this.minuto = minuto;
		}	
	}

	public void setSegundo(int segundo) {
		
		if (tiempoCorrecto(this.hora, this.minuto, segundo)) {			
			this.segundo = segundo;
		}
	}

	@Override
	public String toString() {
		if (segundo>0) {
			return hora + ":" + minuto + ":" + segundo;
		} else {
			return hora + ":" + minuto;
		}
		
		
	}
	
	
	
	
	
}
