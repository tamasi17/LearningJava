/**
 * 
 */
package pooFiguraAbstracta;

/**
 * Hija de FiguraAbstracta (se puede instanciar)
 */
public class RectanguloA extends FiguraAbstracta {

	private int base;
	private int altura;
	

	/**
	 * @param base
	 * @param altura
	 */
	public RectanguloA(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double calcularArea() {
		return base*altura;
	}



	@Override
	public double calcularPerimetro() {
		return 2*(base+altura);
	}
	
	


	@Override
	public void escalar(double factor) {
		this.base*=factor;
		this.altura*=factor;
	}


	@Override
	public void cambiarColor(String color) {
		this.color=color;
	}
		
	@Override
	public String getColor() {
		
		if (color==null) {
			return "Este rectangulo es transparente";
		}
		
		return "Este rectangulo es " + color;
	}
		
	
	@Override
	public String toString() {
		return "Rectangulo \n" 
				+ (color != null ? "Color: " + color + "\n" : "") 
				+ "Area: " + calcularArea() + "\n"
				+ "Perimetro: " + calcularPerimetro() + "\n";
	}
	
}
