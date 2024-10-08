package BufferedReader__PrintWriter__BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterPrueba {
	public static void main(String[] args) throws IOException {
		PrintWriter fichero = new PrintWriter(new FileWriter("src\\FicheroLeer.txt"));
		for (int i=0; i<11; i++) {
			fichero.println("Fila numeroo: " + i);
		}
		fichero.close();
	}
}
