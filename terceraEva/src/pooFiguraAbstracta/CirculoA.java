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
	public double calcularArea() {
		return Math.PI * (Math.pow(this.radio, 2));
	}


	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*this.radio;
	}


	@Override
	public void escalar(double factor) {
		this.radio*=factor;
	}


	@Override
	public void cambiarColor(String color) {
		this.color=color;
	}


	@Override
	public String getColor() {
		
		if (color==null) {
			return "Este círculo es transparente";
		}
		
		return "Este círculo es " + color;
	}


	@Override
	public String toString() {
		return "Circulo \n" 
				+ (color != null ? "Color: " + color + "\n" : "") 
				+ "Area: " + calcularArea() + "\n"
				+ "Perimetro: " + calcularPerimetro() + "\n";
	}
	
	
		
		
	
}
