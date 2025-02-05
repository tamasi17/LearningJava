package pooCestasMain;

import pooCestas.Jamon;

public class TestCestas {

	public static void main(String[] args) {

		/*
		
		Ejercicio 3: En el mismo proyecto, pero fuera del paquete “cestas”, crea una clase llamada Test donde programarás un método main.
		En ella, haz lo siguiente: Primero crea un producto para cada uno de los productos de la lista (ver más abajo).
		Después crea un cliente con tus propios datos personales.
	
		Ahora vas a crear dos cestas, añadiendo los productos las veces que sea necesario.
		La primera cesta contiene un jamón, dos latas de foie gras, tres cajas de mazapán y una botella de sidra.
		La segunda cesta contiene un jamón, cinco cajas de turrón y tres botellas de cava.
		
		*/
		
		
//		Creamos instancias de Circulo Triangulo y Cuadrado usando el metodo constructor.

		Jamon circ = new Jamon("azul", 5);
		Mazapan t1 = new Mazapan("amarillo", 3, 7);
		Cava cuad = new Cava("rosa", 4);
		
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
