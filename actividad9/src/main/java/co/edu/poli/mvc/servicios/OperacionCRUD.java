package co.edu.poli.mvc.servicios;

import co.edu.poli.mvc.modelo.Traje;

/**
 * Interfaz que define las operaciones estándar de persistencia (C.R.U.D.) para
 * la entidad {@link Traje}. Establece los métodos necesarios para la creación,
 * lectura, actualización y eliminación de trajes en el sistema de gestión.
 * * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public interface OperacionCRUD {

	/**
	 * Registra un nuevo objeto de tipo Traje en el almacén de datos.
	 * 
	 * @param objeto Instancia de {@link Traje} (o sus subclases) a ser persistida.
	 * @return Un mensaje de confirmación indicando el éxito o fracaso de la
	 *         operación.
	 */
	public String crear(Traje objeto);

	/**
	 * Busca y recupera un traje específico basado en su número de identificación.
	 * 
	 * @param numero_traje Identificador único del traje a consultar.
	 * @return El objeto {@link Traje} encontrado, o null si no existe una
	 *         coincidencia.
	 */
	public Traje leeruno(String numero_traje);

	/**
	 * Recupera la totalidad de los trajes registrados en el sistema.
	 * 
	 * @return Un arreglo con todos los objetos {@link Traje} almacenados.
	 */
	public Traje[] leerTodos();

	/**
	 * Actualiza la información de un traje existente en el sistema.
	 * 
	 * @param numero_traje Identificador único del traje que se desea modificar.
	 * @param objeto       Nueva instancia con los datos actualizados para
	 *                     reemplazar la anterior.
	 * @return Un mensaje indicando el resultado del proceso de actualización.
	 */
	public String modificar(String numero_traje, Traje objeto);

	/**
	 * Remueve un traje del sistema basándose en su número identificador.
	 * 
	 * @param numero_traje Identificador único del traje a eliminar.
	 * @return El objeto {@link Traje} que ha sido eliminado del sistema.
	 */
	public Traje eliminar(String numero_traje);
}