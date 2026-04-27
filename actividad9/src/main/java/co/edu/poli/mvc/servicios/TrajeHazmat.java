package co.edu.poli.mvc.servicios;

import co.edu.poli.mvc.modelo.Astronauta;
import co.edu.poli.mvc.modelo.TrajeDeCombate;

/**
 * Representa un traje especializado para el manejo de materiales peligrosos
 * (Hazmat). Esta clase hereda de {@link TrajeDeCombate} e incorpora propiedades
 * específicas para la protección química, biológica o radiológica, además de
 * gestionar tiempos de exposición seguros. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class TrajeHazmat extends TrajeDeCombate {

	/**
	 * Tipo de contaminante o material peligroso para el cual el traje está
	 * certificado
	 */
	private String tipoMaterialPeligroso;

	/**
	 * Tiempo límite recomendado (en horas) para permanecer en un entorno
	 * contaminado
	 */
	private double tiempoMaximoExposicion;

	/**
	 * Constructor sobrecargado para inicializar un Traje Hazmat con sus atributos
	 * específicos y heredados. * @param material Tipo de compuesto del traje.
	 * 
	 * @param peso                   Masa total en kilogramos.
	 * @param altura                 Dimensión vertical.
	 * @param numeroTraje            Identificador único serial.
	 * @param lugarFabricacion       Planta de manufactura.
	 * @param astronauta             Usuario asignado al traje.
	 * @param resistenciaImpactos    Capacidad de absorción de daños físicos.
	 * @param tiempoUso              Horas acumuladas de operación.
	 * @param capacidadOxigeno       Límite máximo del sistema de soporte vital.
	 * @param cantidadOxigeno        Nivel actual de reserva de oxígeno.
	 * @param desgaste               Factor de deterioro del equipo.
	 * @param cantidadDeArmas        Número de armas instaladas (heredado de
	 *                               combate).
	 * @param tipoMaterialPeligroso  Categoría de material peligroso que soporta.
	 * @param tiempoMaximoExposicion Límite de tiempo en zona de riesgo.
	 */
	public TrajeHazmat(String material, double peso, double altura, String numeroTraje, String lugarFabricacion,
			Astronauta astronauta, double resistenciaImpactos, double tiempoUso, double capacidadOxigeno,
			double cantidadOxigeno, double desgaste, int cantidadDeArmas, String tipoMaterialPeligroso,
			double tiempoMaximoExposicion) {
		super(material, peso, altura, numeroTraje, lugarFabricacion, astronauta, resistenciaImpactos, tiempoUso,
				capacidadOxigeno, cantidadOxigeno, desgaste, cantidadDeArmas);
		this.tipoMaterialPeligroso = tipoMaterialPeligroso;
		this.tiempoMaximoExposicion = tiempoMaximoExposicion;
	}

	/** @return El tipo de material peligroso soportado */
	public String getTipoMaterialPeligroso() {
		return tipoMaterialPeligroso;
	}

	/** @param tipoMaterialPeligroso Define el tipo de material peligroso */
	public void setTipoMaterialPeligroso(String tipoMaterialPeligroso) {
		this.tipoMaterialPeligroso = tipoMaterialPeligroso;
	}

	/** @return El tiempo máximo de exposición permitido */
	public double getTiempoMaximoExposicion() {
		return tiempoMaximoExposicion;
	}

	/** @param tiempoMaximoExposicion Define el tiempo máximo de exposición */
	public void setTiempoMaximoExposicion(double tiempoMaximoExposicion) {
		this.tiempoMaximoExposicion = tiempoMaximoExposicion;
	}

	/**
	 * Retorna una representación textual del traje Hazmat, incluyendo los atributos
	 * de las clases padre (Combate y Traje).
	 * 
	 * @return Cadena con la información detallada del objeto.
	 */
	@Override
	public String toString() {
		return "TrajeHazmat{" + "tipoMaterialPeligroso='" + tipoMaterialPeligroso + '\'' + ", tiempoMaximoExposicion="
				+ tiempoMaximoExposicion + ", " + super.toString() + '}';
	}

	/**
	 * Incrementa el nivel de oxígeno actual en el traje Hazmat. Este modelo intenta
	 * aumentar el nivel en 3 unidades por ciclo de recarga, verificando la
	 * integridad del tanque antes de la operación. * @return La cantidad de oxígeno
	 * resultante tras la operación.
	 */
	@Override
	public double aumentarOxigeno() {
		double cantidad = getCantidad_oxigeno();
		double capacidad = getCapacidad_oxigeno();
		if (3 + cantidad < capacidad) {
			setCantidad_oxigeno(cantidad + 3);
		}
		return getCantidad_oxigeno();
	}

}