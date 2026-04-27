package co.edu.poli.mvc.modelo;

/**
 * Representa una misión espacial dentro del sistema de gestión. Esta clase
 * contiene información detallada sobre la logística, el personal, los costos y
 * el estado de ejecución de una misión al espacio. * @author Juan Jose Padilla
 * Vargas
 * 
 * @version 1.0
 */
public class Mision {

	/** Código único identificador de la misión */
	private String codigo_mision;

	/** Lugar de procedencia o lanzamiento de la misión */
	private String origen;

	/** Destino final o cuerpo celeste de la misión */
	private String destino;

	/** Fecha programada de inicio de la misión */
	private String fecha_mision;

	/** Fecha estimada en la que debería concluir la misión */
	private String fecha_fin_estimado_mision;

	/** Fecha en la que realmente finalizó la misión */
	private String fecha_real_finalizacion;

	/** Propósito o meta principal a lograr en la misión */
	private String objetivo_mision;

	/** Descripción o listado de los miembros involucrados */
	private String miembros;

	/** Objeto que representa el planeta de destino o estudio */
	private Planeta planeta;

	/** Inversión económica total de la misión */
	private double costo;

	/** Estado actual de la misión (ej: En curso, Finalizada, Cancelada) */
	private String estado;

	/** Detalles sobre los permisos o entidades que validan la misión */
	private String autorizacion;

	/** Valor numérico que representa la peligrosidad de la operación */
	private double nivel_riesgo;

	/** Arreglo de objetos Astronauta asignados a la misión */
	private Astronauta[] astronautas;

	/** Arreglo de objetos Nave utilizados en la misión */
	private Nave[] nave;

	/**
	 * Constructor sobrecargado para inicializar todos los atributos de la misión.
	 * * @param codigo_mision Identificador único.
	 * 
	 * @param origen                    Punto de partida.
	 * @param destino                   Punto de llegada.
	 * @param fecha_mision              Fecha de inicio.
	 * @param fecha_fin_estimado_mision Proyección de finalización.
	 * @param fecha_real_finalizacion   Fecha de cierre real.
	 * @param objetivo_mision           Meta de la misión.
	 * @param miembros                  Identificación de integrantes.
	 * @param planeta                   Instancia del planeta objetivo.
	 * @param costo                     Valor monetario.
	 * @param estado                    Fase actual.
	 * @param autorizacion              Documentación legal.
	 * @param nivel_riesgo              Cálculo de riesgo.
	 * @param astronautas               Colección de astronautas.
	 * @param nave                      Colección de naves.
	 */
	public Mision(String codigo_mision, String origen, String destino, String fecha_mision,
			String fecha_fin_estimado_mision, String fecha_real_finalizacion, String objetivo_mision, String miembros,
			Planeta planeta, double costo, String estado, String autorizacion, double nivel_riesgo,
			Astronauta[] astronautas, Nave[] nave) {
		this.codigo_mision = codigo_mision;
		this.origen = origen;
		this.destino = destino;
		this.fecha_mision = fecha_mision;
		this.fecha_fin_estimado_mision = fecha_fin_estimado_mision;
		this.fecha_real_finalizacion = fecha_real_finalizacion;
		this.objetivo_mision = objetivo_mision;
		this.miembros = miembros;
		this.planeta = planeta;
		this.costo = costo;
		this.estado = estado;
		this.autorizacion = autorizacion;
		this.nivel_riesgo = nivel_riesgo;
		this.astronautas = astronautas;
		this.nave = nave;
	}

	/** @return El código único de la misión */
	public String getCodigo_mision() {
		return codigo_mision;
	}

	/** @param codigo_mision Define el código único de la misión */
	public void setCodigo_mision(String codigo_mision) {
		this.codigo_mision = codigo_mision;
	}

	/** @return El lugar de origen */
	public String getOrigen() {
		return origen;
	}

	/** @param origen Define el lugar de origen */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/** @return El destino de la misión */
	public String getDestino() {
		return destino;
	}

