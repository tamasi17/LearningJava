package poo.coche;

public class TestCoche {

	public static void main(String[] args) {
		        

		        // Crear un objeto de la clase Coche (Marca, modelo, color, maletero, puertas, potencia, velocidad, precio)

		        Coche coche1 = new Coche("Genesis", "G90", "Makalu Grey Matte",450,5,380,67, 90950);

		        Coche coche2 = new Coche("Pontiac", "Firebird Trans Am 1969", "Blanco",350,5,340,49,47000);

		        Coche coche3 = new Coche("Chevrolet", "Camaro 1975", "Rojo",200,3,130,25,39500);

		        

		        //COCHE1

		        coche1.mostrarDatos();

		        

		        coche1.pintarCoche("Verde Hallasan");

		       

		        coche1.mostrarDatos();

		        

		        //COCHE2

		        coche2.mostrarDatos();

		        

		        coche2.pintarCoche("Granate");

		        

		        coche2.mostrarDatos();

		        

		        //COCHE3

		        coche3.mostrarDatos();

		        

		        coche3.pintarCoche("Negro Brillante");

		        

		        coche3.mostrarDatos();
		

		
	}

}
