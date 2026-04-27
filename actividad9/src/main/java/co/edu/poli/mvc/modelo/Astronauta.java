package co.edu.poli.mvc.modelo;

import java.io.Serializable;

/**
 * Clase que representa a un astronauta dentro del sistema de gestión espacial.
 * Contiene la información personal, física y médica del astronauta, con énfasis
 * en el seguimiento de exposición a radiación.
 *
 * @author Juan Jose Padilla Vargas
 * @version 1.0
 */
public class Astronauta implements Serializable {

	/** Nombre completo del astronauta. */
	private String nombre;

	/** Fecha de nacimiento del astronauta en formato String (dd/mm/aaaa). */
	private String fecha_nacimiento;

	/** Fecha en la que el astronauta fue expuesto a radiación (dd/mm/aaaa). */
	private String fecha_exposicion;

	/** Nacionalidad o país de origen del astronauta. */
	private String nacionalidad;

	/** Grupo étnico al que pertenece el astronauta. */
	private String etnia;

	/**
	 * Género del astronauta representado por un carácter ('M' masculino, 'F'
	 * femenino).
	 */
	private char genero;

	/** Altura del astronauta expresada en metros. */
	private double altura;

	/** Peso del astronauta expresado en kilogramos. */
	private double peso;

	/** Identificador interno único del astronauta dentro del sistema. */
	private String id;

	/** Número de identificación oficial o documento de identidad del astronauta. */
	private String numero_identificacion;

	/**
	 * Cantidad de radiación recibida en una exposición puntual, expresada en mSv.
	 */
	private double cantidad_radiacion;

	/**
	 * Total de radiación acumulada por el astronauta a lo largo del tiempo,
	 * expresada en mSv.
	 */
	private double radiacion_acumulada;

	/**
	 * Área de especialización del astronauta (ej: piloto, ingeniero, científico).
	 */
	private String especialidad;

	/**
	 * Estado de salud actual del astronauta (ej: óptimo, en observación, crítico).
	 */
	private String estado_salud;

