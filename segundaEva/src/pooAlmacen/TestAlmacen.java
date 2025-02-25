/**
 * 
 */
package pooAlmacen;

/**
 * 	Se desea que la clase venta tenga un método que realice la suma de 3 productos:
	una pizza de 3,5 euros, un pijama de 30 euros y un reproductor de mp3 de 80 euros
	con un plus de 8,5.
 * 
 */
public class TestAlmacen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// probamos a declarar un articulo, pero instanciar un alimento
		Articulo pizza = new Alimento(3.5, "Pizza", 10, 7);
		
		Articulo pijama = new Ropa(30, "Pijama", Material.ALGODON);
		Articulo reproductor = new Electronico(80, "MP3");
		
		
		System.out.println("Precio total de la cesta: " + Articulo.precioTotal());
		
		
		// usamos instanceof para comprobar la clase de pizza, y cast para poder acceder a dia y mes.
		if (pizza instanceof Alimento) {
			Alimento pizzaAlimento = (Alimento) pizza ;
			System.out.println( pizzaAlimento.nombre + " es un alimento. Su fecha de caducidad es el " + pizzaAlimento.dia + "/" + pizzaAlimento.mes + ".");
		}
		
		
		
	}

}
