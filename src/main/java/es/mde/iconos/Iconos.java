package es.mde.iconos;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Iconos {
	public static final Image ACING, USUARIO, USUARIOS, CUADERNO, EDITAR_LIBRO, EDITAR_USUARIO, ELIMINAR, ELIMINAR_LIBRO, ELIMINAR_USUARIO, EMAIL, LIBRO, LIBROS, VOLVER;
	private static int filas = 2;
	private static int columnas = 5;
	private static int numeroIconos = filas*columnas;
	private static String rutaIconos1 = "iconos1.png";
	private static String rutaIconos2 = "iconos2.png";
	
	static {
		BufferedImage aux1 = null;
		try {
			aux1 = ImageIO.read(Iconos.class.getResourceAsStream(rutaIconos1));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se ha encontrado el archivo de iconos: " + rutaIconos1);
		}
		finally{
			if(aux1 != null){
				int w, h;
				w = aux1.getWidth();
				h = aux1.getHeight();
				int anchoIcono = w/columnas;
				int altoIcono = h/filas;
				BufferedImage[] iconosSeparados1 = new BufferedImage[numeroIconos];
				for(int i = 0; i < filas; i++){
					for(int j  = 0; j < columnas; j++){
						iconosSeparados1[i*columnas + j] = aux1.getSubimage(j*altoIcono, i*anchoIcono, anchoIcono, altoIcono);
					}
				}
				USUARIO = iconosSeparados1[0];
				USUARIOS = iconosSeparados1[1];
				CUADERNO = iconosSeparados1[2];
				EDITAR_LIBRO = iconosSeparados1[3];
				EDITAR_USUARIO = iconosSeparados1[4];
				ELIMINAR_LIBRO = iconosSeparados1[5];
				ELIMINAR_USUARIO = iconosSeparados1[6];
				EMAIL = iconosSeparados1[7];
				LIBRO = iconosSeparados1[8];
				LIBROS = iconosSeparados1[9];
				
			}
			else
				USUARIO = USUARIOS = CUADERNO = EDITAR_LIBRO = EDITAR_USUARIO = ELIMINAR_LIBRO = ELIMINAR_USUARIO = EMAIL = LIBRO = LIBROS = null;
		}
	}
	static {
		BufferedImage aux2 = null;
		try {
			aux2 = ImageIO.read(Iconos.class.getResourceAsStream(rutaIconos2));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se ha encontrado el archivo de iconos: " + rutaIconos2);
		}
		finally{
			
			if(aux2 != null){
				int w, h;
				w = aux2.getWidth();
				h = aux2.getHeight();
				int anchoIcono = w/columnas;
				int altoIcono = h/filas;
				BufferedImage[] iconosSeparados2 = new BufferedImage[numeroIconos];
				for(int i = 0; i < filas; i++){
					for(int j  = 0; j < columnas; j++){
						iconosSeparados2[i*columnas + j] = aux2.getSubimage(j*altoIcono, i*anchoIcono, anchoIcono, altoIcono);
					}
				}
				ACING = iconosSeparados2[0];
				ELIMINAR = iconosSeparados2[5];
				VOLVER = iconosSeparados2[9];

				
			}
			else
				ACING = ELIMINAR = VOLVER = null;
		}
	}
	
	/**
	 * Devuelve un icono de dimensiones tamañoxtamaño con la imagen escogida. Si el fichero de iconos
	 * no pudo ser leido devuelve null.
	 * @param icono
	 * @param tama�o
	 * @return icono de dimensiones tamañoxtamaño con la imagen escogida
	 */
	public static ImageIcon getIcono(Image icono, int tamano) {
		ImageIcon imIc = null;
		if(icono != null)
			imIc = new ImageIcon(icono.getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT));
		
		return imIc;
	}
}