

import java.io.*;

public class MenoresYMayores {
	public static void main(String[] args) throws IOException {
		String[] nombres = { "Bea", "Manuel", "Alfonso", "Julio", "Ana", "Marta" };
		int[] edades = { 19, 16, 12, 16, 14, 18 };

		File archivoMenores = new File("menores.dat");
		File archivoMayores = new File("mayores.dat");
		archivoMenores.createNewFile();
		archivoMayores.createNewFile();

		FileOutputStream fileout = new FileOutputStream(archivoMenores);
		DataOutputStream dataOS = new DataOutputStream(fileout);

		FileOutputStream fileout2 = new FileOutputStream(archivoMayores);
		DataOutputStream dataOS2 = new DataOutputStream(fileout2);

		for (int i = 0; i < nombres.length; i++) {
			if (edades[i] < 18) {
				dataOS.writeUTF(nombres[i]);
				dataOS.writeInt(edades[i]);
			} else {
				dataOS2.writeUTF(nombres[i]);
				dataOS2.writeInt(edades[i]);
			}
		}
	}
}
