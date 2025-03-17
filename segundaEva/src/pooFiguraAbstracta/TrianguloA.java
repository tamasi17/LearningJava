/**
 * 
 */
package pooFiguraAbstracta;

/**
 * 
 */
public class TrianguloA extends FiguraAbstracta {

	private int base, altura;
	
	
	/**
	 * 
	 */
	public TrianguloA (int base, int altura) {
		this.base=base;
		this.altura=altura; 
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}

	@Override
	public String mostrarNombre() {
		return "Triangulo";
		}

		
	
}
