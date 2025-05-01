package pooInmobiliaria;

public class PlazaGaraje extends Superficie {

	private int precioAlquiler;
	private TipoGaraje tipoGaraje;

	
	/**
	 * @param ubi
	 * @param metros
	 * @param precioMetroCuadrado
	 * @param superficie
	 * @param precioAlquiler
	 * @param tipoGaraje
	 */
	public PlazaGaraje(String ubi, int metros, int precioMetroCuadrado, int precioAlquiler,
			TipoGaraje tipoGaraje) {
		super(ubi, metros, precioMetroCuadrado);
		this.precioAlquiler = precioAlquiler;
		this.tipoGaraje = tipoGaraje;
	}

	
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


	@Override
	public String toString() {
		return super.toString()
				+ (precioAlquiler != 0 ? "Precio de alquiler: " + precioAlquiler + "\n" : "")
				+ (tipoGaraje != null ? "Tipo de garaje: " + tipoGaraje + "\n" : "");
	}
	
	
	
}
