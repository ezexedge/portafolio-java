package herencia;

import java.util.Date;

public class PruebaHerencia {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Empleado emp1 = new Empleado("juan" ,2000);
		System.out.println(emp1);
		emp1.setSueldo(222);
		System.out.println(emp1);
		
		Cliente cli1 = new Cliente(new Date(),true) ;
		System.out.println(cli1);
	}

}
