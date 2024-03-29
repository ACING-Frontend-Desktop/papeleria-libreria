package es.mde.entidades;

/**
 * Representa un Libro
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Libro extends Producto {

	private String autor;
		
	/**
	 * Crea un Libro
	 */
	public Libro() {}

	/**
	 * Devuelve un Autor de un Libro
	 * 
	 * @return Devuelve el Autor de un Libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Guarda el autor de un Libro
	 * 
	 * @param autor Autor de un Libro
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
