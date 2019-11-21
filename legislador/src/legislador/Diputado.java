package legislador;

public class Diputado extends Legislador {
	private int asientoCamaraBaja;

	public Diputado(String nombre,  String apellido,int edad,boolean casado,String representaA,int asientoCamaraBaja) {
		super(nombre,apellido,edad,casado,representaA);
		this.setAsientoCamaraBaja(asientoCamaraBaja);
		// TODO Auto-generated constructor stub
	}
	

	public int getAsientoCamaraBaja() {
		return asientoCamaraBaja;
	}


	public void setAsientoCamaraBaja(int asientoCamaraBaja) {
		this.asientoCamaraBaja = asientoCamaraBaja;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public String toString() {
		return super.toString() + "Diputado [su numero de asiento en el que trabaja es =" + asientoCamaraBaja + "]";
	}


	@Override
	public void getCamaraTrabaja() {
		// TODO Auto-generated method stub
		System.out.println("camara diputados");
		
	}

}
