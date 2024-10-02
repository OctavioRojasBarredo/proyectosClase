package com.eclipse.practicas.probandopaquetes.paquete1;

public class Pollos {

	int edad;
	boolean feliz;
	String nombre;
	
	public Pollos (int edad2, boolean feliz2, String nombre2) {
		edad = edad2;
		feliz = feliz2;
		nombre = nombre2;
	}
	
	public static void main(String[] args) {

	}
	
	public int geEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getFelicidad() {
		return feliz;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setFelicidad(boolean nuevaFelicidad) {
		feliz = nuevaFelicidad;
	}
	
	public String getEstado() {
		String estado = "Edad: " + edad + " || Nombre del pollo: " + nombre + " || ¿Es feliz?: " + feliz;
		return estado;
	}
	
	public void imprimirEstado() {
		System.out.println("Edad: " + edad + " || Nombre del pollo: " + nombre + " || ¿Es feliz?: " + feliz);
	}
}