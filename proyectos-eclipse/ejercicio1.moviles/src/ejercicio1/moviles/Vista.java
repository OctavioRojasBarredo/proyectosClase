package ejercicio1.moviles;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
	private Controlador ctr;
	private int respuesta;
	Scanner check = new Scanner(System.in);

	public Vista(Controlador ctr) {
		this.ctr = ctr;
	}

	public void imprimirBienvenida() {
		System.out.println("¡Bienvenido al menú principal! ¿Qué quieres hacer?\n");
	}

	public int menuPrincipal() {
		System.out.println("1. Introducir NUEVA casa\n" + "2. Mostrar todas las casas\n" + "3. Eliminar una casa\n"
				+ "4. Filtrar casas\n" + "0. Salir de la app\n");

		// VERIFICAR SI LA ENTRADA ES UN NÚMERO

		while (true) {
			if (check.hasNextInt()) {
				respuesta = check.nextInt();

				// VERIFICAR SI ESTÁ DENTRO DEL RANGO
				if (respuesta >= 0 && respuesta <= 4) {
					break; // SALIR SI ES CORRECTO
				} else {
					System.out.println("El número introdcido no es válido. Introduce un número entre 0 y 4");
				}
			}
			if (check.hasNextLine()) {
				System.out.println("Has introducido incorrectamente una letra. Introduce un número entre 0 y 4");
				check.next();
			}
		}
		return respuesta;
	}

	public void mensaje1() {
		ctr.crearCasa();
	}

	public void mensajeSalir() {
		System.out.println("Para salir, escribe 'exit'. Si quieres volver al menú, escribe 'volver'");
		
		String palabra = check.next();
		palabra = palabra.trim();
		palabra = palabra.toUpperCase();
		
		if (check.nextLine().contains("exit")) {
			System.exit(0);
		}
		
		if (check.nextLine().contains("volver")) {
			
		}

	public void pararApp() {

	}

	public int pedirMetros() {
		int metros = 0;

		System.out.println("Introduce los metros que quieres en tu casa");
		while (true) {
			if (check.hasNextInt()) {
				metros = check.nextInt();
				break;
			}

			else {
				System.out.println("Caracter incorrecto. Introduce un número");
				check.next();
			}
		}
		return metros;
	}

	public float pedirPrecio() {
		float precio = 0;
		System.out.println("Introduce el precio que quieres en tu casa");
		while (true) {
			if (check.hasNextInt()) {
				precio = check.nextInt();
				break;
			} else {
				System.out.println("Caracter incorrecto. Introduce un número");
				check.next();
			}
		}
		return precio;
	}

	public int pedirPlanta() {
		int planta = 0;

		System.out.println("Introduce la planta que quieres en tu casa");
		while (true) {
			if (check.hasNextInt()) {
				planta = check.nextInt();
				break;
			} else {
				System.out.println("Caracter incorrecto. Introduce un número");
				check.next();
			}
		}
		return planta;
	}

	public boolean pedirAscensor() {
		boolean ascensor = false;

		System.out.println("Introduce si quieres ascensor en tu casa");
		while (true) {
			if (check.hasNextBoolean()) {
				ascensor = check.nextBoolean();
				break;
			} else {
				System.out.println("Caracter incorrecto. Introduce un true/false");
				check.next();
			}
		}
		return ascensor;
	}

	public boolean pedirGaraje() {
		boolean garaje = false;

		System.out.println("Introduce si quieres garaje en tu casa");
		while (true) {
			if (check.hasNextBoolean()) {
				garaje = check.nextBoolean();
				break;
			} else {
				System.out.println("Caracter incorrecto. Introduce un true/false");
				check.next();
			}
		}
		return garaje;
	}

	public int pedirIdentificador() {
		int identificador = 0;

		System.out.println("Introduce el identificador que quieres en tu casa");
		while (true) {
			if (check.hasNextInt()) {
				identificador = check.nextInt();
				break;
			} else {
				System.out.println("Caracter incorrecto. Introduce un número");
				check.next();
			}
		}
		return identificador;
	}

}
