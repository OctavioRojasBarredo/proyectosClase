package ejemploProcesos2;

import java.io.*;

public class SvhostEjercicio2 {
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("tasklist", "/svc", "/fi", "imagename eq svchost.exe");
		Process p = pb.start();
		String linea = "";

		try {
			
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
			System.out.println("Error en: " + p);
			e.printStackTrace();
		}
	}
}
