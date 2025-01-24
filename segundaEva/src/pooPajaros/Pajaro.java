package pooPajaros;

public class Pajaro {
	
//	Construye un tipo pajaro donde se indique: especie, edad, color y una clave (ID)
	
//	Estara generado el identificador por el objeto (no lo introduce el usuario)
	
//	Tambien sabremos la cantidad de pajaros creada en cada momento.
	
//	Instanciaré varios pajaros y mostrare sus datos, con un ID distinto y cuantos son.
	
	
	
//	Atributos
	 
	private static int total=0;
	private int edad, id=10000;
	private String especie, color;
	
//	Constructor
	
	public Pajaro(String especie, String color, int edad) {
		
		this.especie=especie;
		this.color=color;
		this.edad=edad;
		newPajaro(); 
		this.id=id+total;
	}

//	Getters y Setters
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	Statics para ID y Total
	
	public int getId() {
		return id;
	}

	
	static void newPajaro() {
		total++;
	}
	
	static int muestraTotal() {
		return total;
	}

	
//	toString
	
	public String toString() {
		
		return "---- "+ this.especie + " ----\n"
				+ "Color: " + this.color + "\n"
				+ "Edad: " + this.edad + "\n"
				+ "ID: " + this.id + " ";
	}
	
	

}
