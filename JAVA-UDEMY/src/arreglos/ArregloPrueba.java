package arreglos;

public class ArregloPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edades[];
		//le declaramos a edades la cantidad de espacio que va a tener para ser ocupado
		
		edades = new int [4];
		edades[0] = 22;
		edades[1] = 3;
		edades[2] = 10;
		edades[3] = 11;
		
		for(int i=0; i < edades.length ; i++) {
			System.out.println(edades[i]);
		}
		
		Persona personas[];
		personas = new Persona [10];
		personas[1] = new Persona("coco");
		personas[0] = new Persona("didi");
		personas[2] = new Persona("tony");
		personas[3] = new Persona("nonosito");
		
		for(int i=0; i < personas.length ; i++) {
			System.out.println(personas[i]);
		}
		
		
		//cargamos todos lo valores de entrada y luego lo recorremos {  }
		String nombre[] = {"pepa", "coco" ,"didi" ,"nonosito"};
		
		
		for(int i=0; i < nombre.length ; i++) {
			System.out.println(nombre[i]);
		}
		
		
		
	}

}
