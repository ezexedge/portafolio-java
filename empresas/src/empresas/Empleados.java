package empresas;

public abstract class Empleados{
protected String nombre;
protected int cuil;
protected int cantHijos;
protected boolean matrimonio;

protected String fechaAlta;
static final int valor_por_hijo = 200;
static final int valor_casado =100;
static final int valor_fechaAlta = 150;


	public Empleados(String nombre ,int cuil,int cantHijos,boolean matrimonio,String fechaAlta) {
	
		this.setCuil(cuil);
		this.setNombre(nombre);
		this.setCantHijos(cantHijos);
		this.setMatrimonio(matrimonio);
		this.setfechaAlta(fechaAlta);
		
	
		// TODO Auto-generated constructor stub
	}
	
	

	public String getfechaAlta() {
		return fechaAlta;
	}


	public void setfechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public boolean isMatrimonio() {
		return matrimonio;
	}


	public void setMatrimonio(boolean matrimonio) {
		this.matrimonio = matrimonio;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCuil() {
		return cuil;
	}


	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public  double sueldo() {
		return 0;
	}




	@Override
	public String toString() {
		return " [nombre=" + nombre + ", cuil=" + cuil + ", cantHijos=" + cantHijos + ", matrimonio="
				+ matrimonio + ", fechaAlta=" + fechaAlta + "]";
	}

	
	




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		if (cuil != other.cuil)
			return false;
		return true;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
