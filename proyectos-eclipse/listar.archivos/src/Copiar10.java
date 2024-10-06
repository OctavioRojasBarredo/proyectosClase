import java.io.*;

public class Copiar10 {
	public static void main(String[] args) throws IOException {
		String dir = args[0];
		File f = new File("./Mifichero.txt"+dir);
		File nuevoArchivo = new File("./"+dir);
		nuevoArchivo.createNewFile();
		
		try {
		FileReader lector1 = new FileReader(f);
		BufferedReader lector2 = new BufferedReader(lector1);
		FileWriter escritor = new FileWriter(f);
		int i = 0;
		String linea;
		int lineasLeidas = 0;
		while ((linea = lector2.readLine()) != null) {
			lineasLeidas++;
			if (lineasLeidas <= 10) {
				char[] caracteres = linea.toCharArray();
				while (lector1.read(caracteres, 0, linea.length()) != -1) {
					for (char letra : caracteres) {
						String letraString = letra + "";
						letraString = letraString.trim();
						letraString = letraString.toLowerCase();
						if (letraString.contains("o")) {
							letraString.replace('o', 'a');
						}
						else {
							escritor.write(letra);
						}
					}
					
				}
			}
			}
		}catch(

	IOException ioe)
	{

	}

}}
