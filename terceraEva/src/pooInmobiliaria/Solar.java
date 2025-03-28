package pooInmobiliaria;

public class Solar extends Superficie implements Vendible {

	private int precioVenta;
	private Zona zona;
	

	@Override
	public void vender() {
		
	}

	@Override
	public int getPrecio() {
		return precioVenta;
	}

}
