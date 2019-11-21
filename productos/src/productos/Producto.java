package productos;

public class Producto {
protected String nombre;
protected int precio;

	public Producto(String nombre, int precio) {
		// TODO Auto-generated constructor stub
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int calcular(int cantidad) {
		return cantidad * this.precio;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}


	

	
	
}
