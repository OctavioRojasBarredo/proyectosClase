<<<<<<< HEAD
import java.io.Serializable;

public class infoLibros implements Serializable{
=======

public class infoLibros {
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
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
