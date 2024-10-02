import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio2 {
	public static void main(String[] args) throws IOException {
	try {
		File archivo = new File(args[0]);
		archivo.createNewFile();
		
		File dir = new File("Ejercicio2");
		dir.mkdir();
		
		File archivoSalida = new File(dir, "salida.txt");
		archivo.createNewFile();
		
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		PrintWriter escritor = new PrintWriter(new FileWriter (archivoSalida, true));
		
		String linea = "";
		
		while ((linea = lector.readLine()) != null) {
			String palabraAntesEspacio = "";
			char[] caracteres = linea.toCharArray();
			for (char letra : caracteres) {
				String letraString = letra+"";
				if (letraString.isBlank()) {
					String palabraAntesEspacioSinEspacios = palabraAntesEspacio.trim();
					if(!palabraAntesEspacioSinEspacios.matches("bajo") && !palabraAntesEspacioSinEspacios.matches("alto") ) {
						escritor.print(palabraAntesEspacio);
						palabraAntesEspacio="";
					} else {
						palabraAntesEspacio = "";
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
