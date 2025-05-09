package pooMusicBox;
import java.time.Duration;

public class MbCancion implements Comparable {

	

	/**
	 * clase que no se qué
	 */
	
//	Titulo
//	Duracion
//	Genero
//	Artista
//	Album
	
	private String titulo;
	private Duration duracion;
	private String genero;
	private MbArtista artista;
	
	
//	getters y setters
	
	
	
	
	@Override
	public int compareTo(Object o) {
										// Elegir orden natural
		return 0;
	}
	
	
	
	
}
