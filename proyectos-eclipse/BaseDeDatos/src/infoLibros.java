import java.io.Serializable;

public class infoLibros implements Serializable{
	String titulo;
	String fecha;
	double precio;
	int duracion;
	
	public infoLibros(String titulo, String fecha, double precio, int duracion) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.precio = precio;
		this.duracion = duracion;
	}
	

}
