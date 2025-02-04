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


public class Cuadrado extends Figura {
	
//	Atributos
	
	private double lado;
	
	
//	Constructor

	public Cuadrado(String color) {
		super(color);
	}


	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	
//	Métodos
	
	public double area() {
		
		return Math.pow(this.lado, 2);
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	@Override
	public String toString() {
		return "Cuadrado\nLado: " + lado 
				+ ", Color: " + super.getColor();
	}
	
	
}
