package ejercicioPajaros;

public class TestPajaro {

	public static void main(String[] args) {
		// Test Pajaro
		
		
		Pajaro p1 = new Pajaro("Abejaruco europeo", "Turquesa", 3);
		Pajaro p2 = new Pajaro("Estornino", "Negro", 7);
		Pajaro p3 = new Pajaro("Pinzon de Gran Canaria", "Azul", 2);
		Pajaro p4 = new Pajaro("Aguila Imperial Ibérica", "Marron", 5);
		
		
		
		System.out.println("---- "+ p1.getEspecie() + " ----\n"
		+ "Color: " + p1.getColor() + "\n"
		+ "Edad: " + p1.getEdad() + "\n"
		+ "ID: " + p1.getId() + "\n");
		
		System.out.println("---- "+ p2.getEspecie() + " ----\n"
				+ "Color: " + p2.getColor() + "\n"
				+ "Edad: " + p2.getEdad() + "\n"
				+ "ID: " + p2.getId() + "\n");
		
		System.out.println("---- "+ p3.getEspecie() + " ----\n"
				+ "Color: " + p3.getColor() + "\n"
				+ "Edad: " + p3.getEdad() + "\n"
				+ "ID: " + p3.getId() + "\n");
		
		System.out.println("---- "+ p4.getEspecie() + " ----\n"
				+ "Color: " + p4.getColor() + "\n"
				+ "Edad: " + p4.getEdad() + "\n"
				+ "ID: " + p4.getId() + "\n");
		
		
		
		
		System.out.println("----------------------------\n"
		+ "Numero total de pajaros: " + Pajaro.muestraTotal() + ".\n"		
		);
		
		
		

	}

}
