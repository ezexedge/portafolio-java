package herencia;

public class Empleado extends Persona{
	private Integer idEmpleado;
	private Integer sueldo;
	private static int contadorEmpleado;

	
	public Empleado(String nombre, Integer sueldo) {
		super(nombre);
		this.idEmpleado = contadorEmpleado++;
		this.sueldo = sueldo;
	}
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}
	public  void setContadorEmpleado(int contadorEmpleado) {
		Empleado.contadorEmpleado = contadorEmpleado;
	}
	@Override
	public String toString() {
		return  super.toString() + " Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
	}

}
