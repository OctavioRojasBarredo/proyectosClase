package com.eclipse.practicas.probandopaquetes;

import com.eclipse.practicas.probandopaquetes.paquete1.Pollos;
import com.eclipse.practicas.probandopaquetes.paquete2.Huevos;

public class App {
	public static void main(String[] args) {
		Pollos pollo1 = new Pollos(3, true, "Juan");	
		Pollos pollo2 = new Pollos(10, false, "Margot");	
		
		Huevos huevo1 = new Huevos(3, true, "Marca blanca");	
		Huevos huevo2 = new Huevos(12, false, "Marca blanca");	
		
		huevo1.imprimirEstado();
		huevo2.imprimirEstado();
		pollo1.imprimirEstado();
		pollo2.imprimirEstado();
		
		
	}
}
