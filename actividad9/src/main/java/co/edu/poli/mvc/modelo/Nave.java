package co.edu.poli.mvc.modelo;

/**
 * Representa una unidad de transporte espacial (Nave) dentro del sistema. Esta
 * clase gestiona las especificaciones técnicas, capacidades de carga, recursos
 * vitales (oxígeno/combustible) y el estado físico del vehículo. * @author Juan
 * Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class Nave {

	/** Color exterior de la nave */
	private String color;

	/** Identificador único o nombre de registro de la nave */
	private String identificacion_nave;

	/** Tamaño general de la estructura */
	private double tamano;

	/** Número máximo de personas que pueden viajar en la nave */
	private int capacidad_tripulacion;

	/** Peso máximo de carga útil que puede transportar */
	private double capacidad_carga;

	/** Tipo de material predominante en la construcción del casco */
	private String material;

	/** Nación o entidad responsable de la fabricación */
	private String pais_creacion;

	/** Fecha en la que se completó la construcción */
	private String fecha_creacion;

	/** Coordenadas o zona actual donde se encuentra la nave */
	private String ubicacion;

	/** Masa total de la nave */
	private double peso;

	/** Dimensión vertical de la nave */
	private double altura;

	/** Capacidad total de almacenamiento de oxígeno */
	private double capacidad_oxigeno;

	/** Nivel actual de oxígeno disponible */
	private double cantidad_oxigeno;

	/** Porcentaje o índice que indica la integridad estructural */
	private double estado;

	/** Capacidad total del tanque de combustible */
	private double capacidad_combustible;

	/** Nivel actual de combustible en los tanques */
	private double cantidad_combustible;

	/**
	 * Constructor sobrecargado para inicializar una instancia completa de Nave.
	 * * @param color Tonalidad de la nave.
	 * 
	 * @param identificacion_nave   ID único.
	 * @param tamano                Dimensiones generales.
	 * @param capacidad_tripulacion Límite de personal.
	 * @param capacidad_carga       Límite de peso de carga.
	 * @param material              Material de construcción.
	 * @param pais_creacion         País de origen.
	 * @param fecha_creacion        Fecha de fabricación.
	 * @param ubicacion             Localización actual.
	 * @param peso                  Masa de la nave.
	 * @param altura                Altura total.
	 * @param capacidad_oxigeno     Límite de reserva de O2.
	 * @param cantidad_oxigeno      O2 actual.
	 * @param estado                Nivel de integridad.
	 * @param capacidad_combustible Límite de combustible.
	 * @param cantidad_combustible  Combustible actual.
	 */
	public Nave(String color, String identificacion_nave, double tamano, int capacidad_tripulacion,
			double capacidad_carga, String material, String pais_creacion, String fecha_creacion, String ubicacion,
			double peso, double altura, double capacidad_oxigeno, double cantidad_oxigeno, double estado,
			double capacidad_combustible, double cantidad_combustible) {
		this.color = color;
		this.identificacion_nave = identificacion_nave;
		this.tamano = tamano;
		this.capacidad_tripulacion = capacidad_tripulacion;
		this.capacidad_carga = capacidad_carga;
		this.material = material;
		this.pais_creacion = pais_creacion;
		this.fecha_creacion = fecha_creacion;
		this.ubicacion = ubicacion;
		this.peso = peso;
		this.altura = altura;
		this.capacidad_oxigeno = capacidad_oxigeno;
		this.cantidad_oxigeno = cantidad_oxigeno;
		this.estado = estado;
		this.capacidad_combustible = capacidad_combustible;
		this.cantidad_combustible = cantidad_combustible;
	}

	/** @return El color de la nave */
	public String getColor() {
		return color;
	}

	/** @param color El color a establecer */
	public void setColor(String color) {
		this.color = color;
	}

	/** @return La identificación de la nave */
	public String getIdentificacion_nave() {
		return identificacion_nave;
	}

	/** @param identificacion_nave La identificación a establecer */
	public void setIdentificacion_nave(String identificacion_nave) {
		this.identificacion_nave = identificacion_nave;
	}

	/** @return El tamaño de la nave */
	public double getTamano() {
		return tamano;
	}

	/** @param tamano El tamaño a establecer */
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	/** @return La capacidad de tripulación */
	public int getCapacidad_tripulacion() {
		return capacidad_tripulacion;
	}

	/** @param capacidad_tripulacion La capacidad a establecer */
	public void setCapacidad_tripulacion(int capacidad_tripulacion) {
		this.capacidad_tripulacion = capacidad_tripulacion;
	}

	/** @return La capacidad de carga */
	public double getCapacidad_carga() {
		return capacidad_carga;
	}

	/** @param capacidad_carga La capacidad de carga a establecer */
	public void setCapacidad_carga(double capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}

	/** @return El material de la nave */
	public String getMaterial() {
		return material;
	}

	/** @param material El material a establecer */
	public void setMaterial(String material) {
		this.material = material;
	}

	/** @return El país de creación */
	public String getPais_creacion() {
		return pais_creacion;
	}

	/** @param pais_creacion El país a establecer */
	public void setPais_creacion(String pais_creacion) {
		this.pais_creacion = pais_creacion;
	}

	/** @return La fecha de creación */
	public String getFecha_creacion() {
		return fecha_creacion;
	}

	/** @param fecha_creacion La fecha a establecer */
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	/** @return La ubicación actual */
	public String getUbicacion() {
		return ubicacion;
	}

	/** @param ubicacion La ubicación a establecer */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/** @return El peso de la nave */
	public double getPeso() {
		return peso;
	}

	/** @param peso El peso a establecer */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/** @return La altura de la nave */
	public double getAltura() {
		return altura;
	}

	/** @param altura La altura a establecer */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/** @return La capacidad de oxígeno */
	public double getCapacidad_oxigeno() {
		return capacidad_oxigeno;
	}

	/** @param capacidad_oxigeno La capacidad de O2 a establecer */
	public void setCapacidad_oxigeno(double capacidad_oxigeno) {
		this.capacidad_oxigeno = capacidad_oxigeno;
	}

	/** @return La cantidad de oxígeno actual */
	public double getCantidad_oxigeno() {
		return cantidad_oxigeno;
	}

	/** @param cantidad_oxigeno El nivel de O2 actual a establecer */
	public void setCantidad_oxigeno(double cantidad_oxigeno) {
		this.cantidad_oxigeno = cantidad_oxigeno;
	}

	/** @return El estado de integridad de la nave */
	public double getEstado() {
		return estado;
	}

	/** @param estado El estado a establecer */
	public void setEstado(double estado) {
		this.estado = estado;
	}

	/** @return La capacidad de combustible */
	public double getCapacidad_combustible() {
		return capacidad_combustible;
	}

	/** @param capacidad_combustible La capacidad de combustible a establecer */
	public void setCapacidad_combustible(double capacidad_combustible) {
		this.capacidad_combustible = capacidad_combustible;
	}

	/** @return La cantidad de combustible actual */
	public double getCantidad_combustible() {
		return cantidad_combustible;
	}

	/** @param cantidad_combustible El nivel de combustible a establecer */
	public void setCantidad_combustible(double cantidad_combustible) {
		this.cantidad_combustible = cantidad_combustible;
	}

	/**
	 * Devuelve una cadena con todos los atributos de la nave.
	 * 
	 * @return Representación en String de la Nave.
	 */
	@Override
	public String toString() {
		return "Nave{" + "color='" + color + '\'' + ", identificacion_nave='" + identificacion_nave + '\'' + ", tamano="
				+ tamano + ", capacidad_tripulacion=" + capacidad_tripulacion + ", capacidad_carga=" + capacidad_carga
				+ ", material='" + material + '\'' + ", pais_creacion='" + pais_creacion + '\'' + ", fecha_creacion='"
				+ fecha_creacion + '\'' + ", ubicacion='" + ubicacion + '\'' + ", peso=" + peso + ", altura=" + altura
				+ ", capacidad_oxigeno=" + capacidad_oxigeno + ", cantidad_oxigeno=" + cantidad_oxigeno + ", estado="
				+ estado + ", capacidad_combustible=" + capacidad_combustible + ", cantidad_combustible="
				+ cantidad_combustible + '}';
	}
}