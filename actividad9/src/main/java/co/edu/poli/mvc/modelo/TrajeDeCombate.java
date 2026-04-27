package co.edu.poli.mvc.modelo;

/**
 * Representa un tipo especializado de traje diseñado para situaciones de
 * combate. Hereda de la clase {@link Traje} e incorpora armamento, modificando
 * la lógica de cálculo de protección basada en su capacidad ofensiva. * @author
 * Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class TrajeDeCombate extends Traje {

	/** Cantidad de dispositivos de defensa o ataque integrados en el traje */
	private int cantidadDeArmas;

	/**
	 * Constructor sobrecargado para inicializar un Traje de Combate con sus
	 * atributos específicos y heredados. * @param material Tipo de compuesto del
	 * traje.
	 * 
	 * @param peso                 Masa total.
	 * @param altura               Dimensión vertical.
	 * @param numero_traje         Identificador único serial.
	 * @param lugar_fabricacion    Planta de manufactura.
	 * @param astronauta           Usuario asignado al traje.
	 * @param resistencia_impactos Capacidad de absorción de daños físicos.
	 * @param tiempo_uso           Horas acumuladas de operación.
	 * @param capacidad_oxigeno    Límite máximo del sistema de soporte vital.
	 * @param cantidad_oxigeno     Nivel actual de reserva de oxígeno.
	 * @param desgaste             Factor de deterioro del equipo.
	 * @param cantidadDeArmas      Número de armas instaladas.
	 */
	public TrajeDeCombate(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno,
			double cantidad_oxigeno, double desgaste, int cantidadDeArmas) {
		super(material, peso, altura, numero_traje, lugar_fabricacion, astronauta, resistencia_impactos, tiempo_uso,
				capacidad_oxigeno, cantidad_oxigeno, desgaste);
		this.cantidadDeArmas = cantidadDeArmas;
	}

	/** @return El número de armas integradas */
	public int getCantidadDeArmas() {
		return cantidadDeArmas;
	}

	/** @param cantidadDeArmas Define el número de armas del traje */
	public void setCantidadDeArmas(int cantidadDeArmas) {
		this.cantidadDeArmas = cantidadDeArmas;
	}

	/**
	 * Retorna una representación textual del traje de combate, incluyendo los
	 * atributos de la clase padre.
	 * 
	 * @return Cadena con la información detallada del objeto.
	 */
	@Override
	public String toString() {
		return "TrajeDeCombate{" + "cantidadDeArmas=" + cantidadDeArmas + ", " + super.toString() + '}';
	}

	/**
	 * Calcula la protección total del traje de combate. La fórmula extiende el
	 * cálculo base sumando un bono de 0.5 por cada arma disponible.
	 * 
	 * @return Valor numérico de la protección total calculada.
	 */
	@Override
	public double calcularProtecion() {
		return super.calcularProtecion() + ((double) cantidadDeArmas * 0.5);
	}

	/**
	 * Incrementa el nivel de oxígeno actual en una unidad, siempre y cuando no
	 * supere la capacidad máxima del tanque.
	 * 
	 * @return El nuevo nivel de oxígeno calculado.
	 */
	@Override
	public double aumentarOxigeno() {
		double cantidad = getCantidad_oxigeno();
		double capacidad = getCapacidad_oxigeno();
		if (++cantidad < capacidad) {
			setCantidad_oxigeno(cantidad);
		}
		return cantidad;
	}

}