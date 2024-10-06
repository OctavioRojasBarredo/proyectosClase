package com.eclipse.practicas.junitbasico;

/**
 * Clase Rectangulo
 */

public class Rectangulo {

	
	private int alto;
	private int ancho;
	
	/*
	 * Crea un nuevo rectangulo
	 * 
	 * @param El alto del rectangulo
	 * @param El ancho del rectangulo
	 */
	
	public Rectangulo(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	/*
	 * Devuelve el perimetro del rectangulo
	 * 
	 * @return El perimetro del rectangulo
	 */
	public int perimetro() {
		return (2 * alto) + (2 * ancho);
	}
	
	/*
	 * Devuelve el area del rectangulo
	 * 
	 * @return El area del rectangulo
	 */
	public int area() {
		return ancho * alto;
	}
	
	/**
	 * Devuelve la longitud de la diagonal del rectángulo
	 * 
	 * @return La longitud de la diagonal del rectángulo
	 */
	public double longitudDiagonal() {
		double longitudDiagonal = Math.sqrt(Math.pow(alto, 2) +  Math.pow(ancho, 2));
		return longitudDiagonal;
	}
}
