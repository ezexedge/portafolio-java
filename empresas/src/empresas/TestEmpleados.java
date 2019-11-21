package empresas;
import java.util.ArrayList;

public class TestEmpleados {

	public TestEmpleados() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Empleados p1 = new EmpleadoTemporal("pepa", 111,2,true, "22/02/1999",6);
			Empleados p2 = new EmpleadoPermanente("coco", 333, 2, true, "02/11/2000", 6);
			Empleados p3 = new EmpleadoPermanente("coco", 333, 2, true, "02/11/2000", 6);

			
			ArrayList<Empleados> empleado = new ArrayList<Empleados>();
			
			empleado.add(p1);
			empleado.add(p2);
			
			System.out.println(p1.sueldo());
			System.out.println(p2.sueldo());
			
			
			System.out.println("//////");
			
			Empresas coto = new Empresas(1161,"coto srl",empleado);
			Empresas spotify = new Empresas(1161,"spotify s.a",empleado);
			
			System.out.println(coto.totalSueldoEmpleados());
			
			System.out.println(coto.toString());
			
			System.out.println(p2.equals(p3));
			
			System.out.println(coto.equals(spotify));
			
			
	}

}
