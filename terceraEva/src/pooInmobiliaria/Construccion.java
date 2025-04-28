package pooInmobiliaria;

public abstract class Construccion extends Inmueble implements Alquilable {

//	Vivienda (precioAlquiler, precioVenta, habitaciones, piso) y LocalComercial (precioMetroCuadrado)

	Antiguedad antiguedad;

	/**
	 * @param antiguedad
	 */
	public Construccion(String ubi, int metros, Antiguedad antiguedad) {
		super(ubi, metros);
		this.antiguedad = antiguedad;
	}

	@Override
	public abstract void alquilar();

	@Override
	public String toString() {
		return super.toString() + (antiguedad != null ? "Antiguedad: " + antiguedad + "\n" : "");
	}
	
	

}
