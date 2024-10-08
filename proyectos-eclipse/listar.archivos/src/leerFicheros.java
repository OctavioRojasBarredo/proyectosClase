

import java.io.*;

public class leerFicheros {
<<<<<<< HEAD
	public static void main(String[] args) throws IOException {
	try {
=======
	public leerFicheros() throws IOException {
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
	File f = new File("archivos\\ejercicioListar.txt");
	FileReader lector = new FileReader(f);
	int i;
	while ((i = lector.read()) != -1 ) {
		System.out.println((char) i);
	}
	lector.close();
<<<<<<< HEAD
	} catch (FileNotFoundException e) {
		System.out.println("No se encontró el archivo especificado");
	}
=======
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
	}
}
