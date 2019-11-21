import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pruebaParcial.Cuit2;

public class Personas implements Comparator<String>{
	private int dni;
	private String apellido;
	private int edad;
	private static LinkedList<Personas> personas = new LinkedList<>();


	public Personas(int dni ,String apellido , int edad) {
		// TODO Auto-generated constructor stub
		this.setApellido(apellido);
		this.setDni(dni);
		this.setEdad(edad);
	}

	
	
	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	



	@Override
	public String toString() {
		return "dni=" + dni + ", apellido=" + apellido + ", edad=" + edad + "";
	}

	
	public static  LinkedList<Personas> leerGuardar(String ruta) throws IOException {
		  
		BufferedReader abc = new BufferedReader(new FileReader(ruta));
		 LinkedList<String> data = new  LinkedList<String>();
		String s;
		while((s=abc.readLine())!=null) {
			
		    data.add(s);
		}
		abc.close();       
	

		 
		for(String p : data) {
			String datos [] = p.split(" ");
			String dni = datos[0];
			String apellido = datos[1];
			String edad = datos[2];
			
			
			int parseEdad = Integer.parseInt(edad,10);
			int parseDni = Integer.parseInt(dni,10);
			
			personas.add(new Personas(parseDni,apellido,parseEdad));
			
				
			
		}
		    
	
		
	return personas;
	
}


	
	private static void printArrayListPersona() {
		Iterator<Personas> itrArrayList = personas.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());
			posicion++;
		}
	}

	



	public static LinkedList<Personas> getPersonas() {
		return personas;
	}



	public static void setPersonas(LinkedList<Personas> personas) {
		Personas.personas = personas;
	}
	
	
	
	public static  LinkedList<Personas> getPersonasOrdenadasPorDni(LinkedList<Personas> lista){
		
		 
		LinkedList<Personas> listaCopiada = new LinkedList<Personas>(lista);

		
		 Collections.sort(listaCopiada, new Comparator<Personas>() {
			 
		        
		        public int compare(Personas p1, Personas p2) {
		            return p1.getDni() - p2.getDni();
		        }
		    });
		return listaCopiada;
	}
	
	
public static LinkedList<Personas> getPersonasMayores(LinkedList<Personas> lista, int edad){
	
	LinkedList<Personas> listaCopiada = new LinkedList<Personas>();
	
	 for(Personas iterable : lista) {
		 if(iterable.getEdad() > edad) {
			 listaCopiada.add(iterable);
		 }
	 }
	 
	 return listaCopiada;
	
}


public static void listarPersonas(LinkedList<Personas> lista, String file) throws FileNotFoundException{
	
	 LinkedList<String> guardarPersonas = new LinkedList<String>();
	 
	 
	 for(Personas iterable : lista) {
		 guardarPersonas.add(iterable.toString());
	 }
	 
	 PrintWriter pw = new PrintWriter(new FileOutputStream(file));
	 
	 for(String iterable1 : guardarPersonas) {
		pw.println(iterable1);
	 }

	 
	 
	 pw.close();
	
	
	
}
	
	
	
	
	
	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

   


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 LinkedList<Personas> prueba = new  LinkedList<Personas>();

		prueba = Personas.leerGuardar("/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/personas.txt");
		System.out.println(prueba);
		
		// for(Personas iterable : prueba) {
		//	 System.out.println(iterable);
		 //}
	
		 
		
		 LinkedList<Personas> nueva 	= Personas.getPersonasOrdenadasPorDni(prueba);
		
		
			String personaOrdenada = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/personaOrdenadasPorDni.out";
			
		
			Personas.listarPersonas(nueva, personaOrdenada);

		
		
		
		 	

		LinkedList<Personas> personasMayores	 = Personas.getPersonasMayores(prueba, 34);
		
		String mayorEdad = "/Users/ezequielgallardo/eclipse-workspace/archivos/src/misArchivos/personasMayores.out";
		
		Personas.listarPersonas(personasMayores , mayorEdad);


		
		
		
		
		
		

		

	}



	





}
