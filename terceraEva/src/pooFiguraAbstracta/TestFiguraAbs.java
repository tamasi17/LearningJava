/**
 * 
 */
package pooFiguraAbstracta;

/**
 * 
 */
public class TestFiguraAbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/**
		 * 	Diseña un método principal (main) donde se cree una lista de distintas
			figuras. Para cada figura:
			Calcula y muestra su área y perímetro.
 			Cambia su tamaño utilizando el método escalar.
			Cambia su color con el método cambiarColor.
 			Muestra la información actualizada después de cada operación.
		 */
		
		FiguraAbstracta circ = new CirculoA(5);
		RectanguloA rect = new RectanguloA(4,6);
		TrianguloA tri = new TrianguloA(3);
		
		
		
		circ.cambiarColor("Rojo");
		rect.cambiarColor("Azul");
		tri.cambiarColor("Verde");
		
		// Usando los métodos mencionados
		System.out.println( "Figuras: Area/Perimetro/Color \n"
				+ "Circulo: " + circ.calcularArea() + " / " + circ.calcularPerimetro() + " / " + circ.getColor() + "\n"
				+ "Rectangulo: " + rect.calcularArea() + " / " + rect.calcularPerimetro() + " / " + rect.getColor() + "\n"
				+ "Triangulo: " + tri.calcularArea() + " / " + tri.calcularPerimetro() + " / " + tri.getColor() + "\n"
				+ "\n\n"
				);
		
		circ.escalar(2);
		rect.escalar(2);
		tri.escalar(2);
		
		
		// Con los toStrings
		System.out.println(circ.toString() + "\n" + rect.toString() + "\n" + tri.toString());
		
		
	}

}
