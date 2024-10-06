package concatenar;

import java.util.Random;

public class Vocal {
	Vocal vcl;
	Terminal term;
	Numero num;
	Random aleatorio = new Random();
	String[] vocales = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

	public Vocal() {
		this.term = new Terminal(this.vcl);
		this.num = new Numero();
	}

	public void generarVocales() {
		int selector = aleatorio.nextInt(vocales.length);
		int contador = -1;
		String letraElegida = "";

		for (String letra : vocales) {
			if (contador <= selector) {
				contador++;
				letraElegida = letra;
			}
		}

		System.out.println(letraElegida);

	}
}
