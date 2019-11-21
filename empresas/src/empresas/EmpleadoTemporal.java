package empresas;

public class EmpleadoTemporal extends Empleados{
	

protected int hsTrabajadas;
protected double sueldo;
static final int valorHora = 100;
	
	
	public EmpleadoTemporal(String nombre ,int cuil,int cantHijos,boolean matrimonio,String fechaAlta,int hsTrabajadas ) {
		super(nombre,cuil,cantHijos,matrimonio,fechaAlta);
		this.setHsTrabajadas(hsTrabajadas);
		this.setSueldo(this.sueldo());
			
		
		// TODO Auto-generated constructor stub
		
	}
	

	

	
	public double getSueldo() {
		return sueldo;
	}




	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public int getHsTrabajadas() {
		return hsTrabajadas;
	}


	public void setHsTrabajadas(int hsTrabajadas) {
		this.hsTrabajadas = hsTrabajadas;
	}
	
	




	@Override
	public double sueldo() {
		// TODO Auto-generated method stub
		
		  double total= this.getHsTrabajadas() * valorHora;
		  return total;
		
	}
	
	
	

	@Override
	public String toString() {
		return "EmpleadoTemporal [hsTrabajadas=" + hsTrabajadas + ", sueldo=" + sueldo + "]";
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
