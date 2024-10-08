package FileWriter_Y_FileReader;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReaderInputUsuario {
	public static void main(String[] args) {
	String input = "";
	Scanner escaner = new Scanner(System.in);
	System.out.println("Introduce el archivo que quieres leer: ");
	if (escaner.hasNextLine()) {
		input = escaner.nextLine();
	}else {
		System.out.println("No has introducido una cadena de caracteres");
	}
	try {
	File f = new File(input);
	
	/* El file reader se utiliza para leer archivos pequeños en los que 
	 * no te importa demasiado el rendimiento
	*/
	
	FileReader lector = new FileReader(f);
	int i = 0;

	
	while ((i = lector.read()) != -1) {
		System.out.print((char) i);
	}
	lector.close();
	
	} catch (IndexOutOfBoundsException e) {
		System.out.println("No has introducido un argumento");
	} catch (IOException e) {
		System.out.println("No se pudo encontrar el fichero");
	}
	
	}
	
}
