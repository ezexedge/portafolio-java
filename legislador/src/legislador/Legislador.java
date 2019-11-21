package legislador;

public abstract class Legislador extends Persona {
	private String representaA;
	
	public Legislador(String nombre,  String apellido,int edad,boolean casado,String representaA ) {
		super(nombre,apellido,edad,casado);
		this.setRepresentaA(representaA);
	
		// TODO Auto-generated constructor stub
	}
	

	public String getRepresentaA() {
		return representaA;
	}


	public void setRepresentaA(String representaA) {
		this.representaA = representaA;
	}

	public abstract void getCamaraTrabaja();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
