import java.util.Scanner;
public class holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String saludar = "Hola mundo";
		//String persona = "ezequiel";
				
		//concatenamos
		//System.out.println(saludar +  ' ' + persona);
		
		//salto de linea \n y el tabulador \t
		
	//	System.out.println("hola\n" + "chau");

		//Con scanner nosotro proporcionamos valores manualmente
		Scanner scanner = new Scanner(System.in);
		String usuario = scanner.nextLine();
		String saludar = "saludos";
		System.out.println(saludar + " " + usuario);
		
	
		
		
	}

}
