package datos;

public class Personas {
	String nombre;
	String apellido;
	Integer salarioSemanal;
	public Personas(String nombre , String apellido , Integer salarioSemanal) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioSemanal = salarioSemanal;

	}
	public int calcular(Integer salarioSemanal) {
		Integer salario = salarioSemanal * 2;

		return salario;
	}

	public void desplegarDatos() {
		System.out.println("nombre : " + nombre);
		System.out.println("aplellido : " + apellido);
		System.out.println("salario semana: " + calcular(salarioSemanal) );
	}

}
