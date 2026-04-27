package co.edu.poli.mvc.modelo;

/**
 * Representa un fenómeno de radiación detectado en el entorno espacial. Esta
 * clase permite categorizar el tipo de radiación, medir su peligrosidad,
 * extensión y determinar si sus efectos son tratables o reversibles para la
 * tripulación. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class Radiacion {

	/** Categoría o nombre del tipo de radiación (ej: Alfa, Beta, Gamma, Cósmica) */
	private String tipo_radiacion;

	/** Índice numérico que representa el riesgo para la salud o equipos */
	private double nivel_peligro;

	/** Magnitud o intensidad de la radiación detectada */
	private double cantidad;

	/** Área geográfica o espacial que abarca el fenómeno */
	private double extension;

	/** Coordenadas o región específica donde se localiza la radiación */
	private String lugar;

	/** Fecha y hora en la que se detectó inicialmente el fenómeno */
	private String fecha_inicio;

	/** Indica si la radiación puede ser detectada por el espectro visual humano */
	private boolean es_visible;

	/** Indica si los daños biológicos causados pueden sanar por completo */
	private boolean es_curable;

	/**
	 * Indica si el efecto de la radiación en el entorno puede retornar a su estado
	 * original
	 */
	private boolean es_reversible;

	/**
	 * Indica si existen procedimientos médicos o técnicos para mitigar sus efectos
	 */
	private boolean es_tratable;

	/** Tonalidad observada o asignada para su representación gráfica */
	private String color;

	/** Capacidad de la radiación para atravesar diferentes materiales o tejidos */
	private double tasa_penetracion;

	/**
	 * Constructor sobrecargado para inicializar todos los atributos de un evento de
	 * radiación. * @param tipo_radiacion Tipo de emisión.
	 * 
	 * @param nivel_peligro    Grado de amenaza.
	 * @param cantidad         Intensidad medida.
	 * @param extension        Alcance del área.
	 * @param lugar            Ubicación del foco.
	 * @param fecha_inicio     Marca temporal de inicio.
	 * @param es_visible       Visibilidad óptica.
	 * @param es_curable       Posibilidad de cura biológica.
	 * @param es_reversible    Posibilidad de reversión ambiental.
	 * @param es_tratable      Existencia de tratamiento.
	 * @param color            Color representativo.
	 * @param tasa_penetracion Poder de penetración en materia.
	 */
	public Radiacion(String tipo_radiacion, double nivel_peligro, double cantidad, double extension, String lugar,
			String fecha_inicio, boolean es_visible, boolean es_curable, boolean es_reversible, boolean es_tratable,
			String color, double tasa_penetracion) {
		this.tipo_radiacion = tipo_radiacion;
		this.nivel_peligro = nivel_peligro;
		this.cantidad = cantidad;
		this.extension = extension;
		this.lugar = lugar;
		this.fecha_inicio = fecha_inicio;
		this.es_visible = es_visible;
		this.es_curable = es_curable;
		this.es_reversible = es_reversible;
		this.es_tratable = es_tratable;
		this.color = color;
		this.tasa_penetracion = tasa_penetracion;
	}

	/** @return El tipo de radiación */
	public String getTipo_radiacion() {
		return tipo_radiacion;
	}

	/** @param tipo_radiacion Define el tipo de radiación */
	public void setTipo_radiacion(String tipo_radiacion) {
		this.tipo_radiacion = tipo_radiacion;
	}

	/** @return El nivel de peligro */
	public double getNivel_peligro() {
		return nivel_peligro;
	}

	/** @param nivel_peligro Define el nivel de peligro */
	public void setNivel_peligro(double nivel_peligro) {
		this.nivel_peligro = nivel_peligro;
	}

	/** @return La cantidad/intensidad */
	public double getCantidad() {
		return cantidad;
	}

	/** @param cantidad Define la cantidad de radiación */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/** @return La extensión del área */
	public double getExtension() {
		return extension;
	}

	/** @param extension Define la extensión de la radiación */
	public void setExtension(double extension) {
		this.extension = extension;
	}

	/** @return El lugar de detección */
	public String getLugar() {
		return lugar;
	}

	/** @param lugar Define el lugar de la radiación */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/** @return La fecha de inicio */
	public String getFecha_inicio() {
		return fecha_inicio;
	}

	/** @param fecha_inicio Define la fecha de inicio */
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	/** @return true si es visible, false de lo contrario */
	public boolean isEs_visible() {
		return es_visible;
	}

	/** @param es_visible Define si es visible */
	public void setEs_visible(boolean es_visible) {
		this.es_visible = es_visible;
	}

	/** @return true si es curable biológicamente */
	public boolean isEs_curable() {
		return es_curable;
	}

	/** @param es_curable Define si es curable */
	public void setEs_curable(boolean es_curable) {
		this.es_curable = es_curable;
	}

	/** @return true si los efectos son reversibles */
	public boolean isEs_reversible() {
		return es_reversible;
	}

	/** @param es_reversible Define si es reversible */
	public void setEs_reversible(boolean es_reversible) {
		this.es_reversible = es_reversible;
	}

	/** @return true si existe tratamiento disponible */
	public boolean isEs_tratable() {
		return es_tratable;
	}

	/** @param es_tratable Define si es tratable */
	public void setEs_tratable(boolean es_tratable) {
		this.es_tratable = es_tratable;
	}

	/** @return El color de la radiación */
	public String getColor() {
		return color;
	}

	/** @param color Define el color asignado */
	public void setColor(String color) {
		this.color = color;
	}

	/** @return La tasa de penetración */
	public double getTasa_penetracion() {
		return tasa_penetracion;
	}

	/** @param tasa_penetracion Define la capacidad de penetración */
	public void setTasa_penetracion(double tasa_penetracion) {
		this.tasa_penetracion = tasa_penetracion;
	}

	/**
	 * Genera una representación en texto de las propiedades de la radiación.
	 * 
	 * @return Cadena con el estado actual del objeto Radiacion.
	 */
	@Override
	public String toString() {
		return "Radiacion{" + "tipo_radiacion='" + tipo_radiacion + '\'' + ", nivel_peligro=" + nivel_peligro
				+ ", cantidad=" + cantidad + ", extension=" + extension + ", lugar='" + lugar + '\''
				+ ", fecha_inicio='" + fecha_inicio + '\'' + ", es_visible=" + es_visible + ", es_curable=" + es_curable
				+ ", es_reversible=" + es_reversible + ", es_tratable=" + es_tratable + ", color='" + color + '\''
				+ ", tasa_penetracion=" + tasa_penetracion + '}';
	}
}