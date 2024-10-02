package pruebaProcesos;

public class pruebaProcesos {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "notepad";
		// String comando = "mspaint";
		// String comando = "mspaint2"; //Dará error
		Process p;
		
		try {
			p = r.exec(comando);
		} catch (Exception e){
			System.out.println("Error en " + comando);
			e.printStackTrace();
		}
	}
}
