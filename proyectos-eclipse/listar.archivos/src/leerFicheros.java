

import java.io.*;

public class leerFicheros {
	public static void main(String[] args) throws IOException {
	try {
	File f = new File("archivos\\ejercicioListar.txt");
	FileReader lector = new FileReader(f);
	int i;
	while ((i = lector.read()) != -1 ) {
		System.out.println((char) i);
	}
	lector.close();
	} catch (FileNotFoundException e) {
		System.out.println("No se encontró el archivo especificado");
	}
	}
}
