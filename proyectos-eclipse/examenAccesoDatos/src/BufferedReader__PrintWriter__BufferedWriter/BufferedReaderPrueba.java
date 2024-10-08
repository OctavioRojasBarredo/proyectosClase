package BufferedReader__PrintWriter__BufferedWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPrueba {
	public static void main(String[] args) throws IOException{
		try {
			BufferedReader fichero = new BufferedReader(new FileReader("src\\FicheroLeer.txt"));
			String linea = "";
			while ((linea = fichero.readLine()) != null) {
				System.out.println(linea);
			}
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		}
	}
}
