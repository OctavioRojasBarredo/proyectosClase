package hospitales;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Hospital {

	public static void main(String[] args) throws IOException {
		try {
			File fichero = new File("hospitales.dat");

			RandomAccessFile file = new RandomAccessFile(fichero, "rw");

			// CARACTERES * 2 = BYTES

			int[] código = { 210, 315, 250 }; // 4 CARACTERES
			String[] nombre = { "Gregorio Marañón", "HM Hospital Universitario", "12 de Octubre" }; // 25 CARACTERES (23
																									// EN
																									// REALIDAD)
			String[] dirección = { "C. Dr. Esquerdo, 46", "Pl. del Conde del Valle de Súchil, 16,",
					"Av. de Córdoba, s/n" }; // 30
												// CARACTERES
												// //
												// REALIDAD)
			int[] cantidadCamas = { 1671, 1312, 1296 }; // 4 CARACTERES
			Double[] presupuesto = { 2252257.54, 3253254.78, 52542547.87 }; // 8 CARACTERES

			StringBuffer bufferN = new StringBuffer();
			StringBuffer bufferD = new StringBuffer();


			for (int i = 0; i < nombre.length; i++) {
				bufferN = new StringBuffer(nombre[i]);
				bufferN.setLength(25);
				bufferD = new StringBuffer(dirección[i]);
				bufferD.setLength(30);
				file.writeInt(código[i]);
				file.writeChars(bufferN.toString());
				file.writeChars(bufferD.toString());
				file.writeInt(cantidadCamas[i]);
				file.writeDouble(presupuesto[i]);
			}
			file.close();
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		
		escribirFichero();
	}

	public static void escribirFichero() throws IOException {
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter("hospitales.txt"));
			File fichero = new File("hospitales.dat");
			RandomAccessFile file = new RandomAccessFile(fichero, "r");
			

			int cod, camas;
			char[] nom = new char[25];
			char auxN; 
			char[] dir = new char[30];
			char auxD; 
			Double pres;
			int pos = 0;

			for (;;) {
				file.seek(pos);
				cod = file.readInt();
				
				for (int i=0; i<nom.length; i++) {
					auxN = file.readChar();
					nom[i] = auxN;
				}
				
				for (int i=0; i<dir.length; i++) {
					auxD = file.readChar();
					dir[i] = auxD;
				}
				
				camas = file.readInt(); 
				pres = file.readDouble(); 
				String nombresString = new String(nom);
				String dirString = new String(dir);
				
				String linea = "Código: " + cod + " Nombre: " + nombresString + " Dirección: " + dirString + " Camas: " + camas + " Presupuesto: " + pres;
				
				escritor.write(linea);
				escritor.newLine();
				
				System.out.println(linea);
				
				pos = pos+146;
				
				if (file.getFilePointer() == file.length()) {
					break;
				}
			}
			escritor.close();
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		}
	}
}
