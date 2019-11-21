package enumeraciones;

public class EjemploEnumeraciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("valor 1 : " + Dias.LUNES);
		
		indicarDias(Dias.LUNES);

	}
	
	public static void indicarDias(Dias dias) {
		switch(dias) {
		
		case LUNES : 
			System.out.println("primer dia de la semana");
		break;
		
		case MARTES	 : 
			System.out.println("Segundo  dia de la semana");
		break;
		case MIERCOLES	 : 
			System.out.println("TERCER  dia de la semana");
		break;
		default:
			System.out.println("dato no valido");
		
	
		}
	}

}
