/**
 * 
 */
package pooBiblioteca;

/**
 * 
 */
public class Enciclopedia extends Libro {
	
	private int tomos;

	public Enciclopedia(String titulo, String autor, int paginas, int tomos) {
		super(titulo, autor, paginas);
		this.tomos=tomos;
	}

	@Override
	public int compareTo(Libro lib) {
		return lib.paginas - this.paginas ;
	}

	@Override
	public String toString() {
		return titulo + "\n" + autor + "\n" + paginas;
	}
	
	

}
