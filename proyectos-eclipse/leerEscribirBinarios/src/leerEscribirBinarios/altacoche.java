package leerEscribirBinarios;
import java.io.*;
import java.util.ArrayList;

public class altacoche {
	public altacoche() throws IOException{
		ArrayList<cliente> clientes = new ArrayList<>();
		File fichero = new File("coches.dat");
		RandomAccessFile acceso = new RandomAccessFile(fichero, "rw");
		
		cliente cliente1 = new cliente("71457145J", "Juan", "Salas Acebes", "5254HFR", "Sevilla");
		clientes.add(cliente1);
		cliente cliente2 = new cliente("52547854L", "Adela", "Simone Saludes", "8578FGH", "Zaragoza");
		clientes.add(cliente2);
		cliente cliente3 = new cliente("45254578J", "Cristina", "Alcoy Zaldivar", "5652DFR", "Zamora");
		clientes.add(cliente3);
		
		for (cliente persona : clientes) {
			acceso.writeUTF(persona.getDNI());
			acceso.writeUTF(persona.getNombre());
			acceso.writeUTF(persona.getApellidos());
			acceso.writeUTF(persona.getMetricula());
			acceso.writeUTF(persona.getCiudad());
		}
	}
}
