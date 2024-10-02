import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class hospital {
	ArrayList<hospital> hospitales = new ArrayList<>();
	int codigo;
	String nombre;
	String direccion;
	int cantidadCamas;
	String presupuesto;
	
	public hospital(int codigo, String nombre, String direccion, int cantidadCamas, String presupuesto) throws IOException {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantidadCamas = cantidadCamas;
		this.presupuesto = presupuesto;
	}

	public hospital() throws IOException {

		
		int[] codigos = {
				210, 315, 250
		};
		
		String[] nombres= {
				"Gregorio Marañón" , "HM Hospital Universitario", "12 de Octubre"
		};
		
		String[] direcciones= {
				 "C. Dr. Esquerdo, 46", "Pl. del Conde del Valle de Súchil, 16, ", "Av. de Córdoba, s/n"   
		};
		
		int[] cantidadDeCamas = {
				1671, 1312, 1296
		};
		
		String[] presupuestos = {
				"2.252.257,54", " 3.253.254,78", "5.2542.547,87"
		};
		
        for (int i = 0; i < codigos.length; i++) {
            hospital h = new hospital(codigos[i], nombres[i], direcciones[i], cantidadDeCamas[i], presupuestos[i]);
            hospitales.add(h);
        }
        
        leerArchivo();
        copiarArchivo();
	}

	public void leerArchivo() throws IOException {
		File f = new File("FicheroHospital.dat");
		f.createNewFile();

		RandomAccessFile acceso = new RandomAccessFile(f, "rw");
		for (hospital infoHospital : hospitales) {
			acceso.writeInt(infoHospital.getCodigo());
			acceso.writeUTF(infoHospital.getNombre());
			acceso.writeUTF(infoHospital.getDireccion());
			acceso.writeInt(infoHospital.getCantidadCamas());
			acceso.writeUTF(infoHospital.getPresupuesto());
		}
		acceso.close();
	}
	

	public void copiarArchivo() throws IOException {
	    File ficheroBinario = new File("FicheroHospital.dat");
	    File ficheroTexto = new File("hospitales.txt");
	    
	    RandomAccessFile accesoBinario = new RandomAccessFile(ficheroBinario, "r");

	    PrintWriter escritor = new PrintWriter(ficheroTexto);
	    try {
	    while (accesoBinario.getFilePointer() < accesoBinario.length()) {
	        int cod = accesoBinario.readInt();
	        String nom = accesoBinario.readUTF();
	        String dir = accesoBinario.readUTF();
	        int camas = accesoBinario.readInt();
	        String pres = accesoBinario.readUTF();

	        escritor.printf("Código: %d, Nombre: %s, Dirección: %s, Camas: %d, Presupuesto: %s \n", cod, nom, dir, camas, pres);
	    }
	    } catch (EOFException eof) {
	    	accesoBinario.close();
		    escritor.close();
	    }

	    
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadCamas() {
		return cantidadCamas;
	}

	public void setCantidadCamas(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
	}

	public String getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}

	public static void main(String[] args) throws IOException {
		hospital h = new hospital();
	}
}
