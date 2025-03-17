/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Clase abstracta (no se implementa)
 */
public abstract class FiguraAbstracta {
	
	
		private int x, y;
		
		public void mostrarOrigen() {
		System.out.println("x= "+x+" y= "+y);
		}
		
		public abstract double area(); // No tiene implementación
		
		public abstract String mostrarNombre(); // toString para que lo implementen las hijas
		
}
