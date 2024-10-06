package leerEscribirBinarios;

public class cliente {
	private String DNI;
	private String nombre;
	private String apellidos;
	private String metricula;
	private String ciudad;
	

	public cliente(String dNI, String nombre, String apellidos, String metricula, String ciudad) {
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.metricula = metricula;
		this.ciudad = ciudad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getMetricula() {
		return metricula;
	}
	public void setMetricula(String metricula) {
		this.metricula = metricula;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
