package pooCestas;


/*
Los códigos, precios y contenido en gluten de los productos son los siguientes:
	1 - Jamón serrano – 40 euros – Sin gluten
	2 - Lata de foie gras – 10 euros – Con gluten
	3 - Turrón de almendras – 5 euros – Con gluten
	4 - Caja de mazapán – 8 euros – Con gluten
	5 - Botella de sidra – 8 euros – Sin gluten 
	6 - Botella de cava – 15 euros – Sin gluten 
	Nota: en este caso sí se permite que un mismo producto esté repetido en la cesta 
*/


public class Jamon extends Producto {
	
//	Atributos
	
	
	private static int codigo = 1;
	private static Tipo tipo = Tipo.SALADO;
	private static int precio = 40;
	private static boolean gluten = false;
//	Constructor
	
	/**
	 * @param nombre
	 * @param precio
	 * @param gluten
	 */
	public Jamon(String nombre, int precio, boolean gluten) {
		super(nombre, precio, gluten);
		// TODO Auto-generated constructor stub
	}
	
	
	


	
	
	
	
}
