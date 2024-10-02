import java.io.*;

public class listarArchivos {
    public static void main(String[] args) throws IOException {
        File f = new File("src\\ejercicioListar.txt");
        FileReader lector = new FileReader(f);
        int i;
        while ((i = lector.read()) != -1 ) {
            System.out.println((char) i);
        }
        lector.close();
    }
}

