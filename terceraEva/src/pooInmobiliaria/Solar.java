package pooInmobiliaria;

public class Solar extends Superficie implements Vendible {

	private int precioVenta;
	private Zona zona;
	

	/**
	 * @param ubi
	 * @param metros
	 * @param precioMetroCuadrado
	 * @param superficie
	 * @param precioVenta
	 * @param zona
	 */
	public Solar(String ubi, int metros, int precioMetroCuadrado, int precioVenta, Zona zona) {
		super(ubi, metros, precioMetroCuadrado);
		this.precioVenta = precioVenta;
		this.zona = zona;
	}

	
	@Override
	public void vender() {
		
	}

	@Override
	public int getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @return the zona
	 */
	public Zona getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(Zona zona) {
		this.zona = zona;
	}


	@Override
	public String toString() {
		return super.toString() 
				+ (precioVenta != 0 ? "Precio de venta: " + precioVenta + "\n" : "")
				+ (zona != null ? "Zona: " + zona : "");
	}
	
	
	

}
