package co.edu.poli.mvc.servicios;

import co.edu.poli.mvc.modelo.Traje;

/**
 * Interfaz que define las operaciones de persistencia en archivos para la
 * entidad {@link Traje}. Proporciona los métodos necesarios para convertir
 * colecciones de trajes en flujos de bytes (serialización) y reconstruirlos a
 * partir de archivos almacenados (deserialización). * @author Juan Jose Padilla
 * Vargas
 * 
 * @version 1.0
 */
public interface OperacionArchivo {

	/**
	 * Convierte un arreglo de objetos Traje en un formato serializado y lo guarda
	 * en un archivo físico. * @param Trajes Arreglo de instancias de {@link Traje}
	 * que se desean persistir.
	 * 
	 * @param path Ruta del directorio donde se almacenará el archivo.
	 * @param name Nombre del archivo de destino (incluyendo extensión, por ejemplo:
	 *             .dat o .ser).
	 * @return Un mensaje de confirmación que indica si el proceso de guardado fue
	 *         exitoso o fallido.
	 */
	public String serializar(Traje[] Trajes, String path, String name) throws Exception;

	/**
	 * Lee un archivo previamente serializado y reconstruye el arreglo de objetos
	 * Traje original. * @param path Ruta del directorio donde se encuentra el
	 * archivo.
	 * 
	 * @param name Nombre del archivo que contiene los datos serializados.
	 * @return Un arreglo de {@link Traje} con la información recuperada del
	 *         archivo, o null si ocurre un error durante la lectura.
	 */
	public Traje[] deserializar(String path, String name) throws Exception;
}