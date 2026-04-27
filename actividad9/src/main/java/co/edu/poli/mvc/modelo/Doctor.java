package co.edu.poli.mvc.modelo;

/**
 * Clase que representa a un doctor dentro del sistema de gestión espacial.
 * Contiene la información personal, académica y laboral del doctor, así como
 * los registros médicos asociados a su práctica profesional.
 *
 * @author Juan Jose Padilla Vargas
 * @version 1.0
 */
public class Doctor {

	/** Nombre completo del doctor. */
	private String nombre;

	/** Universidad en la que el doctor obtuvo su título profesional. */
	private String universidad;

	/** Número de tarjeta profesional que certifica el ejercicio de la medicina. */
	private String numero_tarjeta_profesional;

	/** Fecha de graduación del doctor en formato String (dd/mm/aaaa). */
	private String fecha_graduacion;

	/** Grupo étnico al que pertenece el doctor. */
	private String etnia;

	/**
	 * Género del doctor representado por un carácter ('M' masculino, 'F' femenino).
	 */
	private char genero;

	/**
	 * Área de especialización médica del doctor (ej: radiología, medicina
	 * espacial).
	 */
	private String especializacion;

	/** Empresa u organización a la que pertenece el doctor. */
	private String empresa;

	/** Número del consultorio asignado al doctor dentro de la instalación. */
	private int numero_consultorio;

	/** Número de asistentes que apoyan al doctor en su labor médica. */
	private int numero_asistentes;

	/**
	 * Arreglo de objetos {@link Registro} que contiene los registros médicos
	 * gestionados por el doctor.
	 */
	private Registro[] registros;

	/**
	 * Constructor sobrecargado que inicializa todos los atributos del doctor.
	 *
	 * @param nombre                     Nombre completo del doctor.
	 * @param universidad                Universidad donde obtuvo su título.
	 * @param numero_tarjeta_profesional Número de tarjeta profesional del doctor.
	 * @param fecha_graduacion           Fecha de graduación en formato String.
	 * @param etnia                      Grupo étnico del doctor.
	 * @param genero                     Género del doctor ('M' o 'F').
	 * @param especializacion            Área de especialización médica.
	 * @param empresa                    Empresa u organización a la que pertenece.
	 * @param numero_consultorio         Número del consultorio asignado.
	 * @param numero_asistentes          Número de asistentes del doctor.
	 * @param registros                  Arreglo de registros médicos gestionados
	 *                                   por el doctor.
	 */
	public Doctor(String nombre, String universidad, String numero_tarjeta_profesional, String fecha_graduacion,
			String etnia, char genero, String especializacion, String empresa, int numero_consultorio,
			int numero_asistentes, Registro[] registros) {
		this.nombre = nombre;
		this.universidad = universidad;
		this.numero_tarjeta_profesional = numero_tarjeta_profesional;
		this.fecha_graduacion = fecha_graduacion;
		this.etnia = etnia;
		this.genero = genero;
		this.especializacion = especializacion;
		this.empresa = empresa;
		this.numero_consultorio = numero_consultorio;
		this.numero_asistentes = numero_asistentes;
		this.registros = registros;
	}

	/**
	 * Obtiene el nombre del doctor.
	 *
	 * @return nombre del doctor.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del doctor.
	 *
	 * @param nombre Nuevo nombre del doctor.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la universidad donde el doctor obtuvo su título.
	 *
	 * @return nombre de la universidad.
	 */
	public String getUniversidad() {
		return universidad;
	}

	/**
	 * Establece la universidad donde el doctor obtuvo su título.
	 *
	 * @param universidad Nueva universidad del doctor.
	 */
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	/**
	 * Obtiene el número de tarjeta profesional del doctor.
	 *
	 * @return número de tarjeta profesional.
	 */
	public String getNumero_tarjeta_profesional() {
		return numero_tarjeta_profesional;
	}

