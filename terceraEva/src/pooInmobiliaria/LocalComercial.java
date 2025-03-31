package pooInmobiliaria;

public class LocalComercial extends Construccion {

	
	private int precioAlquiler;
	private Antiguedad antiguedad;
	
	@Override
	public void alquilar() {
	}

	@Override
	public int getPrecio() {
		return precioAlquiler;
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
	
	
	
	
	
}
