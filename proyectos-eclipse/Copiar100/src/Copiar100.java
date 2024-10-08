import java.io.*;

public class Copiar100 {
	public static void main(String[] args) throws IOException {
		try {
		File archivoCopiar = new File(args[0]+"Mifichero.txt");
		File archivoPegar = new File(args[0]+"copiarMifichero.txt");
		archivoPegar.createNewFile();

		BufferedReader lector = new BufferedReader(new FileReader(archivoCopiar));
		BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoPegar));

		String linea = "";
		int contador = 0;

		while ((linea = lector.readLine()) != null) {
			if (!linea.isBlank()) {
				contador++;
			}
			if (contador >= 0 && contador <= 10) {
				char[] caracteres = linea.toCharArray();
				for (char letra : caracteres) {
					if (letra == 'a') {
						letra = 'o';
					} else if (letra == 'o') {
						letra = 'a';
					} else if (letra == 'á') {
						letra = 'ó';
					} else if (letra == 'Á') {
						letra = 'Ó';
					} else if (letra == 'A') {
						letra = 'O';
					} else if (letra == 'O') {
						letra = 'A';
					} else if (letra == 'Ó') {
						letra = 'Á';
					}

					String letraString = letra + "";

					escritor.write(letraString);
				}
			}
			if (contador > 10 && contador <= 20) {
				if (!linea.isBlank()) {
					linea += "&";
				}
				escritor.write(linea);
			}
			if (contador > 20 && contador <= 25) {
				int contadorCaracteres = 0;
				char[] caracteres = linea.toCharArray();
				for (char letra : caracteres) {
					if (contadorCaracteres > 3) {
						contadorCaracteres = 0;
					}
 					if (contadorCaracteres < 3 && !Character.isWhitespace(letra)) {
						contadorCaracteres++;
						String letraString = letra + "";
						escritor.write(letraString);
					} else if (contadorCaracteres < 3 && Character.isWhitespace(letra)) {
						String letraString = letra + "";
						escritor.write(letraString);
					} else {
						contadorCaracteres++;
						String letraString = letra + "";
						escritor.write(letraString);
						escritor.write("$");
					}
				}
			}
			escritor.newLine();
		}
		
		lector.close();
		escritor.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encontró");
		} catch (IOException ioe) {
			System.out.println("Has introducido incorrectamente la ruta");
		} catch (ArrayIndexOutOfBoundsException aio){
			System.out.println("El array está vacío");
		}
	}
}
