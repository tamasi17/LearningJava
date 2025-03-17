/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Hija de FiguraAbstracta (se puede instanciar)
 */
public class CuadradoA extends FiguraAbstracta {

	private int lado;	
	
	/**
	 * Constructor
	 */
	public CuadradoA (int lado) {
		this.lado=lado; 
	}
	

	@Override
	public double area() {
		return lado*lado;
	}


	@Override
	public String mostrarNombre() {
		return "Cuadrado";
		}
	
	
		
		
	
}
