
public class Aparcamiento {
	private String Distrito;
	private String Barrio;
	private String tipo;
	private String n_plazas;
	private String longuitud;
	private String latitud;
	private String direccion;
	
	public Aparcamiento(String distrito, String barrio, String tipo, String n_plazas, String longuitud, String latitud,
			String direccion) {
		super();
		Distrito = distrito;
		Barrio = barrio;
		this.tipo = tipo;
		this.n_plazas = n_plazas;
		this.longuitud = longuitud;
		this.latitud = latitud;
		this.direccion = direccion;
	}

	public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		Distrito = distrito;
	}

	public String getBarrio() {
		return Barrio;
	}

	public void setBarrio(String barrio) {
		Barrio = barrio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getN_plazas() {
		return n_plazas;
	}

	public void setN_plazas(String n_plazas) {
		this.n_plazas = n_plazas;
	}

	public String getLonguitud() {
		return longuitud;
	}

	public void setLonguitud(String longuitud) {
		this.longuitud = longuitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Aparcamiento [Distrito=" + Distrito + ", Barrio=" + Barrio + ", tipo=" + tipo + ", n_plazas=" + n_plazas
				+ ", longuitud=" + longuitud + ", latitud=" + latitud + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
}
