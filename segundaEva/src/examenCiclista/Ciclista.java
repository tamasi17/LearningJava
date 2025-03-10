/**
 * 
 */
package examenCiclista;

/**
 * Clase que define a un objeto Ciclista
 */
public class Ciclista {

//	Atributos
	
	private int id;
	private static int contador;
	private String nombre;
	private float tiempoCarrera;
	
//	Constructores
	
	/** Constructor nombre y carrera
	 * @param nombre
	 * @param tiempoCarrera
	 */
	public Ciclista(String nombre, float tiempoCarrera) {
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
		this.contador++;
		this.id=contador;
	}

	
//	Getters y Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the contador
	 */
	public static int getContador() {
		return contador;
	}

	// no hay setContador, se genera desde el constructor

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
	 * @return the tiempoCarrera
	 */
	public float getTiempoCarrera() {
		return tiempoCarrera;
	}

	/**
	 * @param tiempoCarrera the tiempoCarrera to set
	 */
	public void setTiempoCarrera(float tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}

	
	public String visualizaTipoCiclista() {
		return "Tipo ciclista: ";
	}

	@Override
	public String toString() {
		return "ID: " + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "tiempoCarrera="
				+ tiempoCarrera + "]";
	}
	
	
	
	
	
}
