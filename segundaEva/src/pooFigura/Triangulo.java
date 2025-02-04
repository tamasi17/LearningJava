package pooFigura;


/*
Declara e implementa las clases Triángulo, Círculo y Cuadrado 
de forma que todas tengan un
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
	 * Atributos: Base y altura
	 */
	
	private double base, altura;
	
	
//	Constructor

	/**
	 * Constructor
	 * @param color
	 */
	public Triangulo(String color) {
		super(color);
	}
	
	/**
	 * Constructor
	 * @param color
	 * @param base
	 * @param altura
	 */
	
	public Triangulo(String color, double base, double altura) {
	super(color);
	this.base = base;
	this.altura = altura;
	}


	
//	Métodos
	
	/**
	 * Metodo que calcula el area de un triangulo
	 * @return double con el area del triangulo
	 */
	
	public double area() {
		
		return (base*altura)/2;
	}

//	Getters y Setters
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo \nBase: " + base 
				+ ", Altura: " + altura
				+ ", Color: " + super.getColor();
	}
	
	
	
	
}
