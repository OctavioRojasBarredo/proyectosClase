//package ejercicio;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class lecturaPB {
	public static void main(String[] args) {
		BufferedReader buffer=null;
		String linea = "";
		
		InputStreamReader input = new InputStreamReader(System.in);
		
		try {
			buffer = new BufferedReader(input);
			System.out.println("Introduce una cadena de texto: ");
			linea=buffer.readLine();
			System.out.println("La línea es: "+linea);
			buffer.close();
			
		} catch (Exception e) {
			System.out.println("Error en: " );
			e.printStackTrace();
		}
}

}