package pooCestas;

import java.util.Objects;

/**
 * Clase que representa un Producto (superclass de Jamon, Cava, Mazapan...)
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
	

//	Como no vamos a instanciar producto directamente, es una clase abstracta.
	
	public abstract class Producto {
	
		
//	Atributos
	
	/**
	 * Atributos: codigo (static), nombre, precio unitario, gluten, tipo
	 */
	private String nombre;
	private static Tipo tipo;
	private static int codigo;
	private int precio;
	private boolean gluten;
	
//	Constructor

	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param gluten
	 */
	public Producto(String nombre, int precio, boolean gluten) {
		this.nombre = nombre;
		this.precio = precio;
		this.gluten = gluten;
	}

	
	

//	Metodos
	
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @return the tipo
	 */
	public static Tipo getTipo() {
		return tipo;
	}




	/**
	 * @return the codigo
	 */
	public static int getCodigo() {
		return codigo;
	}




	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}




	/**
	 * @return the gluten
	 */
	public boolean isGluten() {
		return gluten;
	}




	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	/**
	 * @param tipo the tipo to set
	 */
	public static void setTipo(Tipo tipo) {
		Producto.tipo = tipo;
	}




	/**
	 * @param codigo the codigo to set
	 */
	public static void setCodigo(int codigo) {
		Producto.codigo = codigo;
	}




	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}




	/**
	 * @param gluten the gluten to set
	 */
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}




	@Override
	public String toString() {
		return "Producto [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (tipo != null ? "tipo=" + tipo + ", " : "") + "precio=" + precio + ", gluten=" + gluten + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	
	
	
	
}