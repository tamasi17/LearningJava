package pooInmobiliaria;

public abstract class Construccion extends Inmueble implements Alquilable {

//	Vivienda (precioAlquiler, precioVenta, habitaciones, piso) y LocalComercial (precioMetroCuadrado)
	
	Antiguedad antiguedad;

	
	
	/**
 * @param antiguedad
 */
public Construccion(Antiguedad antiguedad) {
	this.antiguedad = antiguedad;
}




	@Override
	public abstract void alquilar();
	
	
	
}
