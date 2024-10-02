package ejemploProcesos2;

public class PiedraPapelTijeras {
	public static void main(String[] args) {
		String movimiento;
		if (args != null) {
			int contador = 0;
			for (String palabra : args) {
				contador++;
				if (contador == 1) {
					if (palabra.contains("piedra")) {
						movimiento = palabra;
					} else if (palabra.contains("papel")) {
						movimiento = palabra;
					} else if (palabra.contains("tijera")) {
						movimiento = palabra;
					} else {
						System.out.println("No es válido el argumento número " + contador);
					}
				}

				if (contador == 1) {
					if (palabra.contains("piedra")) {
						movimiento = palabra;
					} else if (palabra.contains("papel")) {
						movimiento = palabra;
					} else if (palabra.contains("tijera")) {
						movimiento = palabra;
					} else {
						System.out.println("No es válido el argumento número " + contador);
					}
				}
			}
		} else {

			System.out.println("No hay argumentos, introdúcelos");
		}
	}
}
