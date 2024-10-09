package Binarios_FileInputStream_FileOutputStream_DataOutputStream_DataInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_FileInputStream_Prueba {
	// EL FILEOUTPUTSTREAM ES COMO EL FILEWRITER
	// EL FILEINPUTSTREAM ES COMO EL FILEREADER
	public static void main(String[] args) throws IOException {
		try {
		File fichero = new File("src\\FicheroBytes.dat");
		
		FileOutputStream escritor = new FileOutputStream(fichero, true); 
		FileInputStream lector = new FileInputStream(fichero);
		
		int i;
		
		for (i=1; i<100; i++) {
			escritor.write(i);
		} 
		escritor.close();
		while ((i=lector.read()) != -1) {
			System.out.println(i);
		}
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		}
	}
}
