package leerEscribirBinarios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class consultacoche {
    public consultacoche() throws IOException{
        File fichero = new File("coches.dat");
        RandomAccessFile acceso = new RandomAccessFile(fichero, "r");

        try {
            while (acceso.getFilePointer() < acceso.length()) {

                String dni = acceso.readUTF();
                String nombre = acceso.readUTF();
                String apellidos = acceso.readUTF();
                String matricula = acceso.readUTF();
                String ciudad = acceso.readUTF();

                System.out.println("DNI: " + dni);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellidos: " + apellidos);
                System.out.println("Matrícula: " + matricula);
                System.out.println("Ciudad: " + ciudad);
                System.out.println("------------------------------");
            }
        } catch (IOException e) {
            System.err.println("Error al leer los datos: " + e.getMessage());
        } finally {
            acceso.close();
        }
    }

    public static void main(String[] args) throws IOException {
        new consultacoche();
    }
}
