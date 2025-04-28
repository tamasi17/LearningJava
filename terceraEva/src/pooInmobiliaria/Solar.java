package pooInmobiliaria;

public class Solar extends Superficie implements Vendible {

	private int precioVenta;
	private Zona zona;
	
	
	
	

	

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
	
	

}
