package Cuadrante;

import java.util.ArrayList;
import java.util.Collection;

import empresas.Empleados;

public class Cuadrante {

	public Cuadrante() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	
		Punto p2 = new Punto(5.2,1.1);
		Punto p3 = new Punto(6.2,1.1);
		Punto p4 = new Punto(7.2,1.1);

		
		
		ArrayList<Punto> arregloPunto = new ArrayList<Punto>();
		
		
		arregloPunto.add(p2);
		arregloPunto.add(p3);
		arregloPunto.add(p4);

	
	
		System.out.println(	Cuadrante.getCuadrante(arregloPunto));

		
	}
	
	
	public static  Integer getCuadrante(Collection<Punto> p) {
		
		Integer cuadranteUno = 0;

		
		
		for(Punto puntos : p) {
			
			
			if(puntos.getX() > 0 && puntos.getResetY() > 0) {
					cuadranteUno++;
				
				
				}
			
			
		
		 
			
		}
			
		
	
		return cuadranteUno;
		
	}
///0,3,4 solucion del ejercicio 4
}
