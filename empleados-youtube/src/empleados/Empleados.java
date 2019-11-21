package empleados;

public abstract class Empleados {

	private String nombre;
	private int edad;
	private double salario;

	
	public Empleados(String nombre , int edad, double salario ) {
		this.setEdad(edad);
		this.setNombre(nombre);
		;
		this.setSalario(salario);
		
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract boolean plus();

	public abstract double sueldoTotal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
