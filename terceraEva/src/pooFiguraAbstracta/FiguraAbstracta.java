/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Clase abstracta (no se implementa). 
 * Si todas las figuras deben incluir escalar y cambiarColor, seria mejor que fueran metodos abstractos.
 * De todas maneras, para practicar interfaces vamos a hacer uso de ellas.
 * Las implemento en FiguraAbstracta en vez de en cada una porque afecta a todas.
 */
public abstract class FiguraAbstracta implements Transformable, Coloreable {
	
	
		protected String color;
		
		private int x, y;
		
		public void mostrarOrigen() {
		System.out.println("x= "+x+" y= "+y);
		}
		
		public abstract double calcularArea();
		
		public abstract double calcularPerimetro();

	
		
		
		
}
