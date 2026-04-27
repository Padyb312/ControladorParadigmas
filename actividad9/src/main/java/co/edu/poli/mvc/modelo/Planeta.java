package co.edu.poli.mvc.modelo;

/**
 * Representa un cuerpo celeste de tipo planeta dentro del sistema de
 * exploración. Esta clase almacena información física, orbital y de
 * habitabilidad, permitiendo evaluar las condiciones ambientales y geográficas
 * de destinos espaciales. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class Planeta {

	/** Identificador único del planeta en la base de datos */
	private String id_planeta;

	/** Nombre común o científico del planeta */
	private String nombre;

	/** Tamaño o radio promedio del planeta */
	private double tamano;

	/** Fecha registrada del primer avistamiento o descubrimiento */
	private String fecha_descubrimiento;

	/** Tiempo de existencia del planeta en millones de años */
	private double edad;

	/** Distancia medida desde la Tierra (ej. años luz o UA) */
	private double distancia_tierra;

	/** Indica si el planeta posee condiciones aptas para la vida */
	private boolean es_habitable;

	/** Nombre del sol o estrella sobre la cual orbita el planeta */
	private String nombre_estrella_madre;

	/** Sistema galáctico al que pertenece el planeta */
	private String galaxia;

	/** Número de lunas o satélites naturales que orbitan el planeta */
	private int cantidad_satelites;

	/** Medida de la presión o composición de la atmósfera */
	private double densidad_atmosferica;

	/** Cantidad de depósitos o fuentes de agua detectadas */
	private int numero_cuerpos_agua;

	/** Proporción de agua en la superficie comparada con la Tierra */
	private double porcentaje_agua_tierra;

	/** Número de masas continentales identificadas */
	private int numero_continentes;

	/** Cantidad de formaciones terrestres menores rodeadas de agua */
	private int numero_islas;

	/** Duración de un día (giro sobre su propio eje) */
	private double tiempo_rotacion_eje;

	/** Duración de un año (periodo orbital alrededor de su estrella) */
	private double tiempo_rotacion_estrella;

	/** Medida de radiación presente en la superficie */
	private double tasa_radiacion_ambiental;

	/** Índice calculado de riesgo para misiones tripuladas */
	private double nivel_peligro;

	/**
	 * Constructor sobrecargado para inicializar un objeto Planeta con todos sus
	 * parámetros. * @param id_planeta ID único.
	 * 
	 * @param nombre                   Nombre del planeta.
	 * @param tamano                   Dimensiones.
	 * @param fecha_descubrimiento     Fecha de hallazgo.
	 * @param edad                     Antigüedad del cuerpo.
	 * @param distancia_tierra         Distancia relativa.
	 * @param es_habitable             Estado de habitabilidad.
	 * @param nombre_estrella_madre    Estrella anfitriona.
	 * @param galaxia                  Ubicación galáctica.
	 * @param cantidad_satelites       Número de lunas.
	 * @param densidad_atmosferica     Grosor de la atmósfera.
	 * @param numero_cuerpos_agua      Fuentes hídricas.
	 * @param porcentaje_agua_tierra   Comparativa hídrica.
	 * @param numero_continentes       Masas de tierra.
	 * @param numero_islas             Cantidad de islas.
	 * @param tiempo_rotacion_eje      Duración del día.
	 * @param tiempo_rotacion_estrella Duración del año.
	 * @param tasa_radiacion_ambiental Nivel de radiación.
	 * @param nivel_peligro            Grado de amenaza.
	 */
	public Planeta(String id_planeta, String nombre, double tamano, String fecha_descubrimiento, double edad,
			double distancia_tierra, boolean es_habitable, String nombre_estrella_madre, String galaxia,
			int cantidad_satelites, double densidad_atmosferica, int numero_cuerpos_agua, double porcentaje_agua_tierra,
			int numero_continentes, int numero_islas, double tiempo_rotacion_eje, double tiempo_rotacion_estrella,
			double tasa_radiacion_ambiental, double nivel_peligro) {
		this.id_planeta = id_planeta;
		this.nombre = nombre;
		this.tamano = tamano;
		this.fecha_descubrimiento = fecha_descubrimiento;
		this.edad = edad;
		this.distancia_tierra = distancia_tierra;
		this.es_habitable = es_habitable;
		this.nombre_estrella_madre = nombre_estrella_madre;
		this.galaxia = galaxia;
		this.cantidad_satelites = cantidad_satelites;
		this.densidad_atmosferica = densidad_atmosferica;
		this.numero_cuerpos_agua = numero_cuerpos_agua;
		this.porcentaje_agua_tierra = porcentaje_agua_tierra;
		this.numero_continentes = numero_continentes;
		this.numero_islas = numero_islas;
		this.tiempo_rotacion_eje = tiempo_rotacion_eje;
		this.tiempo_rotacion_estrella = tiempo_rotacion_estrella;
		this.tasa_radiacion_ambiental = tasa_radiacion_ambiental;
		this.nivel_peligro = nivel_peligro;
	}

	/** @return El ID del planeta */
	public String getId_planeta() {
		return id_planeta;
	}

	/** @param id_planeta Define el ID del planeta */
	public void setId_planeta(String id_planeta) {
		this.id_planeta = id_planeta;
	}

	/** @return El nombre del planeta */
	public String getNombre() {
		return nombre;
	}

	/** @param nombre Define el nombre del planeta */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** @return El tamaño del planeta */
	public double getTamano() {
		return tamano;
	}

	/** @param tamano Define el tamaño del planeta */
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	/** @return La fecha de descubrimiento */
	public String getFecha_descubrimiento() {
		return fecha_descubrimiento;
	}

	/** @param fecha_descubrimiento Define la fecha de descubrimiento */
	public void setFecha_descubrimiento(String fecha_descubrimiento) {
		this.fecha_descubrimiento = fecha_descubrimiento;
	}

	/** @return La edad del planeta */
	public double getEdad() {
		return edad;
	}

	/** @param edad Define la edad del planeta */
	public void setEdad(double edad) {
		this.edad = edad;
	}

	/** @return Distancia a la Tierra */
	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	/** @param distancia_tierra Define la distancia a la Tierra */
	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	/** @return true si es habitable, false de lo contrario */
	public boolean isEs_habitable() {
		return es_habitable;
	}

	/** @param es_habitable Define si es habitable */
	public void setEs_habitable(boolean es_habitable) {
		this.es_habitable = es_habitable;
	}

	/** @return Nombre de la estrella madre */
	public String getNombre_estrella_madre() {
		return nombre_estrella_madre;
	}

	/** @param nombre_estrella_madre Define la estrella madre */
	public void setNombre_estrella_madre(String nombre_estrella_madre) {
		this.nombre_estrella_madre = nombre_estrella_madre;
	}

	/** @return La galaxia de pertenencia */
	public String getGalaxia() {
		return galaxia;
	}

	/** @param galaxia Define la galaxia */
	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}

	/** @return Cantidad de satélites naturales */
	public int getCantidad_satelites() {
		return cantidad_satelites;
	}

	/** @param cantidad_satelites Define la cantidad de satélites */
	public void setCantidad_satelites(int cantidad_satelites) {
		this.cantidad_satelites = cantidad_satelites;
	}

	/** @return Valor de la densidad atmosférica */
	public double getDensidad_atmosferica() {
		return densidad_atmosferica;
	}

	/** @param densidad_atmosferica Define la densidad atmosférica */
	public void setDensidad_atmosferica(double densidad_atmosferica) {
		this.densidad_atmosferica = densidad_atmosferica;
	}

	/** @return El número de cuerpos de agua */
	public int getNumero_cuerpos_agua() {
		return numero_cuerpos_agua;
	}

	/** @param numero_cuerpos_agua Define el número de cuerpos de agua */
	public void setNumero_cuerpos_agua(int numero_cuerpos_agua) {
		this.numero_cuerpos_agua = numero_cuerpos_agua;
	}

	/** @return El porcentaje de agua */
	public double getPorcentaje_agua_tierra() {
		return porcentaje_agua_tierra;
	}

	/** @param porcentaje_agua_tierra Define el porcentaje de agua */
	public void setPorcentaje_agua_tierra(double porcentaje_agua_tierra) {
		this.porcentaje_agua_tierra = porcentaje_agua_tierra;
	}

	/** @return Número de continentes */
	public int getNumero_continentes() {
		return numero_continentes;
	}

	/** @param numero_continentes Define el número de continentes */
	public void setNumero_continentes(int numero_continentes) {
		this.numero_continentes = numero_continentes;
	}

	/** @return Número de islas */
	public int getNumero_islas() {
		return numero_islas;
	}

	/** @param numero_islas Define el número de islas */
	public void setNumero_islas(int numero_islas) {
		this.numero_islas = numero_islas;
	}

	/** @return Tiempo de rotación sobre eje */
	public double getTiempo_rotacion_eje() {
		return tiempo_rotacion_eje;
	}

	/** @param tiempo_rotacion_eje Define el tiempo de rotación eje */
	public void setTiempo_rotacion_eje(double tiempo_rotacion_eje) {
		this.tiempo_rotacion_eje = tiempo_rotacion_eje;
	}

	/** @return Tiempo de rotación alrededor de la estrella */
	public double getTiempo_rotacion_estrella() {
		return tiempo_rotacion_estrella;
	}

	/** @param tiempo_rotacion_estrella Define el tiempo orbital */
	public void setTiempo_rotacion_estrella(double tiempo_rotacion_estrella) {
		this.tiempo_rotacion_estrella = tiempo_rotacion_estrella;
	}

	/** @return Tasa de radiación ambiental */
	public double getTasa_radiacion_ambiental() {
		return tasa_radiacion_ambiental;
	}

	/** @param tasa_radiacion_ambiental Define la tasa de radiación */
	public void setTasa_radiacion_ambiental(double tasa_radiacion_ambiental) {
		this.tasa_radiacion_ambiental = tasa_radiacion_ambiental;
	}

	/** @return El nivel de peligro calculado */
	public double getNivel_peligro() {
		return nivel_peligro;
	}

	/** @param nivel_peligro Define el nivel de peligro */
	public void setNivel_peligro(double nivel_peligro) {
		this.nivel_peligro = nivel_peligro;
	}

	/**
	 * Retorna una representación en cadena de los datos del planeta.
	 * 
	 * @return String con la información detallada del objeto.
	 */
	@Override
	public String toString() {
		return "Planeta{" + "id_planeta='" + id_planeta + '\'' + ", nombre='" + nombre + '\'' + ", tamano=" + tamano
				+ ", fecha_descubrimiento='" + fecha_descubrimiento + '\'' + ", edad=" + edad + ", distancia_tierra="
				+ distancia_tierra + ", es_habitable=" + es_habitable + ", nombre_estrella_madre='"
				+ nombre_estrella_madre + '\'' + ", galaxia='" + galaxia + '\'' + ", cantidad_satelites="
				+ cantidad_satelites + ", densidad_atmosferica=" + densidad_atmosferica + ", numero_cuerpos_agua="
				+ numero_cuerpos_agua + ", porcentaje_agua_tierra=" + porcentaje_agua_tierra + ", numero_continentes="
				+ numero_continentes + ", numero_islas=" + numero_islas + ", tiempo_rotacion_eje=" + tiempo_rotacion_eje
				+ ", tiempo_rotacion_estrella=" + tiempo_rotacion_estrella + ", tasa_radiacion_ambiental="
				+ tasa_radiacion_ambiental + ", nivel_peligro=" + nivel_peligro + '}';
	}
}