package ejercicioRectangulo;

public class Rectangulo {

	/*
	Crear una clase Rectángulo, con atributos base y altura. 
	Crear también el constructor de la clase y los métodos necesarios para calcular el área y el perímetro.
	Crear otra clase PruebaRectangulo que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros.
	*/
	
	
//	Atributos
	private int base, altura;
	private float area, perimetro;
	
//	Constructor
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
		this.area=base*altura;
		this.perimetro=2*(base*altura);
	}
	
	
//	Metodos
	
	public float getArea() {
		return base*altura;
	}
	
	public float getPerimetro() {
		return 2*(base*altura);
	}
	
	public String toString() {
		return "Tu rectangulo tiene una base de " + this.base + "cm y una altura de " + this.altura + "cm. \n"
				+ "Su area es de " + this.area + "cm2 y su perimetro es de " + this.perimetro + "cm.";
	}
	
}
