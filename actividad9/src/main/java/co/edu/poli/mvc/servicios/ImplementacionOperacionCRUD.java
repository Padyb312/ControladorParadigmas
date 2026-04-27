package co.edu.poli.mvc.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import co.edu.poli.mvc.modelo.*;

/**
 * Proporciona la implementación concreta de las operaciones de gestión y
 * persistencia para objetos Traje. Esta clase utiliza un arreglo dinámico para
 * el almacenamiento en memoria y flujos de objetos para la persistencia en
 * archivos físicos. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {

	/** Arreglo interno para almacenar las instancias de Traje */
	private Traje[] trajes = new Traje[2];

	/** Contador de elementos activos actualmente en el arreglo */
	private int contador = 0;

	/**
	 * Crea un nuevo registro de Traje. Si el arreglo está lleno, duplica su tamaño
	 * para permitir el crecimiento dinámico de la colección. * @param objeto
	 * Instancia de {@link Traje} a registrar.
	 * 
	 * @return Mensaje de éxito tras la creación.
	 */
	@Override
	public String crear(Traje objeto) {

		if (contador == trajes.length) {
			// Redimensionamiento dinámico del arreglo
			Traje[] newTrajes = new Traje[trajes.length * 2];
			for (int i = 0; i < trajes.length; i++) {
				newTrajes[i] = trajes[i];
			}
			trajes = newTrajes;
		}

		for (int i = 0; i < trajes.length; i++) {
			if (trajes[i] == null) {
				trajes[i] = objeto;
				contador++;
				return "Traje Creado";
			}
		}

		return null;
	}

	/**
	 * Busca un traje específico dentro del arreglo utilizando su número serial.
	 * * @param numero_traje Identificador único a buscar.
	 * 
	 * @return El objeto {@link Traje} si se encuentra; null de lo contrario.
	 */
	@Override
	public Traje leeruno(String numero_traje) {

		for (int i = 0; i < trajes.length; i++) {
			if (trajes[i] != null && trajes[i].getNumero_traje().equals(numero_traje)) {
				return trajes[i];
			}
		}
		return null;
	}

	/**
	 * Retorna la colección completa de trajes, incluyendo espacios nulos del
	 * arreglo. * @return Arreglo de {@link Traje}.
	 */
	@Override
	public Traje[] leerTodos() {
		return trajes;
	}

	/**
	 * Actualiza la información de un traje existente. El proceso consiste en
	 * eliminar la versión anterior y registrar la nueva instancia. * @param
	 * numero_traje ID del traje a modificar.
	 * 
	 * @param objeto Nueva instancia con datos actualizados.
	 * @return Mensaje indicando el resultado de la modificación.
	 */
	@Override
	public String modificar(String numero_traje, Traje objeto) {
		if (leeruno(numero_traje) != null) {
			eliminar(numero_traje);
			crear(objeto);
			return "Traje modificado";
		}
		return "Traje no encontrado";
	}

	/**
	 * Elimina un traje del arreglo y actualiza el contador de elementos. * @param
	 * numero_traje ID del traje a remover.
	 * 
	 * @return La instancia de {@link Traje} eliminada, o null si no se encontró.
	 */
	@Override
	public Traje eliminar(String numero_traje) {
		if (leeruno(numero_traje) != null) {
			for (int i = 0; i < trajes.length; i++) {
				if (trajes[i] != null && trajes[i].getNumero_traje().equals(numero_traje)) {
					Traje eliminado = trajes[i];
					trajes[i] = null;
					--contador;
					return eliminado;
				}
			}
		}
		return null;
	}

	/**
	 * Serializa el arreglo de trajes y lo guarda en la ruta especificada. * @param
	 * Trajes Arreglo a persistir.
	 * 
	 * @param path Directorio de destino.
	 * @param name Nombre del archivo resultante.
	 * @return Mensaje de estado de la operación de guardado.
	 */
	@Override
	public String serializar(Traje[] Trajes, String path, String name) throws Exception {
		try {
			FileOutputStream fos = new FileOutputStream(path + name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Trajes);
			oos.close();
			fos.close();
			return "File create!!";
		} catch (IOException ioe) {
			return "Error file " + ioe.getMessage();
		}
	}

	/**
	 * Reconstruye el arreglo de trajes desde un archivo serializado. * @param path
	 * Ruta del archivo.
	 * 
	 * @param name Nombre del archivo de datos.
	 * @return Arreglo de {@link Traje} recuperado o null en caso de error.
	 */
	@Override
	public Traje[] deserializar(String path, String name) throws Exception {
		Traje[] a = null;
		try {
			FileInputStream fis = new FileInputStream(path + name);
			ObjectInputStream ois = new ObjectInputStream(fis);
			a = (Traje[]) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch (ClassNotFoundException c) {
			System.err.println(c.getMessage());
		}
		return a;
	}
}