//package ejercicio;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class lecturaPB2 {
	public static void main(String[] args) {

		ProcessBuilder pb=new ProcessBuilder("java", "lecturaPB.java");
		String linea2="";
		
		pb.redirectErrorStream(true);
		
		try {
			Process p = pb.start();			
			OutputStream o = p.getOutputStream();
			o.write("Hola clase \n".getBytes());
			o.flush();
			
			InputStream salidaComando = p.getInputStream();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(salidaComando));
			
			linea2 = buffer.readLine();
			while (linea2 != null) {
				System.out.println(linea2);
				linea2 = buffer.readLine();
			}
			
			int revisoError = p.waitFor();
			System.out.println("Error igual a : "+revisoError);
			
			o.close();
			buffer.close();
			
		} catch (Exception e) {
			System.out.println("Error en ");
			e.printStackTrace();
		}
	}
}
