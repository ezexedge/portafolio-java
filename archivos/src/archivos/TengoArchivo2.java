package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TengoArchivo2 {

	public TengoArchivo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//ESCRIBIMOS	
		/*
		String new_space = " ";
		String ruta = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/didi.txt";
		 BufferedWriter bw =  new BufferedWriter(new FileWriter(ruta));
		 bw.write("hola");
		 bw.write(new_space);
		 bw.write("chau");
		 bw.close();
		 
		 */
		
		//LEEMOS
		String ruta = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/didi.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(ruta));
		String linea= " ";
				while((linea=br.readLine()) !=null) {
					System.out.println(linea);
				}
					
		 
		 
		 
		
			
		}
		

	}


