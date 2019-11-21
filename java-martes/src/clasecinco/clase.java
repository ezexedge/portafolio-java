package clasecinco;
import java.util.Arrays;
public class clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "hola mundo";
		
		System.out.println(msg);
		
		String msg1 = new String("hola mundo desde msg1");
		System.out.println(msg1);
		System.out.println(msg.concat(" hola mundo cruel"));
		// lo objetos string no son modificables
		
		
		System.out.println(msg1.length());
		//chartAt() devuelve el la posicion de un valor que piso
		
		System.out.println(msg.charAt(2));//me muestra un valor
		//equals()
		
		
		System.out.println(msg.equals(msg1));
		//si busco que sea distinto pongo !msg.equals(msg1)
		
		
		//substring() me devuelve lo que entre una frase
		
		System.out.println(msg.substring(0,2));
		
		//trim borra los espacios en blanco
		
		
		//split me devuelve un arreglo
		
		System.out.println(msg1.split(" "));
		
		//indexof te devuelve la posicion y si no encuentra nada -1
		
		System.out.println(msg1.indexOf("a"));
		
		//buscar informacin sobre endwith y startwith
		System.out.println(msg1.endsWith("msg1"));
		
		//desp tambien tenemos toLowerCase
		//toUpperCasee
		
		
		//instanceof verifico que  hola pertenesca a string
		
		String hola = "hola mundo";
		if(hola instanceof String) {
			System.out.println("verdad");
		}else {
			System.out.println("falso");
		}
		
	//arreglos
		

			String nombre [] = {"pep", "pepa"};
			
			for(int i = 0 ;i  <  nombre.length ; i++) {
				System.out.println(nombre[i]);
			}
			
		
			
			//arreglos metodos y etc
			

			//estructuras de control
			
			int [] arr = new int [] {2,2,2,2,23,3};
			
			for(int valor : arr) {
				System.out.println(valor);
			}
			
			
		Integer valor = 3;
		
		Integer valor1 = 13;
		
		System.out.println(valor.compareTo(valor1));
			
			
			
			
			
		
		
		

	}

}
