package statico;

public class Personas {
	private String nombre;
	private Integer idPersona;
	private static int contadorPersona;

	public Personas(String nombre) {
		// TODO Auto-generated constructor stub
		
		contadorPersona++;
		idPersona = contadorPersona;
		this.setNombre(nombre);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public static Integer getContadorPersona() {
		return contadorPersona;
	}

	public static void setContadorPersona(Integer contadorPersona) {
		Personas.contadorPersona = contadorPersona;
	}
	public String toString() {
		return "nombre :" + this.getNombre() + ", id-persona: " + this.getIdPersona();
	}

}
