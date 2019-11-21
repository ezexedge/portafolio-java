package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class TengoArchivo {

	public TengoArchivo() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String ruta = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/didi.txt" 
;
		File archivo = new File(ruta);
		BufferedWriter bw;
		if(archivo.exists()) {
		    bw = new BufferedWriter(new FileWriter(archivo,true));
		      bw.write("El fichero de texto ya estaba creado.");
		}
		else {
			
			 bw = new BufferedWriter(new FileWriter(archivo));
	            bw.write("Acabo de crear el fichero de texto.");
			
			
		}
		
		bw.close();

	}

}



