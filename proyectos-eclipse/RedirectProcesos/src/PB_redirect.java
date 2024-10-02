import java.io.File;
import java.io.IOException;

public class PB_redirect {
	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		
		File fOut = new File("./src/salida.txt");
		File fErr = new File("./src/error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}
