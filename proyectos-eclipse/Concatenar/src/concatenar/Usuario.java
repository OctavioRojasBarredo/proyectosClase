package concatenar;

import java.util.Scanner;

public class Usuario {
	Terminal term;
	Vocal vcl;
	Scanner escaner = new Scanner(System.in);
	int respuesta = 0;

	public Usuario() {
		term = new Terminal(vcl);
		vcl = term.getVcl();
		term.generarMenu();
		seleccionarOpcion();
	}

	public void seleccionarOpcion() {
		while (true) {
			if (escaner.hasNextInt()) {
				respuesta = escaner.nextInt();
				if (respuesta >= 0 && respuesta <= 3) {
					{
						switch (respuesta) {
						case 0:
							term.cerrarApp();
							break;
						case 1:
							term.generarUno();
							break;
						case 2:
							term.generarDos();
							break;
						case 3:
							term.generarTres();
							break;
						}
					}
				} else {
					System.out.println("Introduce un número del 0 al 3");
					escaner.next();
					
					
				}
			}
		}
	}
	
	
}
