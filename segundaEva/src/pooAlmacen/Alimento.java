/**
 * 
 */
package pooAlmacen;

/**
 * 
 */
public class Alimento extends Articulo {
	
//	Atributos
	
	protected int mes, dia; // fecha de caducidad
	
	
	
//	Constructor

	/**
	 * @param precio
	 * @param nombre
	 * @param codigo
	 */
	public Alimento(double precio, String nombre, int mes, int dia) {
		super(precio, nombre);
		this.mes=mes;
		this.dia=dia;
	}

	
//	Getters y Setters
	

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}


	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}


	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}


	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	
	
	
	
	
	

}
