package ejercicio1.moviles;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
	private Vista vista;
	private ArrayList<Casa> lista_casas;
	Scanner check = new Scanner(System.in);

	public Controlador() {
		vista = new Vista(this);
		vista.imprimirBienvenida();
		iniciar();
	}

	public void iniciar() {

		int seleccion;
		seleccion = vista.menuPrincipal();

		switch (seleccion) {
		case 0:
			salir();
			break;
		case 1:
			introducir();
			break;
		case 2:
			mostrar();
			break;
		case 3:
			eliminar();
			break;
		case 4:
			filtrar();
			break;
		}
	}

	public void introducir() {
		vista.mensaje1();

	}

	public void mostrar() {

	}

	public void eliminar() {

	}

	public void filtrar() {

	}

	public void salir() {
		
	}

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	public ArrayList<Casa> getLista_casas() {
		return lista_casas;
	}

	public void setLista_casas(ArrayList<Casa> lista_casas) {
		this.lista_casas = lista_casas;
	}

	public void crearCasa() {
		int metros = vista.pedirMetros();
		float precio = vista.pedirPrecio();
		int planta = vista.pedirPlanta();
		boolean ascensor = vista.pedirAscensor();
		boolean garaje = vista.pedirGaraje();
		int identificador = vista.pedirIdentificador();
		
		Casa casa = new Casa(metros, precio, planta, ascensor, garaje, identificador);
		
		lista_casas.add(casa);
	}

}
