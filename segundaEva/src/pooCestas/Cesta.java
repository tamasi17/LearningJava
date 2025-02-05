package pooCestas;

import java.util.Arrays;
import java.util.Objects;

/**
 * Clase que representa una Cesta
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
	

	
	public class Cesta {
	
		
//	Atributos
	
	/**
	 * Atributos: array de productos, cliente comprador
	 */

		private Producto[] productos = new Producto[0];
		private Cliente cliente;
		

//	Constructor
	
		/**
		 * @param productos
		 * @param cliente
		 */
		public Cesta(Producto[] productos, Cliente cliente) {
			this.productos = productos;
			this.cliente = cliente;
		}
		
//	Añadir producto (creamos un array auxiliar con tamaño +1)
		
		public void addProducto(Producto p) {
			Producto[] aux = new Producto[this.productos.length+1];
			for (int i = 0; i < productos.length; i++) {
				aux[i]=productos[i];
			}
			aux[aux.length-1]=p;
			productos=aux;
		}
		
//	Borrar Producto
		
//		n es nombre del producto a borrar
		public void dropProducto(String n) {
			
			int posicionTemp=-1;
			
			Producto[] aux = new Producto[this.productos.length-1];
			
			// array que recorre productos buscando la posicion del producto a borrar
			for (int i = 0; i < productos.length && posicionTemp==-1; i++) {
				if (productos[i].getNombre().equals(n)) {
				posicionTemp=i;	
				}
			}
			
			// si encuentra el producto, copiamos productos en aux hasta la posicion encontrada
			if (posicionTemp!=-1) {
				for (int i = 0; i < posicionTemp; i++) {
					aux[i]=productos[i];
				}
				
				// nos saltamos la posicion del producto a ignorar
				for (int i = posicionTemp+1; i < aux.length; i++) {
					aux[i]=productos[i];
				}
				
				//recopilamos la info (destruyendo productos original)
				productos=aux;
				
				
			} else { System.out.println("Producto no encontrado");
			
			}
		}
	
		
//		Precio total de la cesta
		
		public int precioCesta() {
			int total=0;
			for (int i = 0; i < productos.length; i++) {
				total+=productos[i].getPrecio();
			}
			return total;
		}
		
		public boolean aptoGluten() {
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].isGluten()) {
					return false;
				}
			}
			return true;
		}

	
//		toString
		
		@Override
		public String toString() {
			return "Cesta [" + (productos != null ? "productos=" + Arrays.toString(productos) + ", " : "")
					+ (cliente != null ? "cliente=" + cliente : "") + "]";
		}

	
	
	
}