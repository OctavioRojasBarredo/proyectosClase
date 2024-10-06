

import java.io.*;

public class ejercicio2ficheros {
	public static void main(String[] args) {
		File directorio = new File("Octavio");
		File archivo1 = new File("ejercicio1.txt");
		File archivo2 = new File(directorio, "ejercicio2.txt");
		File archivo3 = new File(directorio, "ejercicio3.txt");
		directorio.mkdir();

		try {
			if (archivo1.createNewFile()) {
				System.out.printf("Se ha creado el fichero %s correctamente\n", archivo1.getName());
			} else {
				System.out.printf("No se ha podido crear el fichero correctamente\n", archivo1.getName());
			}
			if (archivo2.createNewFile()) {
				System.out.printf("Se ha creado el fichero %s correctamente\n", archivo2.getName());
			} else {
				System.out.printf("No se ha podido crear el fichero correctamente\n", archivo2.getName());
			}
			if (archivo3.createNewFile()) {
				System.out.printf("Se ha creado el fichero %s correctamente\n", archivo3.getName());
			} else {
				System.out.printf("No se ha podido crear el fichero correctamente\n", archivo3.getName());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		for (File archivos : directorio.listFiles()) {
			System.out.println(archivos.getName());
		}

		archivo3.renameTo(new File(directorio, "ejercicio4.txt"));
		System.out.printf("Se ha renombrado el fichero %s correctamente\n", archivo3.getName());

		for (File archivos : directorio.listFiles()) {
			System.out.println(archivos.getName());
		}

		if (directorio.exists()) {
			{
				if (directorio.listFiles().length <= 0) {
					directorio.delete();
				} else {
					if (archivo1.delete()) {
						System.out.printf("Se ha eliminado el archivo %s\n", archivo1.getName());
					}
					if (archivo2.delete()) {
						System.out.printf("Se ha eliminado el archivo %s\n", archivo2.getName());
					}
					if (archivo3.delete()) {
						System.out.printf("Se ha eliminado el archivo %s\n", archivo3.getName());
					}
				}
			}
		} else {
			System.out.printf("No existe el directorio %s", directorio);
		}
		
		for (File archivos : directorio.listFiles()) {
			System.out.println(archivos.getName());
		}
	}
}
