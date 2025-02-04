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


public class Circulo extends Figura {
	
//	Atributos
	
	private double radio;
	
	
//	Constructor

	public Circulo(String color) {
		super(color);
	}


	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	
//	Métodos
	
	public double area() {
		
		return Math.PI * (Math.pow(this.radio, 2));
	}


	@Override
	public String toString() {
		return "Circulo \nRadio: " + radio 
				+ ", Color: " + super.getColor();
	}
	
	
	
	
}
