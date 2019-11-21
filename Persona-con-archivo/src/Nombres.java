import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.print.MultiDoc;




public class Nombres {
	
private	 static List<String> miArray = new ArrayList<String>();
private static	HashMap<String, Integer> mapa = new HashMap<String, Integer>();

	
	



	public Nombres() {
		// TODO Auto-generated constructor stub
		
		
	}
		
	
	
	
	public static    HashMap<String, Integer> leerGuardar(String ruta) throws IOException {
		BufferedReader abc = new BufferedReader(new FileReader(ruta));
		String s;
		while((s=abc.readLine())!=null) {
			
		
			miArray.add(s);
		    
		}
		abc.close();  
		
		miArray.remove(0);
		
		 
		  
		    for(String iterable : miArray) {
		      
		      int c = 0;
		      if(mapa.containsKey(iterable)) {
		        c = mapa.get(iterable);
		      }
		      c++;
		      mapa.put(iterable, c);
		    }
		    
		  
		    
		    return mapa;
		 
	
}
	
	public static void listarCantNombres(HashMap<String, Integer> lista, String file) throws FileNotFoundException{
		
		 LinkedList<String> guardarPersonas = new LinkedList<String>();
		 
		 
	
		 
		 lista.forEach((k,v) ->{
			 guardarPersonas.add( "Key: " + k + ": Value: " + v);
		 });
		 
		 
		 PrintWriter pw = new PrintWriter(new FileOutputStream(file));
		 
		 for(String iterable1 : guardarPersonas) {
			pw.println(iterable1);
		 }

		 
		 
		 pw.close();
		
		
		
	}
		
		
		
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String ruta = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/400milNombres.in";
		
		HashMap<String, Integer> listaFinal = Nombres.leerGuardar(ruta);
		
		
		String escribirNombres = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/nombres.out";
		
		Nombres.listarCantNombres(listaFinal, escribirNombres);
		
		

		

	
		 
		 
		
		
		
		
			
		}

		
		


		
		

	

}
