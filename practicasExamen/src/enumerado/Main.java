package enumerado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirMensaje(Estado.EN_PROGRESO);
	}
	
	
	public static void imprimirMensaje(Estado estado) {
		System.out.printf(estado.getMensaje(), estado.name());
	}

}
