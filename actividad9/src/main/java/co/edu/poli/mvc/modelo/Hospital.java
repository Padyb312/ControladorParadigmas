package co.edu.poli.mvc.modelo;

/**
 * Clase que representa un hospital dentro del sistema de gestión espacial.
 * Contiene la información estructural, operativa y de personal del hospital,
 * incluyendo el cuerpo médico asociado a la institución.
 *
 * @author Juan Jose Padilla Vargas
 * @version 1.0
 */
public class Hospital {

	/** Nivel de complejidad del hospital (ej: 1 básico, 2 medio, 3 alto). */
	private int nivel_hospital;

	/** Tamaño físico del hospital expresado en metros cuadrados. */
	private double tamano;

	/** Dirección o ubicación geográfica del hospital. */
	private String ubicacion;

	/**
	 * Número de registro oficial que identifica al hospital ante las autoridades.
	 */
	private String registro_hospital;

	/**
	 * Indica si el hospital es de carácter público ({@code true}) o privado
	 * ({@code false}).
	 */
	private boolean es_publico;

	/** Color institucional o identificador visual del hospital. */
	private String color;

	/**
	 * Capacidad máxima de atención del hospital expresada en número de pacientes.
	 */
	private int capacidad;

	/** Porcentaje o indicador numérico de disponibilidad actual del hospital. */
	private double es_disponible;

	/** Número total de empleados que laboran en el hospital. */
	private int numero_empleados;

	/** Número actual de pacientes atendidos en el hospital. */
	private int numero_pacientes;

	/** Número total de consultorios disponibles en el hospital. */
	private int numero_consultorios;

	/** Número total de camas disponibles en el hospital. */
	private int numero_camas;

	/** Número total de baños disponibles en las instalaciones del hospital. */
	private int numero_banos;

	/**
	 * Área de especialidad médica principal del hospital (ej: traumatología,
	 * oncología).
	 */
	private String especialidad;

	/**
	 * Arreglo de objetos {@link Doctor} que representa el cuerpo médico vinculado
	 * al hospital.
	 */
	private Doctor[] doctor;

	/**
	 * Constructor sobrecargado que inicializa todos los atributos del hospital.
	 *
	 * @param nivel_hospital      Nivel de complejidad del hospital.
	 * @param tamano              Tamaño del hospital en metros cuadrados.
	 * @param ubicacion           Dirección o ubicación geográfica del hospital.
	 * @param registro_hospital   Número de registro oficial del hospital.
	 * @param es_publico          {@code true} si es público, {@code false} si es
	 *                            privado.
	 * @param color               Color institucional del hospital.
	 * @param capacidad           Capacidad máxima de atención en número de
	 *                            pacientes.
	 * @param es_disponible       Indicador numérico de disponibilidad actual.
	 * @param numero_empleados    Número total de empleados del hospital.
	 * @param numero_pacientes    Número actual de pacientes en el hospital.
	 * @param numero_consultorios Número total de consultorios disponibles.
	 * @param numero_camas        Número total de camas disponibles.
	 * @param numero_banos        Número total de baños en las instalaciones.
	 * @param especialidad        Especialidad médica principal del hospital.
	 * @param doctor              Arreglo de objetos {@link Doctor} vinculados al
	 *                            hospital.
	 */
	public Hospital(int nivel_hospital, double tamano, String ubicacion, String registro_hospital, boolean es_publico,
			String color, int capacidad, double es_disponible, int numero_empleados, int numero_pacientes,
			int numero_consultorios, int numero_camas, int numero_banos, String especialidad, Doctor[] doctor) {
		this.nivel_hospital = nivel_hospital;
		this.tamano = tamano;
		this.ubicacion = ubicacion;
		this.registro_hospital = registro_hospital;
		this.es_publico = es_publico;
		this.color = color;
		this.capacidad = capacidad;
		this.es_disponible = es_disponible;
		this.numero_empleados = numero_empleados;
		this.numero_pacientes = numero_pacientes;
		this.numero_consultorios = numero_consultorios;
		this.numero_camas = numero_camas;
		this.numero_banos = numero_banos;
		this.especialidad = especialidad;
		this.doctor = doctor;
	}

	/**
	 * Obtiene el nivel de complejidad del hospital.
	 *
	 * @return nivel del hospital.
	 */
	public int getNivel_hospital() {
		return nivel_hospital;
	}

	/**
	 * Establece el nivel de complejidad del hospital.
	 *
	 * @param nivel_hospital Nuevo nivel del hospital.
	 */
	public void setNivel_hospital(int nivel_hospital) {
		this.nivel_hospital = nivel_hospital;
	}

	/**
	 * Obtiene el tamaño físico del hospital.
	 *
	 * @return tamaño en metros cuadrados.
	 */
	public double getTamano() {
		return tamano;
	}

	/**
	 * Establece el tamaño físico del hospital.
	 *
	 * @param tamano Nuevo tamaño en metros cuadrados.
	 */
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	/**
	 * Obtiene la ubicación o dirección del hospital.
	 *
	 * @return ubicación del hospital.
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Establece la ubicación o dirección del hospital.
	 *
	 * @param ubicacion Nueva ubicación del hospital.
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Obtiene el número de registro oficial del hospital.
	 *
	 * @return registro del hospital.
	 */
	public String getRegistro_hospital() {
		return registro_hospital;
	}

