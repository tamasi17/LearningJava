package pooInmobiliaria;

public class LocalComercial extends Construccion {

	
	private int precioMetroCuadrado;
	
	public LocalComercial(int precioMetro,int metros, Antiguedad antiguedad) {
		super(antiguedad); // AÑADIR ANTIGUEDAD
		this.precioMetroCuadrado=precioMetro;
		this.metros=metros;
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
	
	
	
	
	
}
