package pooFigura;


/*
Declara e implementa las clases Triángulo, Círculo
y Cuadrado de forma que todas tengan un
atributo
 String color
y compartan los siguientes métodos:
 String dameColor()
 String toString()
 Imprimir los datos de la figura
 Calcular el área de la figura (triangulo es base x altura / 2, cuadrado es lado^2, circulo es pi*r^2)
*/

/**
 * Clase que representa una Figura (superclass de Triangulo, Cuadrado, Circulo)
 */

public class Triangulo extends Figura {
	
//	Atributos
	
	/**
	 * Base 
	 */
	
	private double base, altura;
	
	
//	Constructor

	public Triangulo(String color) {
		super(color);
	}
	
	
	public Triangulo(String color, double base, double altura) {
	super(color);
	this.base = base;
	this.altura = altura;
	}


	public Triangulo(String color, double base) {
		super(color);
		this.base = base;
	}

	
//	Métodos
	
	public double area() {
		
		return (base*altura)/2;
	}
	
	
	
	
}
