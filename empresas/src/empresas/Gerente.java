package empresas;

public class Gerente extends EmpleadoPermanente {

	static final int plusGerente = 4000;
	
	
	public Gerente(String nombre ,int cuil,int cantHijos,boolean matrimonio,String fechaAlta,int hsTrabajadas) {

		super(nombre,cuil, hsTrabajadas, matrimonio,fechaAlta);

		this.setSueldo(this.sueldo());
		
		
	}
	

	
	@Override
	public double sueldo() {
		// TODO Auto-generated method stub
		return this.plus() + this.getHsExtras() * valor_horas_extras + sueldo_basico + plusGerente; 

		
	}
	
	




	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		Gerente p1 = new Gerente("coco",11111,2,true,"11/02/1999",5);
		System.out.println(p1.toString());
		EmpleadoPermanente p2 = new EmpleadoPermanente("tony",11111,2,true,"11/02/1999",5);
		System.out.println(p2.toString());
	
		
	}

}
