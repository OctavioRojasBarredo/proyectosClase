package Binarios_FileInputStream_FileOutputStream_DataOutputStream_DataInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_DataInputStream_Prueba {
	/*
	 * ESTOS SON COMO EL FILEOUTPUTSTREAM/INPUT PERO MEJORES EL DATAOUTPUT/INPUT
	 * NECESITA UN FILEOUTPUT/INPUT (ES UNA EXTENSIÓN)
	 */

	public static void main(String[] args) throws IOException {
		try {
			// ESCRIBIR EN UN FICHERO BINARIO
			File fichero = new File("src\\FicheroBytes.dat");

			FileOutputStream fileout = new FileOutputStream(fichero);
			DataOutputStream dataOS = new DataOutputStream(fileout);

			String nombres[] = { "Manolo", "Skibidi", "Nerwi", "Gang" };
			int edades[] = { 14, 15, 13, 15 };

			for (int i = 0; i < edades.length; i++) {
				dataOS.writeUTF(nombres[i]);
				dataOS.writeInt(edades[i]);
			}
			// CIERRO LOS FLUJOS
			fileout.close();
			dataOS.close();

			// LEER UN FICHERO BINARIO
			FileInputStream filein = new FileInputStream(fichero);
			DataInputStream dataIS = new DataInputStream(filein);

			try {
				// DECLARO LAS VARIABLES EN LAS QUE VOY A VOLCAR LA INFO
				String name;
				int age;
				
				// BUCLE PARA ASIGNAR
				while (true) {
					name = dataIS.readUTF();
					age = dataIS.readInt();
					// PRINTEO LA INFO
					System.out.printf("Nombre: %s, Edad: %d %n", name, age);
				}
				// UTILIZO LA EXCEPCIÓN COMO MÉTODO DE PARAR EL BUCLE INFINITO
			} catch (EOFException e) {
				System.out.println("Llegaste al final del archivo");
			}
			// CIERRO LOS FLUJOS
			filein.close();
			dataIS.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el fichero");
		}

	}

}
