package concatenar;

public class Terminal {
	Vocal vcl;

	public Terminal(Vocal vcl) {
		this.vcl = vcl;

	}

	public Vocal getVcl() {
		return vcl;
	}

	public void setVcl(Vocal vcl) {
		this.vcl = vcl;
	}

	public void generarMenu() {
		System.out.println("Selecciona una opción:");
		System.out.println("1. Agregar *");
		System.out.println("2. Agregar $");
		System.out.println("3. Agregar #");
		System.out.println("0. Finalizar app");
	}

	public void generarUno() {
		
	}

	public void generarDos() {

	}

	public void generarTres() {

	}

	public void cerrarApp() {

	}
}
