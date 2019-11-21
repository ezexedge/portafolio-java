package empleados;

public class EmpleadosTest {

	public EmpleadosTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados p1 = new EmpComercial("ezequiel",32,300.2,500.5);
		System.out.println(p1.sueldoTotal());
		
		Empleados p2 = new EmpRepartidor("pablo",23,222.2,"zona 3");
		System.out.println(p2.sueldoTotal());

	}

}
