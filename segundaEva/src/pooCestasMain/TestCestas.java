package pooCestasMain;

import pooCestas.Cesta;
import pooCestas.Cliente;
import pooCestas.Fiscalidad;
import pooCestas.Producto;
import pooCestas.Tipo;

public class TestCestas {

	public static void main(String[] args) {

		/*Ejercicio 3:
		 * En el mismo proyecto, pero fuera del paquete “cestas”, crea una clase llamada Test donde programarás un método main.
			En ella, haz lo siguiente: Primero crea un producto para cada uno de los productos de la lista (ver más abajo).
			Después crea un cliente con tus propios datos personales.
	
			Ahora vas a crear dos cestas, añadiendo los productos las veces que sea necesario.
		
			La segunda cesta contiene un jamón, cinco cajas de turrón y tres botellas de cava.
		
			1 - Jamón serrano – 40 euros – Sin gluten
			2 - Lata de foie gras – 10 euros – Con gluten
			3 - Turrón de almendras – 5 euros – Con gluten
			4 - Caja de mazapán – 8 euros – Con gluten
			5 - Botella de sidra – 8 euros – Sin gluten 
			6 - Botella de cava – 15 euros – Sin gluten
		*/
		
		
//		Creamos instancias Cliente, Producto y Cesta
		
		Cliente nvidia = new Cliente("NVIDIA", "090013A", Fiscalidad.EMPRESA);
		Cliente chema = new Cliente("Jose Manuel", "50077083D", Fiscalidad.PARTICULAR);
		
		Producto jamon = new Producto("Jamon serrano", 40, false, Tipo.SALADO);
		Producto foie = new Producto("Foie Gras", 10, true, Tipo.SALADO);
		Producto mazapan = new Producto("Mazapan", 8, true, Tipo.DULCE);
		Producto sidra = new Producto("Botella de sidra", 8, false, Tipo.BEBIDA);
		Producto cava = new Producto("Botella de cava", 15, false, Tipo.BEBIDA);
		Producto turron = new Producto("Turron de almendras", 5, true, Tipo.DULCE);
		
		Cesta cestaNvidia = new Cesta(nvidia);
		Cesta cestaChema = new Cesta(chema);
		
		
		
//		La primera cesta contiene un jamón, dos latas de foie gras, tres cajas de mazapán y una botella de sidra.

		try {
		cestaChema.addProducto(jamon);
		cestaChema.addProducto(foie);
		cestaChema.addProducto(foie);
		cestaChema.addProducto(mazapan);
		cestaChema.addProducto(mazapan);
		cestaChema.addProducto(mazapan);
		cestaChema.addProducto(sidra);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		La segunda cesta contiene un jamón, cinco cajas de turrón y tres botellas de cava.
		
		try {
		cestaNvidia.addProducto(jamon);
		cestaNvidia.addProducto(turron);
		cestaNvidia.addProducto(turron);
		cestaNvidia.addProducto(turron);
		cestaNvidia.addProducto(turron);
		cestaNvidia.addProducto(turron);
		cestaNvidia.addProducto(cava);
		cestaNvidia.addProducto(cava);
		cestaNvidia.addProducto(cava);
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage() + "\n");
		}
		
		
//		Sacar por pantalla los datos de cada instancia con toString



		System.out.println(cestaChema.toString()+ "\n");
		System.out.println(cestaNvidia.toString()+ "\n");
		
	
		System.out.println("El precio de la cesta de " + cestaNvidia.getCliente().getNombre() + " es de " + cestaNvidia.precioCesta() 
						+ " euros.\nPodemos comprobar que no se ha añadido la ultima botella de cava porque superaba el total de 100e.");
		System.out.println("El precio de la cesta de " + cestaChema.getCliente().getNombre() + " es de " + cestaChema.precioCesta() + " euros.");
	
	
	}

}
