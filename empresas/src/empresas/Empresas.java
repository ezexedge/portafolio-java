package empresas;

import java.util.ArrayList;

public class Empresas {


	private int cuit;
	private ArrayList<Empleados> empleado;
	private String razonSocial;
	
	
	public Empresas(int cuit,String razonSocial,ArrayList<Empleados> empleado) {
		this.setCuit(cuit);
		this.setRazonSocial(razonSocial);
		this.setEmpleado(empleado);
	
		
	}
	
	
	public int cantidadEmpleados() {
		return this.getEmpleado().size();
	}
	
	
	public double sueldoEmpleadosTotal() {
		double total=0;
		for(Empleados emp : this.getEmpleado() ) {
			total+=emp.sueldo();
		}
		
		return total;
	}
	
	

	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public int getCuit() {
		return cuit;
	}


	public void setCuit(int cuit) {
		this.cuit = cuit;
	}


	public ArrayList<Empleados> getEmpleado() {
		return empleado;
	}


	public void setEmpleado(ArrayList<Empleados> empleado) {
		this.empleado = empleado;
	}


	public double totalSueldoEmpleados() {
		double total = 0;
		for(Empleados emp : this.getEmpleado()) {
			total += emp.sueldo();
		}
		return total;
	}

	
	

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresas other = (Empresas) obj;
		if (cuit != other.cuit)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Empresas [cuit=" + cuit + ", \n" +" razonSocial=" + razonSocial + ", \n" + " empleados=" + empleado + "]";
	}
	
	
	


	
	

	
	
	
	
	
	

}