	/**
	 * Establece el número de tarjeta profesional del doctor.
	 *
	 * @param numero_tarjeta_profesional Nuevo número de tarjeta profesional.
	 */
	public void setNumero_tarjeta_profesional(String numero_tarjeta_profesional) {
		this.numero_tarjeta_profesional = numero_tarjeta_profesional;
	}

	/**
	 * Obtiene la fecha de graduación del doctor.
	 *
	 * @return fecha de graduación en formato String.
	 */
	public String getFecha_graduacion() {
		return fecha_graduacion;
	}

	/**
	 * Establece la fecha de graduación del doctor.
	 *
	 * @param fecha_graduacion Nueva fecha de graduación en formato String.
	 */
	public void setFecha_graduacion(String fecha_graduacion) {
		this.fecha_graduacion = fecha_graduacion;
	}

	/**
	 * Obtiene la etnia del doctor.
	 *
	 * @return etnia del doctor.
	 */
	public String getEtnia() {
		return etnia;
	}

	/**
	 * Establece la etnia del doctor.
	 *
	 * @param etnia Nueva etnia del doctor.
	 */
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	/**
	 * Obtiene el género del doctor.
	 *
	 * @return carácter que representa el género ('M' o 'F').
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * Establece el género del doctor.
	 *
	 * @param genero Carácter que representa el nuevo género ('M' o 'F').
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * Obtiene el área de especialización médica del doctor.
	 *
	 * @return especialización del doctor.
	 */
	public String getEspecializacion() {
		return especializacion;
	}

	/**
	 * Establece el área de especialización médica del doctor.
	 *
	 * @param especializacion Nueva especialización del doctor.
	 */
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	/**
	 * Obtiene la empresa u organización a la que pertenece el doctor.
	 *
	 * @return nombre de la empresa.
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Establece la empresa u organización a la que pertenece el doctor.
	 *
	 * @param empresa Nueva empresa del doctor.
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * Obtiene el número del consultorio asignado al doctor.
	 *
	 * @return número del consultorio.
	 */
	public int getNumero_consultorio() {
		return numero_consultorio;
	}

	/**
	 * Establece el número del consultorio asignado al doctor.
	 *
	 * @param numero_consultorio Nuevo número de consultorio.
	 */
	public void setNumero_consultorio(int numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}

	/**
	 * Obtiene el número de asistentes que apoyan al doctor.
	 *
	 * @return número de asistentes.
	 */
	public int getNumero_asistentes() {
		return numero_asistentes;
	}

	/**
	 * Establece el número de asistentes que apoyan al doctor.
	 *
	 * @param numero_asistentes Nuevo número de asistentes.
	 */
	public void setNumero_asistentes(int numero_asistentes) {
		this.numero_asistentes = numero_asistentes;
	}

	/**
	 * Obtiene el arreglo de registros médicos gestionados por el doctor.
	 *
	 * @return arreglo de objetos {@link Registro}.
	 */
	public Registro[] getRegistros() {
		return registros;
	}

	/**
	 * Establece el arreglo de registros médicos gestionados por el doctor.
	 *
	 * @param registros Nuevo arreglo de objetos {@link Registro}.
	 */
	public void setRegistros(Registro[] registros) {
		this.registros = registros;
	}

	/**
	 * Retorna una representación en cadena de texto del objeto {@code Doctor},
	 * incluyendo todos sus atributos principales. Útil para depuración e impresión
	 * por consola. El arreglo de {@link Registro} no se incluye directamente en
	 * esta representación.
	 *
	 * @return String con los atributos del doctor en formato legible.
	 */
	@Override
	public String toString() {
		return "Doctor{" + "nombre='" + nombre + '\'' + ", universidad='" + universidad + '\''
				+ ", numero_tarjeta_profesional='" + numero_tarjeta_profesional + '\'' + ", fecha_graduacion='"
				+ fecha_graduacion + '\'' + ", etnia='" + etnia + '\'' + ", genero=" + genero + ", especializacion='"
				+ especializacion + '\'' + ", empresa='" + empresa + '\'' + ", numero_consultorio=" + numero_consultorio
				+ ", numero_asistentes=" + numero_asistentes + '}';
	}
}