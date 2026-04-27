package co.edu.poli.mvc.modelo;

/**
 * Clase final que representa el combustible utilizado en el sistema de gestión
 * espacial. Contiene información sobre las características físicas, comerciales
 * y logísticas del combustible empleado en las misiones. Al ser declarada como
 * {@code final}, no puede ser extendida por ninguna otra clase.
 *
 * @author Juan Jose Padilla Vargas
 * @version 1.0
 */
public final class Combustible {

	/** Tipo de combustible utilizado (ej: hidrógeno líquido, queroseno). */
	private String tipo_combustible;

	/** Marca o proveedor del combustible. */
	private String marca;

	/** Fecha en la que se obtuvo el combustible en formato String (dd/mm/aaaa). */
	private String fecha_obtencion;

	/** Lugar geográfico o instalación donde fue extraído el combustible. */
	private String lugar_extraccion;

	/** Cantidad total de combustible disponible, expresada en litros. */
	private double cantidad;

	/** Densidad del combustible expresada en kg/L. */
	private double densidad;

	/** Peso total del combustible expresado en kilogramos. */
	private double peso;

	/** Precio del combustible expresado en la unidad monetaria correspondiente. */
	private double precio;

	/** Nombre del transportista responsable del traslado del combustible. */
	private String nombre_transportista;

	/**
	 * Capacidad máxima del contenedor o tanque de combustible, expresada en litros.
	 */
	private double capacidad_combustible;

	/**
	 * Cantidad actual de combustible disponible en el tanque, expresada en litros.
	 */
	private double cantidad_combustible;

	/**
	 * Constructor sobrecargado que inicializa todos los atributos del combustible.
	 *
	 * @param tipo_combustible      Tipo de combustible (ej: hidrógeno líquido,
	 *                              queroseno).
	 * @param marca                 Marca o proveedor del combustible.
	 * @param fecha_obtencion       Fecha de obtención del combustible en formato
	 *                              String.
	 * @param lugar_extraccion      Lugar de extracción o procedencia del
	 *                              combustible.
	 * @param cantidad              Cantidad total de combustible en litros.
	 * @param densidad              Densidad del combustible en kg/L.
	 * @param peso                  Peso total del combustible en kilogramos.
	 * @param precio                Precio del combustible en unidad monetaria.
	 * @param nombre_transportista  Nombre del transportista responsable del
	 *                              traslado.
	 * @param capacidad_combustible Capacidad máxima del tanque en litros.
	 * @param cantidad_combustible  Cantidad actual de combustible en el tanque en
	 *                              litros.
	 */
	public Combustible(String tipo_combustible, String marca, String fecha_obtencion, String lugar_extraccion,
			double cantidad, double densidad, double peso, double precio, String nombre_transportista,
			double capacidad_combustible, double cantidad_combustible) {
		this.tipo_combustible = tipo_combustible;
		this.marca = marca;
		this.fecha_obtencion = fecha_obtencion;
		this.lugar_extraccion = lugar_extraccion;
		this.cantidad = cantidad;
		this.densidad = densidad;
		this.peso = peso;
		this.precio = precio;
		this.nombre_transportista = nombre_transportista;
		this.capacidad_combustible = capacidad_combustible;
		this.cantidad_combustible = cantidad_combustible;
	}

	/**
	 * Obtiene el tipo de combustible.
	 *
	 * @return tipo de combustible.
	 */
	public String getTipo_combustible() {
		return tipo_combustible;
	}

	/**
	 * Establece el tipo de combustible.
	 *
	 * @param tipo_combustible Nuevo tipo de combustible.
	 */
	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	/**
	 * Obtiene la marca o proveedor del combustible.
	 *
	 * @return marca del combustible.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Establece la marca o proveedor del combustible.
	 *
	 * @param marca Nueva marca del combustible.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Obtiene la fecha de obtención del combustible.
	 *
	 * @return fecha de obtención en formato String.
	 */
	public String getFecha_obtencion() {
		return fecha_obtencion;
	}

