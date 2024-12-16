package entidadDireccion;

public class Direccion {

	/*
	Un tipo de vía que puede ser: Calle, Avenida, Callejón, Pasaje, Pasadizo, etc. Suele ser un valor alfanumérico.
	El nombre de la vía. Lo que entendemos como Calle.
	Un número de portal.
	Número de escalera.
	Identificador de la puerta. Puede ser un número o una letra.
	Código postal.
	Localidad
	Provincia 
	País
	*/
	
	
	private String tipoVia;
	private String nombreVia;
	private int portal;
	private int piso;
	private char puerta;
	private int codigoPostal;
	private String ciudad;
	private String provincia;
	private String pais;
	
	
//	He generado esto con el Source del Eclipse, por eso sale escrito así:
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public int getPortal() {
		return portal;
	}
	public void setPortal(int portal) {
		this.portal = portal;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public char getPuerta() {
		return puerta;
	}
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	
	
	
	
	
}
