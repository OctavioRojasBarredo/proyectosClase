
import java.io.*;

public class listarArchivos {
	public static void main (String[] args) {
		String dir = ".//bin";
		File f = new File(dir);
		File[] archivos = f.listFiles();
		int cantidadArchivos = 0;
		
		for(int i = 0; i < archivos.length; i++) {
			cantidadArchivos++;
			}
		System.out.printf("En el directorio bin hay %d ficheros", cantidadArchivos);
		}
	
	}
