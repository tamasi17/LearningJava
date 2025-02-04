package pooFigura;

public class TestFigura {

	public static void main(String[] args) {

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
		
		
//		Creamos instancias de Circulo Triangulo y Cuadrado usando el metodo constructor.

		Circulo circ = new Circulo("azul", 5);
		Triangulo t1 = new Triangulo("amarillo", 3, 7);
		Cuadrado cuad = new Cuadrado("rosa", 4);
		
//		Sacar por pantalla los datos de cada instancia con toString

		System.out.println("Area del circulo: " + circ.area() + " cm2");
		System.out.println("Color: "+ circ.getColor() +"\n");
		
		System.out.println("Area del triangulo: " + t1.area() + " cm2");
		System.out.println("Color: "+ t1.getColor() +"\n");
		
		System.out.println("Area del cuadrado: " + cuad.area() + " cm2");
		System.out.println("Color: "+ cuad.getColor() +"\n");
		
		System.out.println("--- Con el toString --- \n" 
							+ circ.toString() + "\n"
							+ t1.toString() + "\n"
							+ cuad.toString());
		
	}

}
