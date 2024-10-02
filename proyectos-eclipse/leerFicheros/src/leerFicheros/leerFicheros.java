package leerFicheros;

import java.io.*;

public class leerFicheros {
	public leerFicheros() throws IOException {
	File f = new File("archivos\\ejercicioListar.txt");
	FileReader lector = new FileReader(f);
	int i;
	while ((i = lector.read()) != -1 ) {
		System.out.println((char) i);
	}
	lector.close();
	}
}