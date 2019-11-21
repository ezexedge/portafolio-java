import java.util.Scanner;
public class libros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner titulo = new Scanner(System.in);
		System.out.println("ingrese el nombre del titulo");
		String tituloInput = titulo.nextLine();
		
		
		Scanner autor = new Scanner(System.in);
		System.out.println("ingrese el nombre del autor");
		String autorInput = autor.nextLine();
	
		
		
		System.out.println(tituloInput + " fue escrito por " + autorInput);
	
		
	}

}
