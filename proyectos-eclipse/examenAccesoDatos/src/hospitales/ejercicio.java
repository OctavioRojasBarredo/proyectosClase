package hospitales;

import java.io.*;


public class ejercicio {
	public static void main(String[] args) throws IOException{
		File fichero = new File("datosHospital.dat");
		RandomAccessFile file =  new RandomAccessFile(fichero,"rw");
		int cod[] = {210,315,250};
		String name[] = {"Gregorio Marañón" , "HM Hospital Universitario", "12 de Octubre"};
		String dic[] = {"C. Dr. Esquerdo, 46", "Pl. del Conde del Valle de Súchil, 16", "Av. de Córdoba, s/n"};
		int camas[] = {1671, 1312, 1296};
		Double pre[] = {2252257.54,3253254.78,52542547.87};
		
		StringBuffer bufferN = null;
		StringBuffer bufferD = null;
		
		for(int i=0; i<name.length; i++) {
			
			bufferN = new StringBuffer(name[i]);
			bufferD = new StringBuffer(dic[i]);
			bufferN.setLength(30);
			bufferD.setLength(35);
			
			file.writeInt(cod[i]);//4 bytes
			file.writeChars(bufferN.toString());//60 bytes
			file.writeChars(bufferD.toString());//70 bytes
			file.writeInt(camas[i]);//4 bytes
			file.writeDouble(pre[i]);// 8 bytes
			//total 146 bytes
		}
		file.close();
		insert();
	}
	
	public static void insert() throws IOException {
		BufferedWriter fichero = new BufferedWriter(new FileWriter("src/hospitales.txt"));
		File datos = new File("datosHospital.dat");
		RandomAccessFile file =  new RandomAccessFile(datos,"r");
		int codigo,cama,pos;
		Double pre;
		char name[] = new char[30],auxN;
		char dic[] = new char[35],auxD;
		pos=0;
		for(;;) {
			file.seek(pos);
			codigo= file.readInt();
			for(int i=0;i<name.length;i++) {
				auxN = file.readChar();
				name[i]=auxN;
			}
			
			for(int i=0;i<dic.length;i++) {
				auxD = file.readChar();
				dic[i]=auxD;
			}
			cama=file.readInt();
			pre=file.readDouble();
			String nombre = new String(name);
			String direccion = new String(dic);
			
			String linea ="Codigo: " + codigo +  " Nombre: " + nombre.trim() + 
			" Direccion: " + direccion.trim() + " Camas: " + cama + " Presupuesto: " + pre;
			
			
			fichero.write(linea);
			fichero.newLine();			
			
			pos+= 146;
			if(file.getFilePointer()==file.length()) {
				break;
			}
		}
		file.close();
		fichero.close();
	}
}
