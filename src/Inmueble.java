
public class Inmueble {
	private int id;
	private String fecha_alta;
	private String tipo;
	private String operacion;
	private String provincia;
	private String superficie;
	private String precio;
	private String fecha_venta;
	private String vendedor;
	
	public Inmueble(int id, String fecha_alta, String tipo, String operacion, String provincia, String superficie,
			String precio, String fecha_venta, String vendedor) {
		super();
		this.id = id;
		this.fecha_alta = fecha_alta;
		this.tipo = tipo;
		this.operacion = operacion;
		this.provincia = provincia;
		this.superficie = superficie;
		this.precio = precio;
		this.fecha_venta = fecha_venta;
		this.vendedor = vendedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", fecha_alta=" + fecha_alta + ", tipo=" + tipo + ", operacion=" + operacion
				+ ", provincia=" + provincia + ", superficie=" + superficie + ", precio=" + precio + ", fecha_venta="
				+ fecha_venta + ", vendedor=" + vendedor + "]";
	}
	
	
	
}
