package pooPajaros;

public class TestPajaro {

	public static void main(String[] args) {
		// Test Pajaro
		
//		Crear instancias de la clase pajaro usando el metodo constructor.
		
		Pajaro p1 = new Pajaro("Abejaruco europeo", "Turquesa", 3);
		Pajaro p2 = new Pajaro("Estornino", "Negro", 7);
		Pajaro p3 = new Pajaro("Pinzon de Gran Canaria", "Azul", 2);
		Pajaro p4 = new Pajaro("Aguila Imperial Ibérica", "Marron", 5);
		
//		Sacar por pantalla los datos de cada instancia con toString
		
		System.out.println(p1.toString() + "\n");
		System.out.println(p2.toString() + "\n");
		System.out.println(p3.toString() + "\n");
		System.out.println(p4.toString() + "\n");
		
		
//		Mostrar por pantalla el numero total con un metodo static
		
		System.out.println("----------------------------\n"
		+ "Numero total de pajaros: " + Pajaro.muestraTotal() + ".\n");
		
		
		

	}

}
