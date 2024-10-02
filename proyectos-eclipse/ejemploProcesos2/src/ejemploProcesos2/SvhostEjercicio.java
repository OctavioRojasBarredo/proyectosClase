package ejemploProcesos2;

import java.io.*;

public class SvhostEjercicio {
	public static void main(String[] args) throws IOException{
		Runtime r = Runtime.getRuntime();
		String comando = "tasklist /svc /fi \"imagename eq svchost.exe\"", linea = "";
		Process p;

		try {
			p = r.exec(comando);
			
			InputStream salidaComando = p.getInputStream();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(salidaComando));
			
			File f = new File("src\\SVCHOST.TXT");
			f.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(f);
			PrintWriter pw = new PrintWriter(fos);
			
			linea = buffer.readLine();
			while (linea != null) {
				pw.println(linea);
				linea = buffer.readLine();
			}
			
			pw.close();
			buffer.close();

		} catch (Exception e) {
			System.out.println("Error en: " + comando);
			e.printStackTrace();
		}
	}
}
