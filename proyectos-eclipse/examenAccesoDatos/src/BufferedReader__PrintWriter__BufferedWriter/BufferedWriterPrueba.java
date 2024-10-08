package BufferedReader__PrintWriter__BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterPrueba { 
	public static void main(String[] args) throws IOException {
		try {
			BufferedWriter fichero = new BufferedWriter(new FileWriter("src\\FicheroLeer.txt"));
			for (int i=0; i<11; i++) {
				fichero.write("Fila numero: "+i);
				fichero.newLine();
			}
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		}
	}
}
