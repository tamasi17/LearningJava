package pooAtletaComparable;

public class Atleta implements Comparable<Atleta> {

	
	/**

	 *

	 * Se les pide crear una clase llamada "Atleta" que represente a un atleta en una competencia.

	 * Cada atleta debe tener un nombre y un tiempo (en segundos) registrado en una carrera.

	 *

	 * 1. La clase "Atleta" debe implementar la interfaz Comparable para permitir la comparación entre atletas.

	 * 2. El criterio de comparación debe ser el tiempo de la carrera en orden ascendente.

	 * 3. Implementen el método compareTo correctamente.

	 * 4. En la clase principal, creen un array de objetos "Atleta" con algunos valores de ejemplo.

	 * 5. Ordenen el array utilizando Arrays.sort().

	 * 6. Finalmente, impriman la lista ordenada de atletas.

	 *

	 * Ejemplo de salida esperada:

	 * Ana - 10 segundos

	 * Sofía - 11 segundos

	 * Carlos - 12 segundos

	 * Luis - 15 segundos

	 */
	
	static int contador=0;
	private int codigo;
	private String nombre;
	private int tiempo;
	
	
	public Atleta(String nombre, int tiempo) {
		this.nombre=nombre;
		this.tiempo=tiempo;
		contador++;
		this.codigo=contador;
	}


	@Override
	public int compareTo(Atleta o) {
		return this.tiempo-o.tiempo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}


	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	/**
	 * @return the contador
	 */
	public static int getContador() {
		return contador;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	
	

}
