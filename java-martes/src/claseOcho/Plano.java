package claseOcho;

import java.util.ArrayList;
import java.util.Arrays;

public class Plano {
	
	private ArrayList<Punto2D> Punto2Ds;
	
	public Plano(ArrayList<Punto2D> Punto2Ds) {
		this.setPunto2Ds(Punto2Ds);
	}

	public ArrayList<Punto2D> getPunto2Ds() {
		return this.Punto2Ds;
	}

	public void setPunto2Ds(ArrayList<Punto2D> Punto2Ds) {
		this.Punto2Ds = Punto2Ds;
	}
	
	public void agregarPunto2Ds(Punto2D p){
		if(p != null)this.getPunto2Ds().add(p);
	}
	
	public int getCantPunto2Ds(Cuadrante c) {
		int cantPunto2Ds = 0;
		//this.getPunto2Ds()) traigo al arreglo que cree al principio
		for(Punto2D p : this.getPunto2Ds()) {
			//al recorrer veo que cuadrante le corresponde a cada uno
			//y me fijo si es igual al cuadrante que le pase
			//y si es igual acumula el contador del cuadrante en cuestion
			if(p.getCuadrante().equals(c)) {
				cantPunto2Ds++;
			}
		}
		
		return cantPunto2Ds;
	}
	
	public static void main(String[] args) {
		Punto2D p1 = new Punto2D(-1,0); //creo Punto2Ds para agregar al array
		Punto2D p2 = new Punto2D(2);
		Punto2D p3 = new Punto2D();
		Punto2D p4 = new Punto2D(p1);
		//Creo el Array y le meto mis Punto2Ds
		ArrayList<Punto2D> vPunto2Ds = new ArrayList<Punto2D>(Arrays.asList(p1, p2, p3, p4));
		
		Plano plano1 = new Plano(vPunto2Ds); //creo mi plano
		
		//Pasando un cuadrante averiguo cuantos Punto2Ds hay en este, en el origen debe haber 3
		System.out.println(plano1.getCantPunto2Ds(Cuadrante.ORIGEN));
		
	}
	
}
