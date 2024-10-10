package Serializable_ObjectInputStream_ObjectOutputStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFilePrueba {
	/*
	 * SHORT --> 2 BYTES BYTE --> 1 BYTE LONG --> 8 BYTES BOOLEAN --> 1 BIT FLOAT
	 * --> 4 BYTES STRING --> 2 BYTES / CARÁCTER INT --> 4 BYTES DOUBLE --> 8 BYTES
	 */

	// ESCRIBIR EN UN FICHERO RANDOMACCESSFILE
	public static void main(String[] args) throws IOException {
		File fichero = new File("Aleatorio.dat");
		fichero.createNewFile();

		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		String[] apellido = { "Gil", "Ramos", "God" };
		int dep[] = { 12, 22, 543, 87 };
		Double[] salario = { 13254.23, 3252344.56, 236543.23, 32523.1 };

		StringBuffer buffer = null; // buffer para almacenar apellido
		int n = apellido.length; // numero de elementos del array

		for (int i = 0; i < n; i++) {
			file.write(i + 1); // i+1 para identificar al empleado
			buffer = new StringBuffer(apellido[i]);
			buffer.setLength(10); // caracteres para el apellido
			file.writeChars(buffer.toString());
			file.writeInt(dep[i]);
			file.writeDouble(salario[i]);
		}
		file.close();

		// LEER

		int id, depart, posicion;
		Double sal;
		char[] apell = new char[10];
		char aux;
		int pos = 0;

		for (;;) {
			file.seek(pos); // inicio del fichero
			id = file.readInt(); // obtener id empleado
			for (int i = 0; i < apellido.length; i++) {
				aux = file.readChar();
				apell[i] = aux;
			}

			String apellidos = new String(apell);
			depart = file.readInt();
			sal = file.readDouble();
			if (id > 0) {
				System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f", id, apellidos.trim(), depart,
						sal);
			}
			pos = pos + 36;
			if (file.getFilePointer() == file.length()) {
				break;
			}

		}
		file.close();
	}

}
