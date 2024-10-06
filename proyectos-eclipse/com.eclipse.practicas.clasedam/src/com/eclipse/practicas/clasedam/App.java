package com.eclipse.practicas.clasedam;

public class App {

    public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Miguel", "12345", 21);
		Alumno alumno2 = new Alumno("Juan", "54321", 24);
		Alumno alumno3 = new Alumno("Maria","8832", 19);

		ClaseDam claseDam = new ClaseDam(3);
		claseDam.setTutor("Francisco García");
		claseDam.setCentro("IES San Andrés");
		claseDam.setAula("203");

		claseDam.matricularAlumno(alumno1);
		claseDam.matricularAlumno(alumno2);
		claseDam.matricularAlumno(alumno3);
		
		claseDam.imprimeDetalles();
    }
}
