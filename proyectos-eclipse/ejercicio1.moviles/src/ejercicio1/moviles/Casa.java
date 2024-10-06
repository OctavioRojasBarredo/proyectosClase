package ejercicio1.moviles;

public class Casa {
	private int metros;
	private float precio;
	int planta;
	boolean ascensor;
	boolean garaje;
	int identificador;
	private static int contador = 0;
	
	public Casa(int metros, float precio, int planta, boolean ascensor, boolean garaje, int identificador) {
		this.metros = metros;
		this.precio = precio;
		this.planta = planta;
		this.ascensor = ascensor;
		this.garaje = garaje;
		contador++;
		this.identificador = contador;
	}
	
	public int getMetros() {
		return metros;
	}
	public void setMetros(int metros) {
		this.metros = metros;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public boolean isAscensor() {
		return ascensor;
	}
	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}
	public boolean isGaraje() {
		return garaje;
	}
	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Casa.contador = contador;
	}
	
}
