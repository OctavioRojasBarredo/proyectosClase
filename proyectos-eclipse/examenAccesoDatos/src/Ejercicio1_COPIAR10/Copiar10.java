package Ejercicio1_COPIAR10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Copiar10 {
	public static void main(String[] args) throws IOException {
		try {
		File archivoCopiar = new File("src\\Ejercicio1_COPIAR10\\Mifichero.txt");
		File archivoPegar = new File("src\\Ejercicio1_COPIAR10\\copiarMifichero.txt");
		archivoPegar.createNewFile();
		
		BufferedReader lector = new BufferedReader(new FileReader(archivoCopiar));
		PrintWriter escritor = new PrintWriter(archivoPegar);
		
		int numLinea = 0;
		String linea = "";
		
		while ((linea = lector.readLine()) != null) {
			char[] caracteres = linea.toCharArray();
			if (numLinea < 10) {
				for (char caracter : caracteres) {
					// Convierto el caracter a String para poder hacer el match
					String caracterString = caracter+"";
					// Compruebo todas las variantes de las A
					if (caracterString.matches("a")) {
						caracterString = "o";
					} else if(caracterString.matches("A")) {
						caracterString = "O";
					} else if (caracterString.matches("Á")) {
						caracterString = "Ó";
					} else if (caracterString.matches("á")) {
						caracterString = "á";
					// Ahora compruebo todas las variantes de las O
					} else if (caracterString.matches("o")) {
						caracterString = "a";
					} else if (caracterString.matches("ó")) {
						caracterString = "á";
					} else if (caracterString.matches("O")) {
						caracterString = "A";
					} else if (caracterString.matches("Ó")) {
						caracterString = "Á";
					}
					
					escritor.print(caracterString);
				}
				if (!linea.isBlank()) {
				numLinea++;
				escritor.print("\n");
				} else {
					escritor.print("\n");
				}

			} else if (numLinea >= 10 && numLinea <= 21) {
				for (char caracter : caracteres) {
					escritor.print(caracter);
				}
				numLinea++;
				if (!linea.isBlank()) {
					escritor.print("&");
				}
				escritor.print("\n");
			} else if (numLinea > 21 && numLinea <= 26) {
				int contador = 0;
				for (char caracter : caracteres) {
					String caracterString = caracter+"";
					if (!caracterString.isBlank()) {
						contador++;
						if (contador == 4) {
							contador = 0;
							escritor.print(caracter);
							escritor.print("$");
						} else {
							escritor.print(caracter);
						}
					} else {
						escritor.print(caracter);
					}
					
				}
				if (!linea.isBlank()) {
				numLinea++;
				}
				escritor.print("\n");
			} else if (numLinea > 26) {
				escritor.print(linea+"\n");
			}
			

		}
		// IMPORTANTE: CIERRA EL ESCRITOR **FUERA DEL BUCLE**
		escritor.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo");
		} catch ()
	}
}
