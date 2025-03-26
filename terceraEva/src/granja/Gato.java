/**
 * 
 */
package granja;

/** Clase Gato que hereda de Animal
 * @author Mati Eidelman
 * @version 1.0.0
 *  
 */
public class Gato extends Animal {
	
	// Atributos
	
	private String color,pais;
	

	/**Constructor Gato con nombre y edad
	 * @param nombre
	 * @param edad
	 * @throws Exception 
	 */
	public Gato(String nombre, int edad, Granja granja) throws Exception {
		super(nombre, edad, granja);
	}


	/**Constructor Gato con todos los datos
	 * @param nombre
	 * @param edad
	 * @param color
	 * @param pais
	 * @throws Exception 
	 */
	public Gato(String nombre, int edad, Granja granja, String color, String pais) throws Exception {
		super(nombre, edad, granja);
		this.color = color;
		this.pais = pais;
	}

	
//	Getters y Setters

	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}


	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	

	@Override
	public String hacerSonido() {
		return "Maulla y dice miau miau";
	}


	@Override
	public String comer() {
		return "Come pescado...";
	}


	@Override
	public String moverse() {
		return "Salta de un mueble a otro...";
	}


	// Tambien podriamos utilizar directamente el metodo enfermar de Animal.
	@Override
	public void enfermar(String vet) {
		super.enfermar(vet);
	}


	// Igual que en enfermar, podemos recurrir al metodo de la superclase.
	@Override
	public void vacunar(String vet) {
		super.vacunar(vet);
	}
	
	
	@Override
	public String toString() {
		return  super.toString()
				+ "\n" + (color != null ? "Color: " + color + "\n" : "") 
				+ (pais != null ? "Pais: " + pais : "")
				+ "\n";
	}

	
	
	
	

}
