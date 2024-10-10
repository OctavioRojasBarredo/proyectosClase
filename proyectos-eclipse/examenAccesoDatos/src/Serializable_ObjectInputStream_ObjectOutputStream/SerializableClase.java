package Serializable_ObjectInputStream_ObjectOutputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableClase {
	public static void main(String[] args) throws ClassNotFoundException {
		// ESCRIBIR EL FICHERO
		try {
			Persona persona;

			File fichero = new File("FicheroPersona.dat");
			FileOutputStream fileout = new FileOutputStream(fichero);
			ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

			String[] nombres = { "Ana", "Luis Miguel", "Guille" };
			int[] edades = { 12, 14, 18 };

			for (int i = 0; i < nombres.length; i++) {
				persona = new Persona(nombres[i], edades[i]);
				dataOS.writeObject(persona);
			}
			dataOS.close();
			fileout.close();

			// LEER FICHERO

			FileInputStream filein = new FileInputStream(fichero);
			ObjectInputStream dataIS = new ObjectInputStream(filein);

			try {
				while (true) {
					persona = (Persona) dataIS.readObject();
					System.out.printf("Nombre: %s, Edad: %d %n", persona.getNombre(), persona.getEdad());
				}
			} catch (EOFException e) {
				System.out.println("Fin de lectura");
			}
			dataIS.close();
			filein.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}

	}

}
