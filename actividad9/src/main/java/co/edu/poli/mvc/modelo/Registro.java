package co.edu.poli.mvc.modelo;

/**
 * Representa un registro médico y de control ambiental dentro de una misión.
 * Esta clase actúa como un nodo central que vincula al personal (Astronauta,
 * Doctor), la ubicación (Planeta), la logística (Misión) y los datos clínicos o
 * ambientales (Radiación, signos vitales) recolectados en un momento
 * específico. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class Registro {

	/** Identificador único del registro administrativo */
	private String numero_registro;

	/** Instalación o zona donde se realiza la atención o toma de datos */
	private String lugar_atencion;

	/** Referencia a la misión espacial activa durante el registro */
	private Mision mision;

	/** Referencia al planeta donde se genera el registro */
	private Planeta planeta;

	/** Profesional médico responsable de la atención o supervisión */
	private Doctor doctor;

	/** Astronauta sujeto del registro o atención médica */
	private Astronauta astronauta;

	/** Fecha del calendario en la que se realiza el registro */
	private String fecha;

	/** Hora de inicio del procedimiento o toma de muestra */
	private String hora_inicio;

	/** Hora de conclusión del procedimiento */
	private String hora_finalizacion;

	/** Punto geográfico o corporal de donde se extrae la muestra */
	private String lugar_muestra;

	/** Nivel de radiación total captado en el registro */
	private double cantidad_radiacion;

	/** Indica si se hallaron anomalías de salud durante la revisión */
	private boolean es_sintomas_detectados;

	/** Indica si se suministró medicina o terapia tras la detección */
	private boolean es_tratamiento_aplicado;

	/** Medida numérica representativa del estado físico del paciente */
	private double signos_vitales;

	/** Arreglo de eventos de radiación específicos asociados a este registro */
	private Radiacion[] radiacion;

	/**
	 * Constructor sobrecargado para la creación completa de un registro
	 * clínico-ambiental. * @param numero_registro ID del registro.
	 * 
	 * @param lugar_atencion          Centro de salud o base.
	 * @param mision                  Instancia de la misión.
	 * @param planeta                 Instancia del planeta.
	 * @param doctor                  Profesional a cargo.
	 * @param astronauta              Paciente o sujeto.
	 * @param fecha                   Día del registro.
	 * @param hora_inicio             Inicio de actividad.
	 * @param hora_finalizacion       Fin de actividad.
	 * @param lugar_muestra           Origen de la muestra física.
	 * @param cantidad_radiacion      Dosis de radiación.
	 * @param es_sintomas_detectados  Hallazgo de síntomas.
	 * @param es_tratamiento_aplicado Aplicación de medicina.
	 * @param signos_vitales          Valor de signos.
	 * @param radiacion               Colección de datos de radiación.
	 */
	public Registro(String numero_registro, String lugar_atencion, Mision mision, Planeta planeta, Doctor doctor,
			Astronauta astronauta, String fecha, String hora_inicio, String hora_finalizacion, String lugar_muestra,
			double cantidad_radiacion, boolean es_sintomas_detectados, boolean es_tratamiento_aplicado,
			double signos_vitales, Radiacion[] radiacion) {
		this.numero_registro = numero_registro;
		this.lugar_atencion = lugar_atencion;
		this.mision = mision;
		this.planeta = planeta;
		this.doctor = doctor;
		this.astronauta = astronauta;
		this.fecha = fecha;
		this.hora_inicio = hora_inicio;
		this.hora_finalizacion = hora_finalizacion;
		this.lugar_muestra = lugar_muestra;
		this.cantidad_radiacion = cantidad_radiacion;
		this.es_sintomas_detectados = es_sintomas_detectados;
		this.es_tratamiento_aplicado = es_tratamiento_aplicado;
		this.signos_vitales = signos_vitales;
		this.radiacion = radiacion;
	}

	/** @return El número de registro */
	public String getNumero_registro() {
		return numero_registro;
	}

	/** @param numero_registro Define el número de registro */
	public void setNumero_registro(String numero_registro) {
		this.numero_registro = numero_registro;
	}

	/** @return El lugar de atención */
	public String getLugar_atencion() {
		return lugar_atencion;
	}

	/** @param lugar_atencion Define el lugar de atención */
	public void setLugar_atencion(String lugar_atencion) {
		this.lugar_atencion = lugar_atencion;
	}

	/** @return El objeto Mision asociado */
	public Mision getMision() {
		return mision;
	}

	/** @param mision Establece la misión del registro */
	public void setMision(Mision mision) {
		this.mision = mision;
	}

	/** @return El objeto Planeta asociado */
	public Planeta getPlaneta() {
		return planeta;
	}

	/** @param planeta Establece el planeta del registro */
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	/** @return El objeto Doctor asignado */
	public Doctor getDoctor() {
		return doctor;
	}

	/** @param doctor Establece el doctor responsable */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/** @return El objeto Astronauta registrado */
	public Astronauta getAstronauta() {
		return astronauta;
	}

	/** @param astronauta Establece el astronauta atendido */
	public void setAstronauta(Astronauta astronauta) {
		this.astronauta = astronauta;
	}

	/** @return La fecha del registro */
	public String getFecha() {
		return fecha;
	}

	/** @param fecha Define la fecha del registro */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/** @return La hora de inicio */
	public String getHora_inicio() {
		return hora_inicio;
	}

	/** @param hora_inicio Define la hora de inicio */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	/** @return La hora de finalización */
	public String getHora_finalizacion() {
		return hora_finalizacion;
	}

	/** @param hora_finalizacion Define la hora de cierre */
	public void setHora_finalizacion(String hora_finalizacion) {
		this.hora_finalizacion = hora_finalizacion;
	}

	/** @return La ubicación de la muestra */
	public String getLugar_muestra() {
		return lugar_muestra;
	}

	/** @param lugar_muestra Define de dónde se tomó la muestra */
	public void setLugar_muestra(String lugar_muestra) {
		this.lugar_muestra = lugar_muestra;
	}

	/** @return La cantidad de radiación */
	public double getCantidad_radiacion() {
		return cantidad_radiacion;
	}

	/** @param cantidad_radiacion Establece la cantidad de radiación */
	public void setCantidad_radiacion(double cantidad_radiacion) {
		this.cantidad_radiacion = cantidad_radiacion;
	}

	/** @return true si se detectaron síntomas */
	public boolean isEs_sintomas_detectados() {
		return es_sintomas_detectados;
	}

	/** @param es_sintomas_detectados Define si hay síntomas */
	public void setEs_sintomas_detectados(boolean es_sintomas_detectados) {
		this.es_sintomas_detectados = es_sintomas_detectados;
	}

	/** @return true si se aplicó tratamiento */
	public boolean isEs_tratamiento_aplicado() {
		return es_tratamiento_aplicado;
	}

	/** @param es_tratamiento_aplicado Define si se aplicó tratamiento */
	public void setEs_tratamiento_aplicado(boolean es_tratamiento_aplicado) {
		this.es_tratamiento_aplicado = es_tratamiento_aplicado;
	}

	/** @return El valor de signos vitales */
	public double getSignos_vitales() {
		return signos_vitales;
	}

	/** @param signos_vitales Establece los signos vitales */
	public void setSignos_vitales(double signos_vitales) {
		this.signos_vitales = signos_vitales;
	}

	/** @return Arreglo de objetos Radiacion */
	public Radiacion[] getRadiacion() {
		return radiacion;
	}

	/** @param radiacion Asigna el arreglo de radiaciones */
	public void setRadiacion(Radiacion[] radiacion) {
		this.radiacion = radiacion;
	}

	/**
	 * Retorna una representación textual simplificada del registro.
	 * 
	 * @return Cadena con los datos principales del Registro.
	 */
	@Override
	public String toString() {
		return "Registro{" + "numero_registro='" + numero_registro + '\'' + ", lugar_atencion='" + lugar_atencion + '\''
				+ ", mision=" + (mision != null ? mision.getCodigo_mision() : "null") + ", planeta="
				+ (planeta != null ? planeta.getNombre() : "null") + ", doctor="
				+ (doctor != null ? doctor.getNombre() : "null") + ", astronauta="
				+ (astronauta != null ? astronauta.getNombre() : "null") + ", fecha='" + fecha + '\''
				+ ", hora_inicio='" + hora_inicio + '\'' + ", hora_finalizacion='" + hora_finalizacion + '\''
				+ ", lugar_muestra='" + lugar_muestra + '\'' + ", cantidad_radiacion=" + cantidad_radiacion
				+ ", es_sintomas_detectados=" + es_sintomas_detectados + ", es_tratamiento_aplicado="
				+ es_tratamiento_aplicado + ", signos_vitales=" + signos_vitales + '}';
	}
}