	/**
	 * Establece la fecha de obtención del combustible.
	 *
	 * @param fecha_obtencion Nueva fecha de obtención en formato String.
	 */
	public void setFecha_obtencion(String fecha_obtencion) {
		this.fecha_obtencion = fecha_obtencion;
	}

	/**
	 * Obtiene el lugar de extracción del combustible.
	 *
	 * @return lugar de extracción del combustible.
	 */
	public String getLugar_extraccion() {
		return lugar_extraccion;
	}

	/**
	 * Establece el lugar de extracción del combustible.
	 *
	 * @param lugar_extraccion Nuevo lugar de extracción.
	 */
	public void setLugar_extraccion(String lugar_extraccion) {
		this.lugar_extraccion = lugar_extraccion;
	}

	/**
	 * Obtiene la cantidad total de combustible disponible.
	 *
	 * @return cantidad de combustible en litros.
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * Establece la cantidad total de combustible disponible.
	 *
	 * @param cantidad Nueva cantidad de combustible en litros.
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Obtiene la densidad del combustible.
	 *
	 * @return densidad en kg/L.
	 */
	public double getDensidad() {
		return densidad;
	}

	/**
	 * Establece la densidad del combustible.
	 *
	 * @param densidad Nueva densidad en kg/L.
	 */
	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}

	/**
	 * Obtiene el peso total del combustible.
	 *
	 * @return peso en kilogramos.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establece el peso total del combustible.
	 *
	 * @param peso Nuevo peso en kilogramos.
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene el precio del combustible.
	 *
	 * @return precio en la unidad monetaria correspondiente.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del combustible.
	 *
	 * @param precio Nuevo precio en la unidad monetaria correspondiente.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene el nombre del transportista responsable del traslado del combustible.
	 *
	 * @return nombre del transportista.
	 */
	public String getNombre_transportista() {
		return nombre_transportista;
	}

	/**
	 * Establece el nombre del transportista responsable del traslado del
	 * combustible.
	 *
	 * @param nombre_transportista Nuevo nombre del transportista.
	 */
	public void setNombre_transportista(String nombre_transportista) {
		this.nombre_transportista = nombre_transportista;
	}

	/**
	 * Obtiene la capacidad máxima del tanque de combustible.
	 *
	 * @return capacidad máxima en litros.
	 */
	public double getCapacidad_combustible() {
		return capacidad_combustible;
	}

	/**
	 * Establece la capacidad máxima del tanque de combustible.
	 *
	 * @param capacidad_combustible Nueva capacidad máxima en litros.
	 */
	public void setCapacidad_combustible(double capacidad_combustible) {
		this.capacidad_combustible = capacidad_combustible;
	}

	/**
	 * Obtiene la cantidad actual de combustible en el tanque.
	 *
	 * @return cantidad actual de combustible en litros.
	 */
	public double getCantidad_combustible() {
		return cantidad_combustible;
	}

	/**
	 * Establece la cantidad actual de combustible en el tanque.
	 *
	 * @param cantidad_combustible Nueva cantidad actual de combustible en litros.
	 */
	public void setCantidad_combustible(double cantidad_combustible) {
		this.cantidad_combustible = cantidad_combustible;
	}

	/**
	 * Retorna una representación en cadena de texto del objeto {@code Combustible},
	 * incluyendo todos sus atributos. Útil para depuración e impresión por consola.
	 *
	 * @return String con todos los atributos del combustible en formato legible.
	 */
	@Override
	public String toString() {
		return "Combustible{" + "tipo_combustible='" + tipo_combustible + '\'' + ", marca='" + marca + '\''
				+ ", fecha_obtencion='" + fecha_obtencion + '\'' + ", lugar_extraccion='" + lugar_extraccion + '\''
				+ "  cantidad=" + cantidad + ", densidad=" + densidad + ", peso=" + peso + ", precio=" + precio
				+ ", nombre_transportista='" + nombre_transportista + '\'' + ", capacidad_combustible="
				+ capacidad_combustible + ", cantidad_combustible=" + cantidad_combustible + '}';
	}
}