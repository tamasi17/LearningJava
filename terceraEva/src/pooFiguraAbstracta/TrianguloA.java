/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Triangulo equilatero
 * Hija de FiguraAbstracta (se puede instanciar)
 */
public class TrianguloA extends FiguraAbstracta {

	private int lado;
	

	/**
	 * @param base
	 * @param altura
	 */
	public TrianguloA(int lado) {
		this.lado = lado;

	}



	@Override
	public double calcularArea() {
		return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
	}



	@Override
	public double calcularPerimetro() {
		return 3*lado;
	}
	
	


	@Override
	public void escalar(double factor) {
		this.lado*=factor;
	}


	@Override
	public void cambiarColor(String color) {
		this.color=color;
	}
		
	@Override
	public String getColor() {
		
		if (color==null) {
			return "Este triangulo es transparente";
		}
		
		return "Este triangulo es " + color;
	}
		
	
	@Override
	public String toString() {
		return "Triangulo \n" 
				+ (color != null ? "Color: " + color + "\n" : "") 
				+ "Area: " + calcularArea() + "\n"
				+ "Perimetro: " + calcularPerimetro() + "\n";
	}
	
}
