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
		Triangulo tri = new Triangulo("amarillo", 3, 7);
		Cuadrado cuad = new Cuadrado("rosa", 4);
		
//		Sacar por pantalla los datos de cada instancia con toString

		System.out.println("Area del circulo: " + circ.area() + " cm2");
		System.out.println("Color: "+ circ.getColor() +"\n");
		
		System.out.println("Area del triangulo: " + tri.area() + " cm2");
		System.out.println("Color: "+ tri.getColor() +"\n");
		
		System.out.println("Area del cuadrado: " + cuad.area() + " cm2");
		System.out.println("Color: "+ cuad.getColor() +"\n");
		
		System.out.println("--- Con el toString --- \n \n" 
							+ circ.toString() + "\n"
							+ tri.toString() + "\n"
							+ cuad.toString());
		
		
		System.out.println("\n----- Instance of -----\n");
		
//      Verificar el tipo de objeto usando instanceof (realmente no se necesita el cast en este caso, pero es como funcionaría).
		
        if (cuad instanceof Cuadrado) {
            System.out.println("Cuad es un Cuadrado con área: " + ((Cuadrado) cuad).area());
        }
        
        if (circ instanceof Circulo) {
            System.out.println("Circ es un Círculo con área: " + ((Circulo) circ).area());
        }
        
        if (tri instanceof Triangulo) {
            System.out.println("Tri es un Triángulo con área: " + ((Triangulo) tri).area());
        }
        
        
		
	}

}
