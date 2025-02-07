package pooCestas;

import java.util.Objects;

/**
 * Clase que representa un Cliente
 */



	/*Cestas Navidad
	Vamos a realizar una aplicación para una pequeña empresa que comercializa cestas de Regalo para clientes.
	De cada cliente queremos saber su nombre completo, su DNI y si es particular o empresa. Cada cesta está compuesta por productos.
	Un producto tiene un código numérico que lo identifica(static), así como un nombre y un precio unitario.
	También se debe saber si contiene gluten, así como su tipo (salado, dulce o bebida).
	Una cesta está formada por un conjunto de productos y por un cliente comprador.
	En la cesta debemos poder añadir y eliminar productos.
	Ninguna cesta puede costar más de 100 euros, por tanto si al intentar añadir un producto se supera esa cantidad total,
	se mostrará un mensaje de error(exception) y el producto no se añadirá.
	Además, hay tres cosas que se debe poder hacer con la cesta:
	1. Imprimir todos sus datos (datos del cliente y listado de productos que contiene)
	2. Imprimir el precio total del contenido de la cesta
	3. Imprimir si la cesta es apta para celíacos o no (será apta si ninguno de sus productos contiene gluten)
	Ejercicio 1: Realiza un esquema de clases incluyendo las clases Producto, Cliente y Cesta.
	Ejercicio 2: Crea un proyecto llamado “Cestas-TuNombre”.
	Programa las tres clases incluyéndolas en un paquete llamado “cestas”
	Ejercicio 3: En el mismo proyecto, pero fuera del paquete “cestas”, crea una clase llamada Test donde programarás un método main.
	En ella, haz lo siguiente: Primero crea un producto para cada uno de los productos de la lista (ver más abajo).
	Después crea un cliente con tus propios datos personales.
	Ahora vas a crear dos cestas, añadiendo los productos las veces que sea necesario.
	La primera cesta contiene un jamón, dos latas de foie gras, tres cajas de mazapán y una botella de sidra.
	La segunda cesta contiene un jamón, cinco cajas de turrón y tres botellas de cava.
	Los códigos, precios y contenido en gluten de los productos son los siguientes:
	1 - Jamón serrano – 40 euros – Sin gluten
	2 - Lata de foie gras – 10 euros – Con gluten
	3 - Turrón de almendras – 5 euros – Con gluten
	4 - Caja de mazapán – 8 euros – Con gluten
	5 - Botella de sidra – 8 euros – Sin gluten 
	6 - Botella de cava – 15 euros – Sin gluten 
	Nota: en este caso sí se permite que un mismo producto esté repetido en la cesta 
	*/
	

	
	public class Cliente {
	
		
//	Atributos
	
	/**
	 * Atributos: nombre, DNI, particular o empresa
	 */
	private String nombre, dni;
	private Fiscalidad fisco;

//	Constructor
	
	/**
	 * @param nombre
	 * @param dni
	 * @param fisco
	 */
	public Cliente(String nombre, String dni, Fiscalidad fisco) {
		this.nombre = nombre;
		this.dni = dni;
		this.fisco = fisco;
	}
	

	
//	Equals solo con el DNI
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
//	toString
	

	@Override
	public String toString() {
		return (nombre != null ? nombre : "")
				+ (dni != null ? ", " + dni : "") + (fisco != null ? ", " + fisco : "");
	}


	
	
	
}