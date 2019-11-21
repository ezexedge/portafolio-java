package empleados;

public class EmpComercial extends Empleados{
private double comision;
	public EmpComercial(String nombre , int edad, double salario ,double comision) {
		super(nombre,edad,salario);
		this.setComision(comision);
		
		// TODO Auto-generated constructor stub
	}
	
	




	public double getComision() {
		return comision;
	}






	public void setComision(double comision) {
		this.comision = comision;
	}






	@Override
	public String toString() {
		return "EmpComercial [comision=" + comision + "]";
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	@Override
	public boolean plus() {
		// TODO Auto-generated method stub
		if(this.getEdad()>30&&this.getComision()>200)return true;
		else return false;
	}






	@Override
	public double sueldoTotal() {
			
	  double plus =	(this.plus())? Empleados.PLUS : 0;
		return plus + this.getSalario();
	}







}
