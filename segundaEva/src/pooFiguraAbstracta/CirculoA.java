/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Hija de FiguraAbstracta (se puede instanciar)
 */
public class CirculoA extends FiguraAbstracta {

	private int radio;	
	
	/**
	 * Constructor
	 */
	public CirculoA (int radio) {
		this.radio=radio; 
	}
	

	@Override
	public double area() {
		return Math.PI * (Math.pow(this.radio, 2));
	}


	@Override
	public String mostrarNombre() {
		return "Circulo";
		}
	
	
		
		
	
}
