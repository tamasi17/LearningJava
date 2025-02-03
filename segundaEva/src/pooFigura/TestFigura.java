package pooFigura;

public class TestFigura {

	public static void main(String[] args) {

		/*
		Crear una clase Rectángulo, con atributos base y altura. 
		Crear también el constructor de la clase y los métodos necesarios para calcular el área y el perímetro.
		Crear otra clase PruebaRectangulo que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros.
		*/
		
		
//		Creamos instancias de la clase Rectangulo usando el metodo constructor.

		Figura r1 = new Figura(3,4);
		Figura r2 = new Figura(7,12);
		
//		Sacar por pantalla los datos de cada instancia con toString

		System.out.println(r1.toString());
		System.out.println("\n");
		System.out.println(r2.toString());
		System.out.println("\n");
		
		System.out.println("Tambien podemos conseguir el area del rectangulo 1 con get: " + r1.getArea() + "cm.");
		System.out.println("O el perimetro del rectangulo 2 con get: " + r2.getPerimetro() + "cm.");
		
	}

}
