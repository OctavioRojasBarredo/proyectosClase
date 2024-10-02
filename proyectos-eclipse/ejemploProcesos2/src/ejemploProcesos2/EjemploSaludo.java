package ejemploProcesos2;

public class EjemploSaludo {
	public static void main(String[] args) {
		if (args != null) {
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
			}
		} else {
		
		System.out.println("No hay argumentos, introdúcelos");
	}
	} 
}
		
