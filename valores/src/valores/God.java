package valores;

import java.util.ArrayList;

public class God {

	public God() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList create() {
		ArrayList humano = new ArrayList();
		Man man = new Man("adam");
		humano.add(man);
		Woman woman = new Woman("eva");
		humano.add(woman);
		return humano;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 God p1 = new God();
		System.out.println(p1.create());
		 
	}

	@Override
	public String toString() {
		return "God [getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	

}

 class Man extends God{
	protected String nombre;
	public Man(	String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Man [nombre=" + nombre + "]";
	}
	
}
 class Woman extends God{
	protected String nombre;
	public Woman(	String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Woman [nombre=" + nombre + "]";
	}
	
}
