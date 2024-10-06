package com.eclipse.practicas.probandopaquetes.paquete2;

public class Huevos{

	int numeroHuevos;
	boolean calidadHuevos;
	String marcaHuevos;
	
	public Huevos(int numeroHuevos2, boolean calidadHuevos2, String marcaHuevos2) {
		numeroHuevos = numeroHuevos2;
		calidadHuevos = calidadHuevos2;
		marcaHuevos = marcaHuevos2;
	}
	
	public static void main(String[] args) {

	}
	
	public int getNumeroHuevos() {
		return numeroHuevos;
	}
	
	public String getMarcaHuevos() {
		return marcaHuevos;
	}
	
	public boolean getCalidadHuevos() {
		return calidadHuevos;
	}
	
	public void setNumeroHuevos(int nuevaCantidad) {
		numeroHuevos = nuevaCantidad;
	}
	
	public void setMarcaHuevos(String nuevaMarca) {
		marcaHuevos = nuevaMarca;
	}
	
	public void setCalidadHuevos(boolean nuevaCalidad) {
		calidadHuevos = nuevaCalidad;
	}
	
	public String getEstado() {
		String estado = "Cantidad huevos: " + numeroHuevos + " || Marca huevos: " + marcaHuevos + " || Calidad huevos: " + calidadHuevos;
		return estado;
	}
	
	public void imprimirEstado() {
		System.out.println("Cantidad huevos: " + numeroHuevos + " || Marca huevos: " + marcaHuevos + " || Calidad huevos: " + calidadHuevos);
	}
	
	

}
