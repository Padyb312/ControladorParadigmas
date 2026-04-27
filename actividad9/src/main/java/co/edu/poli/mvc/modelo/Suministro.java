package co.edu.poli.mvc.modelo;

/**
 * Representa un recurso o material de abastecimiento (Suministro) para las
 * misiones. Esta clase gestiona la trazabilidad logística, incluyendo
 * información de origen, fechas de caducidad, condiciones de almacenamiento y
 * dimensiones físicas. * @author Juan Jose Padilla Vargas
 * 
 * @version 1.0
 */
public class Suministro {

	/** Categoría del suministro (ej: Alimento, Medicina, Repuesto) */
	private String tipo;

	/** Identificador único del envío o remisión */
	private String numero_entrega;

	/** Código de identificación de la tanda de producción */
	private String numero_lote;

	/** Fecha en la que fue producido el suministro */
	private String fecha_fabricacion;

	/** Fecha límite para el uso seguro del suministro */
	private String fecha_caducidad;

	/** Fecha en la que el suministro ingresó al inventario */
	private String fecha_recibimiento;

	/** Empresa o entidad que provee el recurso */
	private String proveedor;

	/** Lugar de fabricación o procedencia del suministro */
	private String origen;

	/** Indica si el recurso requiere cadena de frío para su conservación */
	private boolean se_refrigera;

	/** Masa del suministro en kilogramos */
	private double peso;

	/** Medida transversal del empaque */
	private double ancho;

	/** Medida vertical del empaque */
	private double altura;

	/** Valor económico unitario del suministro */
	private double precio;

	/**
	 * Constructor sobrecargado para inicializar un objeto Suministro con su
	 * trazabilidad completa. * @param tipo Categoría del recurso.
	 * 
	 * @param numero_entrega     ID de entrega.
	 * @param numero_lote        ID de lote.
	 * @param fecha_fabricacion  Fecha de producción.
	 * @param fecha_caducidad    Fecha de vencimiento.
	 * @param fecha_recibimiento Fecha de ingreso.
	 * @param proveedor          Nombre del proveedor.
	 * @param origen             País o planta de origen.
	 * @param se_refrigera       Necesidad de refrigeración.
	 * @param peso               Masa total.
	 * @param ancho              Ancho físico.
	 * @param altura             Altura física.
	 * @param precio             Costo del suministro.
	 */
	public Suministro(String tipo, String numero_entrega, String numero_lote, String fecha_fabricacion,
			String fecha_caducidad, String fecha_recibimiento, String proveedor, String origen, boolean se_refrigera,
			double peso, double ancho, double altura, double precio) {
		this.tipo = tipo;
		this.numero_entrega = numero_entrega;
		this.numero_lote = numero_lote;
		this.fecha_fabricacion = fecha_fabricacion;
		this.fecha_caducidad = fecha_caducidad;
		this.fecha_recibimiento = fecha_recibimiento;
		this.proveedor = proveedor;
		this.origen = origen;
		this.se_refrigera = se_refrigera;
		this.peso = peso;
		this.ancho = ancho;
		this.altura = altura;
		this.precio = precio;
	}

	/** @return El tipo de suministro */
	public String getTipo() {
		return tipo;
	}

	/** @param tipo Define el tipo de suministro */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/** @return El número de entrega */
	public String getNumero_entrega() {
		return numero_entrega;
	}

	/** @param numero_entrega Define el número de entrega */
	public void setNumero_entrega(String numero_entrega) {
		this.numero_entrega = numero_entrega;
	}

	/** @return El número de lote */
	public String getNumero_lote() {
		return numero_lote;
	}

	/** @param numero_lote Define el número de lote */
	public void setNumero_lote(String numero_lote) {
		this.numero_lote = numero_lote;
	}

	/** @return La fecha de fabricación */
	public String getFecha_fabricacion() {
		return fecha_fabricacion;
	}

	/** @param fecha_fabricacion Define la fecha de fabricación */
	public void setFecha_fabricacion(String fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}

	/** @return La fecha de caducidad */
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	/** @param fecha_caducidad Define la fecha de caducidad */
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	/** @return La fecha de recibimiento */
	public String getFecha_recibimiento() {
		return fecha_recibimiento;
	}

	/** @param fecha_recibimiento Define la fecha de recibimiento */
	public void setFecha_recibimiento(String fecha_recibimiento) {
		this.fecha_recibimiento = fecha_recibimiento;
	}

	/** @return El nombre del proveedor */
	public String getProveedor() {
		return proveedor;
	}

	/** @param proveedor Define el proveedor */
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	/** @return El origen del suministro */
	public String getOrigen() {
		return origen;
	}

	/** @param origen Define el origen */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/** @return true si requiere refrigeración */
	public boolean isSe_refrigera() {
		return se_refrigera;
	}

	/** @param se_refrigera Define si requiere refrigeración */
	public void setSe_refrigera(boolean se_refrigera) {
		this.se_refrigera = se_refrigera;
	}

	/** @return El peso del suministro */
	public double getPeso() {
		return peso;
	}

	/** @param peso Define el peso */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/** @return El ancho del suministro */
	public double getAncho() {
		return ancho;
	}

	/** @param ancho Define el ancho */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/** @return La altura del suministro */
	public double getAltura() {
		return altura;
	}

	/** @param altura Define la altura */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/** @return El precio del suministro */
	public double getPrecio() {
		return precio;
	}

	/** @param precio Define el precio */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Retorna una representación en texto del suministro.
	 * 
	 * @return Cadena con los detalles del objeto Suministro.
	 */
	@Override
	public String toString() {
		return "Suministro{" + "tipo='" + tipo + '\'' + ", numero_entrega='" + numero_entrega + '\'' + ", numero_lote='"
				+ numero_lote + '\'' + ", fecha_fabricacion='" + fecha_fabricacion + '\'' + ", fecha_caducidad='"
				+ fecha_caducidad + '\'' + ", fecha_recibimiento='" + fecha_recibimiento + '\'' + ", proveedor='"
				+ proveedor + '\'' + ", origen='" + origen + '\'' + ", se_refrigera=" + se_refrigera + ", peso=" + peso
				+ ", ancho=" + ancho + ", altura=" + altura + ", precio=" + precio + '}';
	}
}