package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Representa un Cliente
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Cliente {


	private Long id;
	private String nombre;
	private String correo;
	private Collection<Producto> productos = new ArrayList<>();

	/**
	 * Crea un Cliente
	 */
	public Cliente() {
	}

	/**
	 * Crea un Cliente
	 * 
	 * @param nombre Nombre del Cliente
	 * @param correo Correo del Cliente
	 */
	public Cliente(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * Devuelve un Id de un Cliente
	 * 
	 * @return Devuelve el Id de un Cliente
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de un Cliente
	 * 
	 * @param id Id del Cliente
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve un nombre de un Cliente
	 * 
	 * @return Devuelve el nombre de un Cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre de un Cliente
	 * 
	 * @param nombre Nombre del Cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve un correo de un Cliente
	 * 
	 * @return Devuelve el correo de un Cliente
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Guarda el correo de un Cliente
	 * 
	 * @param correo Correo del Cliente
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Devuelve los productos de un Cliente
	 * 
	 * @return Devuelve los productos de un Cliente
	 */
	public Collection<Producto> getProductos() {
		return productos;
	}

	/**
	 * Guarda los productos de un Cliente
	 * 
	 * @param productos Productos del Cliente
	 */
	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * Genera el método toString del Cliente
	 * 
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", correo=" + correo + "]";
	}

}
