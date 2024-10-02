import java.io.*;

public class Copiar1000 { 
	public static void main(String[] args) throws IOException {
		File archivo = new File(args[0]+"Mifichero.txt");
		File archivoCopiar = new File(args[0]+"copiaMifichero.txt");
		archivoCopiar.createNewFile();
		
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCopiar));
	}
}
