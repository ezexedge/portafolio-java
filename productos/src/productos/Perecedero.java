package productos;

public class Perecedero extends Producto {
private int diasCaducar;

	public Perecedero(String nombre, int precio,int diasCaducar) {
		super(nombre,precio);
		this.setDiasCaducar(diasCaducar);
		// TODO Auto-generated constructor stub
	}
	

	
	public int getDiasCaducar() {
		return diasCaducar;
	}



	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}



	
	public int calcular(int cantidad) {
		
		int precioFinal = super.calcular(cantidad);
		
		switch(cantidad) {
		
		case 1 : 
			precioFinal /=4;
			break;
		case 2 : 
			precioFinal /=3;
			break;
		case 3: 
			precioFinal /=2;

		}
		
		return precioFinal;
	}



	@Override
	public String toString() {
		return  super.toString() + "Perecedero [diasCaducar=" + diasCaducar + "]";
	}
	
	

}
