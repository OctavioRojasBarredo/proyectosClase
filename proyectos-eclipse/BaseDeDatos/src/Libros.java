<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

public class Libros implements Serializable {
	ArrayList<infoLibros> libros = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		try {
=======
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Libros implements Serializable{
	ArrayList<infoLibros> libros = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
		File f = new File("Peliculas.dat");
		f.createNewFile();
		
		
		ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream(f));
		
		String[] titulos = {"El libro de la selva", "Lo que el viento se llevó", "Tiempos modernos"};
		String [] fecha = {"1-1-2024", "1-1-2016", "1-1-1936"};
		double[] precio = {6.80, 7.20, 9.80};
		int[] duracion = {135, 135, 87};
		
		for (int i=0; i<titulos.length; i++) {
<<<<<<< HEAD
			infoLibros libro = new infoLibros(titulos[i], fecha[i], precio[i], duracion[i]);
			System.out.printf("Titulos: %s, Fecha: %s, Precio: %.2f, Duracion: %d \n", titulos[i], fecha[i], precio[i], duracion[i]);
			dataOS.writeObject(libro);
		}
		dataOS.close();
		} catch (IndexOutOfBoundsException e) {
			System.out.println();
	}
=======
			if (i == 0) {
				System.out.println("Titulo |-----| Fecha |-----| Precio |-----| Duración");
				dataOS.writeUTF("Titulo |-----| Fecha |-----| Precio |-----| Duración");
			}
			infoLibros libro = new infoLibros(titulos[i], fecha[i], precio[i], duracion[i]);
			System.out.println(libro);
			dataOS.writeObject(libro);
		}
		dataOS.close();
		
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
	}
}