	/**
	 * Constructor sobrecargado que inicializa todos los atributos del astronauta.
	 *
	 * @param nombre                Nombre completo del astronauta.
	 * @param fecha_nacimiento      Fecha de nacimiento en formato String.
	 * @param fecha_exposicion      Fecha de exposición a radiación en formato
	 *                              String.
	 * @param nacionalidad          Nacionalidad del astronauta.
	 * @param etnia                 Grupo étnico del astronauta.
	 * @param genero                Género del astronauta ('M' o 'F').
	 * @param altura                Altura del astronauta en metros.
	 * @param peso                  Peso del astronauta en kilogramos.
	 * @param id                    Identificador interno del sistema.
	 * @param numero_identificacion Número de documento de identidad oficial.
	 * @param cantidad_radiacion    Dosis de radiación recibida en una exposición
	 *                              (mSv).
	 * @param radiacion_acumulada   Total de radiación acumulada (mSv).
	 * @param especialidad          Área de especialización del astronauta.
	 * @param estado_salud          Condición médica actual del astronauta.
	 */
	public Astronauta(String nombre, String fecha_nacimiento, String fecha_exposicion, String nacionalidad,
			String etnia, char genero, double altura, double peso, String id, String numero_identificacion,
			double cantidad_radiacion, double radiacion_acumulada, String especialidad, String estado_salud) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_exposicion = fecha_exposicion;
		this.nacionalidad = nacionalidad;
		this.etnia = etnia;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
		this.id = id;
		this.numero_identificacion = numero_identificacion;
		this.cantidad_radiacion = cantidad_radiacion;
		this.radiacion_acumulada = radiacion_acumulada;
		this.especialidad = especialidad;
		this.estado_salud = estado_salud;
	}

	/**
	 * Obtiene el nombre del astronauta.
	 *
	 * @return nombre del astronauta.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del astronauta.
	 *
	 * @param nombre Nuevo nombre del astronauta.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la fecha de nacimiento del astronauta.
	 *
	 * @return fecha de nacimiento en formato String.
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del astronauta.
	 *
	 * @param fecha_nacimiento Nueva fecha de nacimiento en formato String.
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * Obtiene la fecha de exposición a radiación del astronauta.
	 *
	 * @return fecha de exposición en formato String.
	 */
	public String getFecha_exposicion() {
		return fecha_exposicion;
	}

	/**
	 * Establece la fecha de exposición a radiación del astronauta.
	 *
	 * @param fecha_exposicion Nueva fecha de exposición en formato String.
	 */
	public void setFecha_exposicion(String fecha_exposicion) {
		this.fecha_exposicion = fecha_exposicion;
	}

	/**
	 * Obtiene la nacionalidad del astronauta.
	 *
	 * @return nacionalidad del astronauta.
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Establece la nacionalidad del astronauta.
	 *
	 * @param nacionalidad Nueva nacionalidad del astronauta.
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Obtiene la etnia del astronauta.
	 *
	 * @return etnia del astronauta.
	 */
	public String getEtnia() {
		return etnia;
	}

	/**
	 * Establece la etnia del astronauta.
	 *
	 * @param etnia Nueva etnia del astronauta.
	 */
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	/**
	 * Obtiene el género del astronauta.
	 *
	 * @return carácter que representa el género ('M' o 'F').
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * Establece el género del astronauta.
	 *
	 * @param genero Carácter que representa el nuevo género ('M' o 'F').
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * Obtiene la altura del astronauta.
	 *
	 * @return altura en metros.
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Establece la altura del astronauta.
	 *
	 * @param altura Nueva altura en metros.
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Obtiene el peso del astronauta.
	 *
	 * @return peso en kilogramos.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establece el peso del astronauta.
	 *
	 * @param peso Nuevo peso en kilogramos.
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene el identificador interno del astronauta en el sistema.
	 *
	 * @return id del astronauta.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Establece el identificador interno del astronauta en el sistema.
	 *
	 * @param id Nuevo identificador interno.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el número de identificación oficial del astronauta.
	 *
	 * @return número de identificación.
	 */
	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	/**
	 * Establece el número de identificación oficial del astronauta.
	 *
	 * @param numero_identificacion Nuevo número de identificación.
	 */
	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	/**
	 * Obtiene la cantidad de radiación recibida en una exposición puntual.
	 *
	 * @return cantidad de radiación en mSv.
	 */
	public double getCantidad_radiacion() {
		return cantidad_radiacion;
	}

	/**
	 * Establece la cantidad de radiación recibida en una exposición puntual.
	 *
	 * @param cantidad_radiacion Nueva cantidad de radiación en mSv.
	 */
	public void setCantidad_radiacion(double cantidad_radiacion) {
		this.cantidad_radiacion = cantidad_radiacion;
	}

	/**
	 * Obtiene el total de radiación acumulada por el astronauta.
	 *
	 * @return radiación acumulada en mSv.
	 */
	public double getRadiacion_acumulada() {
		return radiacion_acumulada;
	}

	/**
	 * Establece el total de radiación acumulada por el astronauta.
	 *
	 * @param radiacion_acumulada Nuevo valor de radiación acumulada en mSv.
	 */
	public void setRadiacion_acumulada(double radiacion_acumulada) {
		this.radiacion_acumulada = radiacion_acumulada;
	}

	/**
	 * Obtiene la especialidad del astronauta.
	 *
	 * @return especialidad del astronauta.
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Establece la especialidad del astronauta.
	 *
	 * @param especialidad Nueva especialidad del astronauta.
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Obtiene el estado de salud actual del astronauta.
	 *
	 * @return estado de salud del astronauta.
	 */
	public String getEstado_salud() {
		return estado_salud;
	}

	/**
	 * Establece el estado de salud actual del astronauta.
	 *
	 * @param estado_salud Nuevo estado de salud del astronauta.
	 */
	public void setEstado_salud(String estado_salud) {
		this.estado_salud = estado_salud;
	}

	/**
	 * Retorna una representación en cadena de texto del objeto {@code Astronauta},
	 * incluyendo todos sus atributos. Útil para depuración e impresión por consola.
	 *
	 * @return String con todos los atributos del astronauta en formato legible.
	 */
	@Override
	public String toString() {
		return "Astronauta{" + "nombre='" + nombre + '\'' + ", fecha_nacimiento='" + fecha_nacimiento + '\''
				+ ", fecha_exposicion='" + fecha_exposicion + '\'' + ", nacionalidad='" + nacionalidad + '\''
				+ ", etnia='" + etnia + '\'' + ", genero=" + genero + ", altura=" + altura + ", peso=" + peso + ", id='"
				+ id + '\'' + ", numero_identificacion='" + numero_identificacion + '\'' + ", cantidad_radiacion="
				+ cantidad_radiacion + ", radiacion_acumulada=" + radiacion_acumulada + ", especialidad='"
				+ especialidad + '\'' + ", estado_salud='" + estado_salud + '\'' + '}';
	}
}