package pooFigura;

/**
 * Clase que representa una Figura (superclass de Triangulo, Cuadrado, Circulo)
 */



	/*
	Declara e implementa las clases Triángulo, Círculo y Cuadrado 
	de forma que todas tengan un atributo
	 String color
	y compartan los siguientes métodos:
	 String dameColor()
	 String toString()
	 Imprimir los datos de la figura
	 Calcular el área de la figura (triangulo es base x altura / 2, cuadrado es lado^2, circulo es pi*r^2)
	*/
	
public class Figura {
	
//	Atributos
	
	/**
	 * Color de la figura
	 */
	private String color;

//	Constructor

	/**
	 * Constructor de la Figura
	 * @param color
	 */
	
	public Figura(String color) {
		this.color = color;
	}

//	Metodos
	
	/**
	 * 
	 * Getters and Setters
	 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	/**
	 * 
	 * @return all info in a String
	 * 
	 */
	
	@Override
	public String toString() {
		return (color != null ? "El color es " + color : "") + "]";
	}
	

	
	
	
	
	
}