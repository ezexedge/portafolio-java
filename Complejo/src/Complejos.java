import java.util.Arrays;

import static java.lang.Math.*;
public class Complejos implements Comparable <Complejos> {
	
	
	double real;
	double img;

	

	public Complejos() {
		
		this(0,0);
	}
	
	
	public Complejos(double real , double img) {


		this.setreal(real);
		this.setimg(img);
	}
	
	public Complejos(double z) {
		this.setimg(z);
		this.setreal(z);
	}
	
	


	public double getreal() {
		return real;
	}

	public void setreal(double real) {
		this.real = real;
	}

	public double getimg() {
		return img;
	}

	public void setimg(double img) {
		this.img = img;
	}



	public String toString() {
		return "("+this.real+","+this.img+")";
	}

	public Complejos sumar(Complejos z) {
		
		return new Complejos(this.real+z.real,this.img+z.img);
		
	}
public Complejos sumar(Complejos z , Complejos xy) {
		
		return new Complejos(xy.real+z.real,xy.img+z.img);
		
	}

	public void DesplegarValores() {
		
		System.out.println("valores1: " + real + "\nvalores2:" + img);
	}
	
	
	
	public double modulo() {
		return(sqrt(pow(real,2)+pow(img,2)));
	}
	
	
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;

		}
		if(obj==null) {
			return false;

		}
		if(getClass()!=obj.getClass()) {
			return false;

		}
		Complejos aux = (Complejos) obj;
	if(Double.doubleToLongBits(real) != Double.doubleToLongBits(aux.real)) {
		return false;

	}
	if(Double.doubleToLongBits(img) != Double.doubleToLongBits(aux.img)) {
		return false;

	}
				
	return true;
		
	}
	
	public Complejos clone() {
		Complejos aux = new Complejos();
		aux.real = this.real;
		aux.img = this.img;
		
		return aux;
	}
	
	
	

	
	public int compareTo(Complejos o) {
		// TODO Auto-generated method stub
		if(this.modulo() == o.modulo() )
			return 0;
		else
			return this.modulo() > o.modulo()? 1 : -1;
	}


	public static void main(String[] args) {
		
		Complejos z1 = new Complejos(3.0,2.0);
		Complejos z2 = new Complejos(9.0,2.0);
		Complejos z3 = new Complejos(2.1,2.1);
		
		System.out.println(z1.equals(z3));
		System.out.println(z1.equals(z2));
		
		Complejos z4 = z1.clone();
		System.out.println("clonado z4: " + z4);
		
		
		
		Complejos arrComplejo [] = new Complejos[3];
		
		arrComplejo[0] = z1;
		arrComplejo[1] = z2;
		arrComplejo[2] = z3;
		
		Arrays.sort(arrComplejo);
		
		Complejos nuevoZ = new Complejos(3.0,2.0);
		
		for(Complejos val : arrComplejo) {
			System.out.println(nuevoZ.compareTo(val));
		}
		
		System.out.println(z1.sumar(z2));//(12.0,4.0)
		
		
		
	}

	

}
