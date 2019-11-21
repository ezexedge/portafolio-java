package arreglos;

public class Persona {
private String nombre;

	public Persona(String nombre) {
		// TODO Auto-generated constructor stub
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

}
