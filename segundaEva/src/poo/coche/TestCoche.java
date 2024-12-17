package poo.coche;

public class TestCoche {

	public static void main(String[] args) {
		        

		        // Crear un objeto de la clase Coche (Marca, modelo, color, maletero, puertas, potencia, velocidad, precio)

		        Coche miCoche1 = new Coche("Genesis", "G90", "Makalu Grey Matte",450,5,380,67, 15000);

		        Coche miCoche2 = new Coche("Mitsubichi", "Lancer X", "Blanco",650,5,150,49,25000);

		        Coche miCoche3 = new Coche("Audi", "R8", "Negro",500,5,130,25,30000);

		        

		        //COCHE1

		        miCoche1.mostrarDatos();

		        

		        miCoche1.pintarCoche("Hallasan Green");

		       

		        miCoche1.mostrarDatos();

		        

		        //COCHE2

		        miCoche2.mostrarDatos();

		        

		        miCoche2.pintarCoche("Rojo Cinabrio");

		        

		        miCoche2.mostrarDatos();

		        

		        //COCHE3

		        miCoche3.mostrarDatos();

		        

		        miCoche3.pintarCoche("Verde Neón");

		        

		        miCoche3.mostrarDatos();

		        


		    }

		}
		
		
		
		
		
		
	}

}