	/** @param destino Define el destino de la misión */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/** @return La fecha de inicio */
	public String getFecha_mision() {
		return fecha_mision;
	}

	/** @param fecha_mision Define la fecha de inicio */
	public void setFecha_mision(String fecha_mision) {
		this.fecha_mision = fecha_mision;
	}

	/** @return La fecha estimada de fin */
	public String getFecha_fin_estimado_mision() {
		return fecha_fin_estimado_mision;
	}

	/** @param fecha_fin_estimado_mision Define la fecha estimada de fin */
	public void setFecha_fin_estimado_mision(String fecha_fin_estimado_mision) {
		this.fecha_fin_estimado_mision = fecha_fin_estimado_mision;
	}

	/** @return La fecha real en que terminó la misión */
	public String getFecha_real_finalizacion() {
		return fecha_real_finalizacion;
	}

	/** @param fecha_real_finalizacion Define la fecha real de finalización */
	public void setFecha_real_finalizacion(String fecha_real_finalizacion) {
		this.fecha_real_finalizacion = fecha_real_finalizacion;
	}

	/** @return El objetivo principal */
	public String getObjetivo_mision() {
		return objetivo_mision;
	}

	/** @param objetivo_mision Define el objetivo principal */
	public void setObjetivo_mision(String objetivo_mision) {
		this.objetivo_mision = objetivo_mision;
	}

	/** @return Los miembros de la misión */
	public String getMiembros() {
		return miembros;
	}

	/** @param miembros Define los miembros de la misión */
	public void setMiembros(String miembros) {
		this.miembros = miembros;
	}

	/** @return El objeto Planeta asociado */
	public Planeta getPlaneta() {
		return planeta;
	}

	/** @param planeta Establece el planeta de la misión */
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	/** @return El costo total */
	public double getCosto() {
		return costo;
	}

	/** @param costo Establece el costo total */
	public void setCosto(double costo) {
		this.costo = costo;
	}

	/** @return El estado de la misión */
	public String getEstado() {
		return estado;
	}

	/** @param estado Define el estado de la misión */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/** @return La información de autorización */
	public String getAutorizacion() {
		return autorizacion;
	}

	/** @param autorizacion Define la información de autorización */
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	/** @return El nivel de riesgo */
	public double getNivel_riesgo() {
		return nivel_riesgo;
	}

	/** @param nivel_riesgo Establece el nivel de riesgo */
	public void setNivel_riesgo(double nivel_riesgo) {
		this.nivel_riesgo = nivel_riesgo;
	}

	/** @return El arreglo de astronautas asignados */
	public Astronauta[] getAstronautas() {
		return astronautas;
	}

	/** @param astronautas Asigna el arreglo de astronautas */
	public void setAstronautas(Astronauta[] astronautas) {
		this.astronautas = astronautas;
	}

	/** @return El arreglo de naves asignadas */
	public Nave[] getNave() {
		return nave;
	}

	/** @param nave Asigna el arreglo de naves */
	public void setNave(Nave[] nave) {
		this.nave = nave;
	}

	/**
	 * Genera una representación en texto de los datos de la misión. * @return Una
	 * cadena de caracteres con los detalles del objeto Mision.
	 */
	@Override
	public String toString() {
		return "Mision{" + "codigo_mision='" + codigo_mision + '\'' + ", origen='" + origen + '\'' + ", destino='"
				+ destino + '\'' + ", fecha_mision='" + fecha_mision + '\'' + ", fecha_fin_estimado_mision='"
				+ fecha_fin_estimado_mision + '\'' + ", fecha_real_finalizacion='" + fecha_real_finalizacion + '\''
				+ ", objetivo_mision='" + objetivo_mision + '\'' + ", miembros='" + miembros + '\'' + ", planeta="
				+ (planeta != null ? planeta.getNombre() : "null") + ", costo=" + costo + ", estado='" + estado + '\''
				+ ", autorizacion='" + autorizacion + '\'' + ", nivel_riesgo=" + nivel_riesgo + ", Nave= " + nave + '}';
	}
}