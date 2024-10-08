package FileWriter_Y_FileReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterAPPENDyTOCHARARRAY {
	public static void main(String[] args) throws IOException {
		try {
	       File fichero = new File ("src\\FicheroLeer.txt");
	       
	       FileWriter fic = new FileWriter(fichero);
	       String cadena = "Esto es una prueba con FileWriter. Gang";
	       
	       char[] cad = cadena.toCharArray();
	       for (int i=0; i<cad.length; i++) {
	    	   fic.write(cad[i]);
	    	   fic.append("*");
	       }
	       fic.close();
	} catch (EOFException e) {
		System.out.println("Llegaste hasta el final del documento");
	} catch (Exception e) {
		System.out.println("Error");
	}
	}
}
