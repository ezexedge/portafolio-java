package herencia;

public class Persona {
	private String nombre;
	private Integer edad;
	private char genero;
	private String direccion;
	
	

	
	
	public Persona(String nombre,Integer edad,char genero,String direccion) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setDireccion(direccion);
	}
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", direccion=" + direccion + "]";
	}

}
