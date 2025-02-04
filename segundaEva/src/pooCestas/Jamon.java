package pooCestas;


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


public class Jamon extends Producto {
	
//	Atributos
	
	
	private static int codigo = 1;
	private static Tipo tipo = Tipo.SALADO;
//	Constructor

	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param gluten
	 */
	public Jamon(String nombre, int precio, boolean gluten) {
		super(nombre, precio, gluten);
	}
	
	
	
	
}
