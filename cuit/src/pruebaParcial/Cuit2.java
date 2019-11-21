package pruebaParcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;
import javax.swing.text.html.HTMLDocument.Iterator;


public class Cuit2 {
	String dni;


	public Cuit2(String dni) {

	this.setDni(dni);
	}
	
	public Cuit2() {

		}
	
	public int numeroAux1() {
		int numeroSerie[] = {5,4,3,2,7,6,5,4,3,2};
		String dni [] = this.dni.split("-");
		String parte1 = dni[0];
		String parte2 = dni[1];
		String parte3 = dni[2];
		
		String dni2  = parte1 + parte2;
		
		String  dniArray[] = dni2.split("");
		
		int acum = 0;
		
		
		
		for(int i = 0 ; i< dniArray.length ; i++) {
			
			int parse = Integer.parseInt(dniArray[i],10);
			
			
			acum+=parse * numeroSerie[i];
			
		}
		
		return acum;
		
			
		
	}
	
	
	
	public int numeroAux2() {
		   return 11 - (this.numeroAux1() % 11);
		  
	}
	

	
	public String numeroVerificador() {
		
		String dni [] = this.dni.split("-");
		String parte1 = dni[0];
		String parte2 = dni[1];
		String parte3 = dni[2];
		
			
		int parseInicio = Integer.parseInt(parte1,10);
		int parse = Integer.parseInt(parte3,10);
		String resp="";
		boolean codigoIncorrecto = false;
		
		switch(parseInicio) {
		
		case 20:
			resp+=" tipo hombre";
		break;
		case 27:
			resp+=" tipo mujer";
		break;
		case 24:
			resp+=" tipo persona repetido";
		break;
		case 30:
			resp+=" tipo empresa";
		break;
		case 34:
			resp+=" tipo empresa repetido";
		break;
		default :
			resp += "tipo incorrecto";
			codigoIncorrecto = true;
		break;
		
		
		}
		
		if(codigoIncorrecto) {
			resp = "cuil es incorrecto los valores no estan dentro de los parametros " + this.getDni();
			return resp;
			
			 
			
			
		}
	
		
		if(parse == this.numeroAux2()) {
			resp += " ,  numero verificador correcto : " + this.getDni();
			
		}
		
		else {
			
			int verificadorCorrecto = this.numeroAux2();
			String verificadorParse = Integer.toString(verificadorCorrecto);

			String dniArray[] = this.getDni().split("");
			ArrayList<String> arreglo = new ArrayList<String>(Arrays.asList(dniArray));
			arreglo.remove(arreglo.size() - 1);
			arreglo.add(verificadorParse);
			String listString = String.join( "", arreglo);
			
			 resp += "  , el numero de cuil/cuit " +  this.getDni()  +   "  es incorrecto "    +  " su cuil debe ser " + listString ;
			
		
		}
		
		
		
		return resp;
		
				
	}
	


	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}
	

	
	public static Collection<Cuit2> leerGuardar(String ruta) throws IOException {
		  
				BufferedReader abc = new BufferedReader(new FileReader(ruta));
				List<String> data = new ArrayList<String>();
				String s;
				while((s=abc.readLine())!=null) {
					
				    data.add(s);
				}
				abc.close();       
				
				data.remove(0);
				    
				
				Collection<Cuit2> persona = new ArrayList<Cuit2>();
				for(String p : data) {
					persona.add(new Cuit2(p));
				}
				
				
				
			return persona;
			
	}
	
	


	@Override
	public String toString() {
		return "Cuit2 [dni=" + dni + "]";
	}
	
	
	public static void escribirArchivo(String file, Collection<Cuit2> pepa) throws FileNotFoundException {
		 ArrayList<String> incorrecto = new ArrayList<String>();
		 ArrayList<String> correcto = new ArrayList<String>();
		 
		 for(Cuit2 p : pepa) {
				if(p.numeroVerificador().indexOf("incorrecto")!= -1 ) {
					incorrecto.add(p.numeroVerificador());
				}else {
					correcto.add(p.numeroVerificador());
				}
			}
			
		
		 PrintWriter pw = new PrintWriter(new FileOutputStream(file));
		 pw.print("cuil/cuit validos : \n");  
		 for (String p : correcto)
		        pw.println(p);
		 pw.print("\n\n\n");
		 pw.print("cuil/cuit que son invalidos \n");
		 for(String b : incorrecto) {
			 pw.println(b);
		 }
		    pw.close();
		
		
	}
	
	
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
	
		String ruta = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/cuit.csv";
		
	Collection<Cuit2> pepa = Cuit2.leerGuardar(ruta);
System.out.println(pepa);
		
		
		String fileName =  "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/cuit-out.txt";
		
	Cuit2.escribirArchivo(fileName, pepa);
	

	  

	}

}
