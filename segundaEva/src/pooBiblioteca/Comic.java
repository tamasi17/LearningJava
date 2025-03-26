/**
 * 
 */
package pooBiblioteca;

import java.util.Objects;

/**
 * 
 */
public class Comic extends Libro {

	private int temporadas;
	

	@Override
	public int compareTo(Libro o) {
		return o.paginas-this.paginas;
	}
	
	
	/**
	 * @param titulo
	 * @param autor
	 * @param paginas
	 */
	public Comic(String titulo, String autor, int paginas, int temporadas) {
		super(titulo, autor, paginas);
		this.temporadas=temporadas;
	}


	@Override
	public String toString() {

		return this.titulo + "\n"
				+ this.autor + "\n"
				+ "Paginas: " + this.paginas + "\n"
				+ "Temporadas: " + this.temporadas + "\n"
				;
	}


	
	
	

}
