package legislador;

public class Senador extends Legislador {
	private int asientoCamaraAlta;
	

	public Senador(String nombre,  String apellido,int edad,boolean casado,String representaA ) {
		super(nombre, apellido, edad, casado, representaA);
		this.setAsientoCamaraAlta(asientoCamaraAlta);
		
		// TODO Auto-generated constructor stub
	}
	


	public int getAsientoCamaraAlta() {
		return asientoCamaraAlta;
	}



	public void setAsientoCamaraAlta(int asientoCamaraAlta) {
		this.asientoCamaraAlta = asientoCamaraAlta;
	}



	@Override
	public void getCamaraTrabaja() {
		// TODO Auto-generated method stub
		
	}

}
