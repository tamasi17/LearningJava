package pooInmobiliaria;

public class PlazaGaraje extends Superficie {

	private int precioAlquiler;
	private TipoGaraje tipoGaraje;

	@Override
	public int getPrecio() {
		return precioAlquiler;
	}

	/**
	 * @return the garaje
	 */
	public TipoGaraje getGaraje() {
		return tipoGaraje;
	}

	/**
	 * @param garaje the garaje to set
	 */
	public void setGaraje(TipoGaraje garaje) {
		this.tipoGaraje = garaje;
	}
	
	
	
}
