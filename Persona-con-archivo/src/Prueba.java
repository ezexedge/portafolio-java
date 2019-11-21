import java.awt.List;
import java.util.ArrayList;

public class Prueba {
	private int cantidad;
	private int precio;
	

	public Prueba(int cantidad,int precio) {
		// TODO Auto-generated constructor stub
		this.setCantidad(cantidad);
		this.setPrecio(precio);
	}
	

	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public float getPrecio() {
		return precio;
	}


	

	public void setPrecio(int precio) {
		this.precio = precio;
	}




	

	@Override
	public String toString() {
		return "Prueba [cantidad=" + cantidad + ", precio=" + precio + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     ArrayList<Prueba> valores = new ArrayList<Prueba>(); 
	     
	     Prueba p1 = new Prueba(2,100);
	     valores.add(p1);
	     
	}

}
