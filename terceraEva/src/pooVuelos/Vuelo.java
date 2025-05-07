package pooVuelos;

import java.io.Serializable;
import java.time.LocalTime;

public class Vuelo implements Serializable {

	
	private String numero;
	private static int contador=1100;
	private String origen;
	private String destino;
	// Primero hice salida como LocalTime, pero es mas sencillo hacer pruebas con un int. 
	// Mantengo esto para comprobar que sé utilizarlo.
	private LocalTime registro;
	private int salida;
	private int duracion;
	
	public Vuelo(String origen, String destino, int salida, int duracion) {
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.duracion = duracion;
		contador++;
		this.numero = String.valueOf(contador);
		this.registro = LocalTime.now();       
	}

	
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return the salida
	 */
	public int getSalida() {
		return salida;
	}

	
	

	/**
	 * @return the registro
	 */
	public LocalTime getRegistro() {
		return registro;
	}


	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(LocalTime registro) {
		this.registro = registro;
	}


	@Override
	public String toString() {
		return "Vuelo numero: " + numero + "\n"
				+ "Desde " + origen + ", con destino a " + destino + ".\n"
				+ "Despegue a las " + salida + "h, duracion prevista de " + duracion + " horas.\n";
	}
	
	
	
	
	
}
