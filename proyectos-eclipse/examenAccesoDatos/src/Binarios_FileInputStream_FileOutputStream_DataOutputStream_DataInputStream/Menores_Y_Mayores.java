package Binarios_FileInputStream_FileOutputStream_DataOutputStream_DataInputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Menores_Y_Mayores {
	public static void main(String[] args) throws IOException{
		try {
		String[] nombres = {"Bea", "Manuel", "Alfonso", "Julio", "Ana", "Marta", "Abel"};
		int[] edades = {19,16,12,16,14,18};
		
		ArrayList<String>  nombresOrdenados = new ArrayList<>();
		ArrayList<Integer>  edadesOrdenadas = new ArrayList<>();
		
		File archivoMenores = new File("src\\menores.dat");
		File archivoMayores = new File("src\\mayores.dat");
		archivoMenores.createNewFile();
		archivoMayores.createNewFile();
		
		FileOutputStream fileoutMenores = new FileOutputStream(archivoMenores);
		FileOutputStream fileoutMayores = new FileOutputStream(archivoMayores);

		DataOutputStream dataOSMe = new DataOutputStream(fileoutMenores);
		DataOutputStream dataOSMa = new DataOutputStream(fileoutMayores);
		
		
		// INTENTO DE HACER UN FILTRO
		int valorMax = 0;
		for (String nombre : nombres) {
			char nom = nombre.charAt(0);
			int valor = Character.valueOf(nom);
			String nombreMayor = "";
			
			if (valor < valorMax) {
				valorMax = valor;
				nombreMayor = nombre;
				nombresOrdenados.add(nombre);
			} else if (valor == valorMax) {
				char nombreAnterior = nombreMayor.charAt(1);
				char nombreNuevo = nombre.charAt(1);
				
				if (Character.valueOf(nombreNuevo) < Character.valueOf(nombreAnterior)) {
					nombresOrdenados.add(nombre);
				}
			}
		}
		
		// ESCRIBIR EN EL .DAT LA INFO
		for (int i=0; i<nombres.length; i++) {
			
			if (edades[i] < 18) {
				dataOSMe.writeUTF(nombres[i]);
				dataOSMe.writeInt(edades[i]);
				System.out.println("Menor: " + nombres[i] + ", Edad: " + edades[i]);
			} else {
				dataOSMa.writeUTF(nombres[i]);
				dataOSMa.writeInt(edades[i]);
				System.out.println("Mayor: " + nombres[i] + ", Edad: " + edades[i]);
			}
		}
		} catch (EOFException e) {
			System.out.println("Llegaste al final del fichero");
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo");
		}
	}
}
