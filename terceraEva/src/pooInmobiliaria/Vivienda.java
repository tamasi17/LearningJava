package pooInmobiliaria;

public class Vivienda extends Construccion implements Vendible {

	private int precioAlquiler, precioVenta, habitaciones, piso;
	

	/**
	 * @param antiguedad
	 * @param precioAlquiler
	 * @param precioVenta
	 * @param habitaciones
	 * @param piso
	 */
	public Vivienda(int precioAlquiler, int precioVenta, int habitaciones, int piso, Antiguedad antiguedad) {
		super(antiguedad);
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
		this.habitaciones = habitaciones;
		this.piso = piso;
	}
	

	@Override
	public void alquilar() {
		
	}

	@Override
	public void vender() {		
	}

	@Override
	public int getPrecio() {
		return precioAlquiler;
	}
	
	
	public int getPrecioVenta() {
		return precioVenta;
	}
	
	
}
