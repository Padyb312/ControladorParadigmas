package co.edu.poli.mvc.modelo;

/**
 * Representa un traje especializado para la exploración de superficies
 * planetarias. Esta clase extiende de {@link Traje} y se enfoca en la autonomía
 * y resistencia durante misiones de reconocimiento. * @author Juan Jose Padilla
 * Vargas
 * 
 * @version 1.0
 */
public class TrajeExploracion extends Traje {

	/**
	 * Constructor para inicializar un Traje de Exploración con sus atributos
	 * heredados. * @param material Tipo de compuesto del traje.
	 * 
	 * @param peso                 Masa total en kilogramos.
	 * @param altura               Dimensión vertical.
	 * @param numero_traje         Identificador único serial.
	 * @param lugar_fabricacion    Planta de manufactura.
	 * @param astronauta           Usuario asignado al traje.
	 * @param resistencia_impactos Capacidad de absorción de daños físicos.
	 * @param tiempo_uso           Horas acumuladas de operación.
	 * @param capacidad_oxigeno    Límite máximo del sistema de soporte vital.
	 * @param cantidad_oxigeno     Nivel actual de reserva de oxígeno.
	 * @param desgaste             Factor de deterioro del equipo.
	 */
	public TrajeExploracion(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno,
			double cantidad_oxigeno, double desgaste) {
		super(material, peso, altura, numero_traje, lugar_fabricacion, astronauta, resistencia_impactos, tiempo_uso,
				capacidad_oxigeno, cantidad_oxigeno, desgaste);
	}

	/**
	 * Incrementa el nivel de oxígeno actual en el traje de exploración. A
	 * diferencia de otros modelos, este traje intenta aumentar el nivel en 2
	 * unidades, verificando que no exceda la capacidad máxima antes de actualizar
	 * el estado. * @return La cantidad de oxígeno resultante tras el proceso de
	 * aumento.
	 */
	@Override
	public double aumentarOxigeno() {
		double cantidad = getCantidad_oxigeno();
		double capacidad = getCapacidad_oxigeno();
		if (2 + cantidad < capacidad) {
			setCantidad_oxigeno(cantidad + 2);
		}
		return getCantidad_oxigeno();
	}

}