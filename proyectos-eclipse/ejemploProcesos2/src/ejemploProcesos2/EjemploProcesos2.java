package ejemploProcesos2;
import java.io.*;

public class EjemploProcesos2 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "cmd /c dir", linea="";
		Process p = null;
		
		try {
			p= r.exec(comando);
			
			InputStream salidaComando = p.getInputStream();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(salidaComando));
			linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			buffer.close();
		} catch (Exception e){
			System.out.println("Error en: " + comando);
			e.printStackTrace();
		}
	}
}
