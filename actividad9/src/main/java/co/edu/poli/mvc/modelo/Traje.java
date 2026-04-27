package co.edu.poli.mvc.modelo;

import java.io.Serializable;

/**
 * Clase abstracta que define la estructura y el comportamiento base de un Traje
 * espacial. Al implementar {@link Serializable}, permite que el estado del
 * traje sea persistido o transmitido. Proporciona lógica para el cálculo de
 * protección, comparación de recursos y gestión de oxígeno. * @author Juan Jose
 * Padilla Vargas
 * 
 * @version 1.0
 */
public abstract class Traje implements Serializable{

	/** Material principal de fabricación del traje */
	private String material;

	/** Color global aplicado a todos los trajes de la flota (Atributo estático) */
	private static String color;

	/** Peso total del traje en kilogramos */
	private double peso;

	/** Altura o longitud total del traje */
	private double altura;

	/** Identificador único serial del traje */
	private String numero_traje;

	/** Ciudad o planta donde fue manufacturado el traje */
	private String lugar_fabricacion;

	/** Referencia al astronauta que tiene asignado este traje */
	private Astronauta astronauta;

	/**
	 * Valor base de protección contra radiación para todos los trajes (Atributo
	 * estático)
	 */
	private static double nivel_proteccion_radiacion;

	/** Capacidad del material para absorber golpes o micrometeoritos */
	private double resistencia_impactos;

	/** Horas totales que el traje ha sido operado */
	private double tiempo_uso;
	
	/** Volumen máximo de oxígeno que puede almacenar el sistema de soporte vital */
	private double capacidad_oxigeno;

	/** Nivel de oxígeno disponible actualmente */
	private double cantidad_oxigeno;

	/** Factor que reduce la efectividad del traje debido al uso */
	private double desgaste;

	/**
	 * Constructor sobrecargado para inicializar las propiedades comunes de
	 * cualquier traje. * @param material Tipo de textil o compuesto.
	 * 
	 * @param peso                 Masa del traje.
	 * @param altura               Dimensión vertical.
	 * @param numero_traje         ID serial.
	 * @param lugar_fabricacion    Planta de origen.
	 * @param astronauta           Usuario asignado.
	 * @param resistencia_impactos Nivel de dureza.
	 * @param tiempo_uso           Horas de servicio.
	 * @param capacidad_oxigeno    Límite del tanque.
	 * @param cantidad_oxigeno     Reserva actual.
	 * @param desgaste             Nivel de deterioro inicial.
	 */
	public Traje(String material, double peso, double altura, String numero_traje, String lugar_fabricacion,
			Astronauta astronauta, double resistencia_impactos, double tiempo_uso, double capacidad_oxigeno,
			double cantidad_oxigeno, double desgaste) {
		this.material = material;
		this.peso = peso;
		this.altura = altura;
		this.numero_traje = numero_traje;
		this.lugar_fabricacion = lugar_fabricacion;
		this.astronauta = astronauta;
		this.resistencia_impactos = resistencia_impactos;
		this.tiempo_uso = tiempo_uso;
		this.capacidad_oxigeno = capacidad_oxigeno;
		this.cantidad_oxigeno = cantidad_oxigeno;
		this.desgaste = desgaste;
	}

	// --- Getters y Setters ---

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Traje.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNumero_traje() {
		return numero_traje;
	}

	public void setNumero_traje(String numero_traje) {
		this.numero_traje = numero_traje;
	}

	public String getLugar_fabricacion() {
		return lugar_fabricacion;
	}

	public void setLugar_fabricacion(String lugar_fabricacion) {
		this.lugar_fabricacion = lugar_fabricacion;
	}

	public Astronauta getAstronauta() {
		return astronauta;
	}

	public void setAstronauta(Astronauta astronauta) {
		this.astronauta = astronauta;
	}

	public static double getNivel_proteccion_radiacion() {
		return nivel_proteccion_radiacion;
	}

	public static void setNivel_proteccion_radiacion(double nivel_proteccion_radiacion) {
		Traje.nivel_proteccion_radiacion = nivel_proteccion_radiacion;
	}

	public double getResistencia_impactos() {
		return resistencia_impactos;
	}

