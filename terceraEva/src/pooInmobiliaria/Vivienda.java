package pooInmobiliaria;

public class Vivienda extends Construccion implements Vendible {

	private int precioAlquiler, precioVenta, habitaciones, piso;
	


	/**
	 * @param ubi
	 * @param metros
	 * @param antiguedad
	 * @param precioAlquiler
	 * @param precioVenta
	 * @param habitaciones
	 * @param piso
	 */
	public Vivienda(String ubi, int metros, Antiguedad antiguedad, 
			int precioAlquiler, int precioVenta,
			int habitaciones, int piso) {
		
		super(ubi, metros, antiguedad);
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
	public int getPrecioAlquiler() {
		return precioAlquiler;
	}


	@Override
	public int getPrecioVenta() {
		return precioVenta;
	}


	/**
	 * @return habitaciones
	 */
	public int getHabitaciones() {
		return habitaciones;
	}


	/**
	 * @param habitaciones the habitaciones to set
	 */
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}



	@Override
	public String toString() {
		return super.toString()
				+ (habitaciones != 0 ? "Habitaciones: " + habitaciones + "\n" : "")
				+ (piso != 0 ? "Piso: " + piso + "\n" : "")
				+ (precioAlquiler != 0 ? "Precio de alquiler: " + precioAlquiler + "\n" : "")
				+ (precioVenta != 0 ? "Precio de venta: " + precioVenta + "\n" : "");
	}
	
	
	
	
	
}
