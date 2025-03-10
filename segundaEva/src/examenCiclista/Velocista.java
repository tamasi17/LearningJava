/**
 * 
 */
package examenCiclista;

/**
 * 
 */
public class Velocista extends Ciclista {

//	Atributos
	
	private double potencia;
	private double velocidad;
	
	
	
//	Constructores
	
	/** Constructor con nombre y tiempoCarrera como Ciclista.
	 * @param nombre
	 * @param tiempoCarrera
	 */
	public Velocista(String nombre, float tiempoCarrera) {
		super(nombre, tiempoCarrera);
		
	}



	/** Constructor con los atributos potencia y velocidad añadidos.
	 * @param nombre
	 * @param tiempoCarrera
	 * @param potencia
	 * @param velocidad
	 */
	public Velocista(String nombre, float tiempoCarrera, double potencia, double velocidad) {
		super(nombre, tiempoCarrera);
		this.potencia = potencia;
		this.velocidad = velocidad;
	}


//	Getters y Setters

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}



	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}



	/**
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}



	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}



	@Override
	public String visualizaTipoCiclista() {
		return super.visualizaTipoCiclista() + "velocista.";
	}

	
	
	
	
	
}