	public void setResistencia_impactos(double resistencia_impactos) {
		this.resistencia_impactos = resistencia_impactos;
	}

	public double getTiempo_uso() {
		return tiempo_uso;
	}

	public void setTiempo_uso(double tiempo_uso) {
		this.tiempo_uso = tiempo_uso;
	}

	public double getCapacidad_oxigeno() {
		return capacidad_oxigeno;
	}

	public void setCapacidad_oxigeno(double capacidad_oxigeno) {
		this.capacidad_oxigeno = capacidad_oxigeno;
	}

	public double getCantidad_oxigeno() {
		return cantidad_oxigeno;
	}

	public void setCantidad_oxigeno(double cantidad_oxigeno) {
		this.cantidad_oxigeno = cantidad_oxigeno;
	}

	public double getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	/**
	 * Calcula la protección actual del traje basada en la radiación, resistencia y
	 * desgaste.
	 * 
	 * @return El valor neto de protección.
	 */
	public double calcularProtecion() {
		return nivel_proteccion_radiacion * resistencia_impactos - desgaste;
	}

	/**
	 * Método sobrecargado para calcular una protección proyectada restando factores
	 * externos.
	 * 
	 * @param n Factor de penalización por nitrógeno o gases externos.
	 * @param h Factor de penalización por humedad o condiciones térmicas.
	 * @return El valor de protección ajustado.
	 */
	public double calcularProtecion(double n, double h) {
		return nivel_proteccion_radiacion - (n + h);
	}

	/**
	 * Obtiene la altura del astronauta vinculado al traje. Este método no puede ser
	 * sobrescrito.
	 * 
	 * @param nom Instancia del astronauta a consultar.
	 * @return Altura del astronauta en metros.
	 */
	public final double astronautaAltura(Astronauta nom) {
		return nom.getAltura();
	}

	/**
	 * Compara el nivel de protección de la instancia actual con otro traje. Imprime
	 * en consola los resultados de la comparación.
	 * 
	 * @param t Objeto de tipo Traje (o subclase) a comparar.
	 */
	public void compararProteccion(Traje t) {
		System.out.println("Traje [" + this.numero_traje + "] - Protección: " + this.calcularProtecion());
		System.out.println("Traje [" + t.getNumero_traje() + "] - Protección: " + t.calcularProtecion());
		if (this.calcularProtecion() > t.calcularProtecion()) {
			System.out.println("Mayor protección: [" + this.numero_traje + "]");
		} else {
			System.out.println("Mayor protección: [" + t.getNumero_traje() + "]");
		}
	}

	/**
	 * Evalúa cuál de los dos trajes posee una mayor reserva de oxígeno actual.
	 * 
	 * @param t Traje contra el cual se realizará la comparación.
	 * @return La instancia del traje (this o t) que tenga más oxígeno.
	 */
	public Traje trajeConMayorOxigeno(Traje t) {
		if (this.cantidad_oxigeno >= t.getCantidad_oxigeno()) {
			return this;
		} else {
			return t;
		}
	}

	/**
	 * Método abstracto que deberá ser implementado por las subclases para definir
	 * cómo se incrementa o recarga el oxígeno según el tipo específico de traje.
	 * 
	 * @return El nuevo nivel de oxígeno tras el aumento.
	 */
	public abstract double aumentarOxigeno();

	/**
	 * Retorna una representación textual de los datos del traje.
	 * 
	 * @return String con el estado actual de los atributos.
	 */
	@Override
	public String toString() {
		return "Traje{" + "material='" + material + '\'' + ", color='" + color + '\'' + ", peso=" + peso + ", altura="
				+ altura + ", numero_traje='" + numero_traje + '\'' + ", lugar_fabricacion='" + lugar_fabricacion + '\''
				+ ", astronauta=" + (astronauta != null ? astronauta.getNombre() : "null")
				+ ", nivel_proteccion_radiacion=" + nivel_proteccion_radiacion + ", resistencia_impactos="
				+ resistencia_impactos + ", tiempo_uso=" + tiempo_uso + ", capacidad_oxigeno=" + capacidad_oxigeno
				+ ", cantidad_oxigeno=" + cantidad_oxigeno + ", desgaste=" + desgaste + '}';
	}
}