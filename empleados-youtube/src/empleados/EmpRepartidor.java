package empleados;

public class EmpRepartidor extends Empleados{
private String zona;

	public EmpRepartidor(String nombre , int edad, double salario , String zona) {
		super(nombre,edad,salario);
		this.setZona(zona);
		// TODO Auto-generated constructor stub
	}
	



	public String getZona() {
		return zona;
	}




	public void setZona(String zona) {
		this.zona = zona;
	}



	

	@Override
	public String toString() {
		return "EmpRepartidor [zona=" + zona + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}


	@Override
	public boolean plus() {
		// TODO Auto-generated method stub

		if(this.getEdad()<25 && zona == "zona 3" )return true;
		else return false;
		
	}




	@Override
	public double sueldoTotal() {
		// TODO Auto-generated method stub
		
		double plus = (this.plus())? Empleados.PLUS : 0;
		return plus + this.getSalario();
		
	}





}
