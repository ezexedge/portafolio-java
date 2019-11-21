package coleccion;

import java.util.ArrayList;
import java.util.*;

public class Colecciones {

	public Colecciones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List miLista = new ArrayList();
		miLista.add("1");
		miLista.add("2");
		miLista.add("3");
		
		//las lista se pueden repetir
		miLista.add("3");
		
		imprimir(miLista);
		
		//hashSet no admite elementos repetidos
		
		Set  miSet =  new HashSet();
		miSet.add("1");
		miSet.add("2");
		miSet.add("3");
		//las hashset no se pueden repetir

		miSet.add("3");
		imprimir(miSet);
		
		//Map 
		
		Map miMapa = new HashMap();
		miMapa.put("1", "ezequiel");
		miMapa.put("2", "marcelo");
		miMapa.put("3", "jorge");
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
	}
	
	private static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion) {
			System.out.println(elemento + " ");
		}
		System.out.println("");
	}

}
