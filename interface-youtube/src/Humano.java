
public class Humano implements AccionesGeneral , AccionesHumanos {
protected int dni;
	public Humano(int dni) {
		// TODO Auto-generated constructor stub
		this.setDni(dni);
	}
	public Humano() {
		
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void razonar() {
		System.out.println("el humano esta razonando desde la cclase humano");
	}
	@Override
	public void desplazarce() {
		// TODO Auto-generated method stub
		System.out.println("el humano con dni" + this.getDni() + " se esta desplazando");
		
	}
	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("el humano con dni" + this.getDni() + " esta jugando");
		
	}
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void bailar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("el hombre " + nombre + " esta bailando ");
		
	}
	@Override
	public void trabajar(String nombre , int dni) {
		// TODO Auto-generated method stub
		System.out.println("el hombre " + nombre + " con dni " + dni + "  esta trabajando ");
		
	}
	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		
	}
	

}
