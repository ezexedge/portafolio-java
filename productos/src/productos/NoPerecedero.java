package productos;

public class NoPerecedero extends Producto{
public String tipo;
	public NoPerecedero(String nombre, int precio,String tipo) {
		super(nombre,precio);
		this.setTipo(tipo);
		// TODO Auto-generated constructor stub
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return super.toString() + "NoPerecedero [tipo=" + tipo + "]";
	}
	

	
}