	/**
	 * Establece el número de registro oficial del hospital.
	 *
	 * @param registro_hospital Nuevo registro del hospital.
	 */
	public void setRegistro_hospital(String registro_hospital) {
		this.registro_hospital = registro_hospital;
	}

	/**
	 * Indica si el hospital es de carácter público.
	 *
	 * @return {@code true} si el hospital es público, {@code false} si es privado.
	 */
	public boolean isEs_publico() {
		return es_publico;
	}

	/**
	 * Establece si el hospital es de carácter público o privado.
	 *
	 * @param es_publico {@code true} para público, {@code false} para privado.
	 */
	public void setEs_publico(boolean es_publico) {
		this.es_publico = es_publico;
	}

	/**
	 * Obtiene el color institucional del hospital.
	 *
	 * @return color institucional del hospital.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color institucional del hospital.
	 *
	 * @param color Nuevo color institucional del hospital.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene la capacidad máxima de atención del hospital.
	 *
	 * @return capacidad en número de pacientes.
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Establece la capacidad máxima de atención del hospital.
	 *
	 * @param capacidad Nueva capacidad en número de pacientes.
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Obtiene el indicador de disponibilidad actual del hospital.
	 *
	 * @return indicador numérico de disponibilidad.
	 */
	public double getEs_disponible() {
		return es_disponible;
	}

	/**
	 * Establece el indicador de disponibilidad actual del hospital.
	 *
	 * @param es_disponible Nuevo indicador numérico de disponibilidad.
	 */
	public void setEs_disponible(double es_disponible) {
		this.es_disponible = es_disponible;
	}

	/**
	 * Obtiene el número total de empleados del hospital.
	 *
	 * @return número de empleados.
	 */
	public int getNumero_empleados() {
		return numero_empleados;
	}

	/**
	 * Establece el número total de empleados del hospital.
	 *
	 * @param numero_empleados Nuevo número de empleados.
	 */
	public void setNumero_empleados(int numero_empleados) {
		this.numero_empleados = numero_empleados;
	}

	/**
	 * Obtiene el número actual de pacientes en el hospital.
	 *
	 * @return número de pacientes.
	 */
	public int getNumero_pacientes() {
		return numero_pacientes;
	}

	/**
	 * Establece el número actual de pacientes en el hospital.
	 *
	 * @param numero_pacientes Nuevo número de pacientes.
	 */
	public void setNumero_pacientes(int numero_pacientes) {
		this.numero_pacientes = numero_pacientes;
	}

	/**
	 * Obtiene el número total de consultorios disponibles en el hospital.
	 *
	 * @return número de consultorios.
	 */
	public int getNumero_consultorios() {
		return numero_consultorios;
	}

	/**
	 * Establece el número total de consultorios disponibles en el hospital.
	 *
	 * @param numero_consultorios Nuevo número de consultorios.
	 */
	public void setNumero_consultorios(int numero_consultorios) {
		this.numero_consultorios = numero_consultorios;
	}

	/**
	 * Obtiene el número total de camas disponibles en el hospital.
	 *
	 * @return número de camas.
	 */
	public int getNumero_camas() {
		return numero_camas;
	}

	/**
	 * Establece el número total de camas disponibles en el hospital.
	 *
	 * @param numero_camas Nuevo número de camas.
	 */
	public void setNumero_camas(int numero_camas) {
		this.numero_camas = numero_camas;
	}

	/**
	 * Obtiene el número total de baños en las instalaciones del hospital.
	 *
	 * @return número de baños.
	 */
	public int getNumero_banos() {
		return numero_banos;
	}

	/**
	 * Establece el número total de baños en las instalaciones del hospital.
	 *
	 * @param numero_banos Nuevo número de baños.
	 */
	public void setNumero_banos(int numero_banos) {
		this.numero_banos = numero_banos;
	}

	/**
	 * Obtiene la especialidad médica principal del hospital.
	 *
	 * @return especialidad del hospital.
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Establece la especialidad médica principal del hospital.
	 *
	 * @param especialidad Nueva especialidad del hospital.
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Obtiene el arreglo de doctores vinculados al hospital.
	 *
	 * @return arreglo de objetos {@link Doctor}.
	 */
	public Doctor[] getDoctor() {
		return doctor;
	}

	/**
	 * Establece el arreglo de doctores vinculados al hospital.
	 *
	 * @param doctor Nuevo arreglo de objetos {@link Doctor}.
	 */
	public void setDoctor(Doctor[] doctor) {
		this.doctor = doctor;
	}

	/**
	 * Retorna una representación en cadena de texto del objeto {@code Hospital},
	 * incluyendo todos sus atributos principales. Útil para depuración e impresión
	 * por consola. El arreglo de {@link Doctor} no se incluye directamente en esta
	 * representación.
	 *
	 * @return String con los atributos del hospital en formato legible.
	 */
	@Override
	public String toString() {
		return "Hospital{" + "nivel_hospital=" + nivel_hospital + ", tamano=" + tamano + ", ubicacion='" + ubicacion
				+ '\'' + ", registro_hospital='" + registro_hospital + '\'' + ", es_publico=" + es_publico + ", color='"
				+ color + '\'' + ", capacidad=" + capacidad + ", es_disponible=" + es_disponible + ", numero_empleados="
				+ numero_empleados + ", numero_pacientes=" + numero_pacientes + ", numero_consultorios="
				+ numero_consultorios + ", numero_camas=" + numero_camas + ", numero_banos=" + numero_banos
				+ ", especialidad='" + especialidad + '\'' + '}';
	}
}