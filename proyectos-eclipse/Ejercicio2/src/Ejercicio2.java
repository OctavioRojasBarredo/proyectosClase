import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio2 {
	public static void main(String[] args) throws IOException {
	try {
		File archivo = new File(args[0]);
		archivo.createNewFile();
		
		File archivoSalida = new File("salida.txt");
		archivo.createNewFile();
		
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		PrintWriter escritor = new PrintWriter(archivoSalida);
		
		String linea = "";
		
		while ((linea = lector.readLine()) != null) {
			String palabraAntesEspacio = "";
			char[] caracteres = linea.toCharArray();
			for (char letra : caracteres) {
				String letraString = letra+"";
				if (letraString.isBlank()) {
					if(!palabraAntesEspacio.matches("bajo") || !palabraAntesEspacio.matches("alto") ) {
						escritor.print(palabraAntesEspacio);
						palabraAntesEspacio="";
					}
				}
				palabraAntesEspacio+=letra;
			}
			escritor.println();
			
		}
		lector.close();
		escritor.close();
	} catch (IndexOutOfBoundsException iobe) {
		System.out.println("Escribiste mal el argumento");
	} catch (IOException ioe) {
		System.out.println("Error en la ruta");
	}
}
}
