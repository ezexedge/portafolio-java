package empresas;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class EmpleadoPermanente extends Empleados{
protected int hsExtras;
protected double sueldo;
static final int valor_horas_extras = 150;
static final double sueldo_basico = 1000;


	public EmpleadoPermanente(String nombre ,int cuil,int cantHijos,boolean matrimonio,String fechaAlta,int hsExtras) {
		super(nombre,cuil,cantHijos,matrimonio,fechaAlta);
		this.setHsExtras(hsExtras);
		this.setSueldo(this.sueldo());
		
		
		
		// TODO Auto-generated constructor stub
	}
	


	public EmpleadoPermanente(String nombre ,int cuil,int cantHijos,boolean matrimonio,String fechaAlta) {
		super(nombre,cuil,cantHijos,matrimonio,fechaAlta);
		this.setHsExtras(0);
		this.setSueldo(this.sueldo());
		
		
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public boolean isMatrimonio() {
		return matrimonio;
	}




	public void setMatrimonio(boolean matrimonio) {
		this.matrimonio = matrimonio;
	}







	public int getHsExtras() {
		return hsExtras;
	}



	public void setHsExtras(int hsExtras) {
		this.hsExtras = hsExtras;
	}

	
	public int calculoFecha() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(this.getFechaAlta(), fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		
		return periodo.getYears();
	}


	public double plus() {
		
	double valorCasado  = this.isMatrimonio() ? valor_casado : 0;
	
	return valorCasado + this.getCantHijos() * valor_por_hijo + this.calculoFecha() * valor_fechaAlta;
	}

	@Override
	public double sueldo() {
		// TODO Auto-generated method stub

		return this.plus() + this.getHsExtras() * valor_horas_extras + sueldo_basico;
	}




	@Override
	public String toString() {
		return  "EmpleadoPermanente" +  super.toString() +  " [hsExtras=" + hsExtras + ", sueldo=" + sueldo + "]" ;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoPermanente p1 = new EmpleadoPermanente("pepa",222,3,true,"01/12/2010");
		System.out.println(p1.toString());
		
	}











}
