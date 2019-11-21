
public class Hombre extends Humano{

	private String nombre;
	public Hombre() {
		super();
	}
	public Hombre(String nombre , int dni) {
		super(dni);
		this.setNombre(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
