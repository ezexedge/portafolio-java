package legislador;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;

	public Persona(String nombre,  String apellido,int edad,boolean casado) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setCasado(casado);
	
		// TODO Auto-generated constructor stub
		
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado=" + casado + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
