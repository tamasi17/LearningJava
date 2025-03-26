/**
 * 
 */
package granja;

/** Clase Perro que hereda de Animal
 * @author Mati Eidelman
 * @version 1.0.0
 * 
 */
public class Perro extends Animal {
	
	// Atributos
	
	private String raza,pedigri;
	

	/**Constructor Perro con nombre y edad
	 * @param nombre
	 * @param edad
	 * @throws Exception 
	 */
	public Perro(String nombre, int edad, Granja granja) throws Exception {
		super(nombre, edad, granja);

	}


	/**Constructor Perro con todos los datos
	 * @param nombre
	 * @param edad
	 * @param raza
	 * @param pedigri
	 * @throws Exception 
	 */
	public Perro(String nombre, int edad, Granja granja, String raza, String pedigri) throws Exception {
		super(nombre, edad, granja);
		this.raza = raza;
		this.pedigri = pedigri;
	}

	
//	Getters y Setters

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}


	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}


	/**
	 * @return the pedigri
	 */
	public String getPedigri() {
		return pedigri;
	}


	/**
	 * @param pedigri the pedigri to set
	 */
	public void setPedigri(String pedigri) {
		this.pedigri = pedigri;
	}


	@Override
	public String hacerSonido() {
		return "Ladra y dice gua gua";
	}


	@Override
	public String comer() {
		return "Come croquetas";
	}


	@Override
	public String moverse() {
		return "Corre felizmente";
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
				+ "\n" + (raza != null ? "Raza: " + raza + "\n" : "") 
				+ (pedigri != null ? "Pedigri: " + pedigri : "")
				+ "\n";
	}


	
	
	
	
	

}
