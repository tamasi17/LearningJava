package pooInmobiliaria;

public class LocalComercial extends Construccion {

	
	private int precioMetroCuadrado;

	
	/**
	 * @param ubi
	 * @param metros
	 * @param antiguedad
	 * @param precioMetroCuadrado
	 */
	public LocalComercial(String ubi, int metros, Antiguedad antiguedad, int precioMetroCuadrado) {
		super(ubi, metros, antiguedad);
		this.precioMetroCuadrado = precioMetroCuadrado;
	}

	
	@Override
	public void alquilar() {
	}

	/**
	 * @return the antiguedad
	 */
	public Antiguedad getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(Antiguedad antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public int getPrecioAlquiler() {
		return precioMetroCuadrado*metros;
	}


	@Override
	public String toString() {
		return super.toString() 
				+ (precioMetroCuadrado != 0 ? "Precio metro cuadrado: " + precioMetroCuadrado + "\n" : "");
	}
	
	
	
	
	
}
