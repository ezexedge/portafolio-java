package claseOcho;
import static java.lang.System.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punto3D extends Punto2D{
	   private Double z;
		private double resetZ;


	   public Punto3D(Double x,Double y, Double z) 
		{	super(x,y);
			this.z=z;
			this.setResetZ(z);
		}
		public Punto3D() 
		{	super();
			this.z = 0.0;
			this.setResetZ(0);
		}


		
		
		public Double getZ() {
			return z;
		}
		public void setZ(Double z) {
			this.z = z;
		}
		public double getResetZ() {
			return resetZ;
		}
		public void setResetZ(double resetZ) {
			this.resetZ = resetZ;
		}
		public Double distanciaPuntos(Object obj) {
			Punto3D p = (Punto3D) obj;
			return sqrt( pow(getX()-p.getX(),2) +  pow(getY()-p.getY(),2) + pow(z-p.z,2) );
		}

		@Override
		public void reset() {
			this.setZ(this.getResetZ());
			
		}
		
		
		public String toString() {
			return super.toString() + " z= " + z ;
		}
		

		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((z == null) ? 0 : z.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Punto3D other = (Punto3D) obj;
			if (z == null) {
				if (other.z != null)
					return false;
			} else if (!z.equals(other.z))
				return false;
			return true;
		}
		
		
		
		public Punto3D clone(){	
			return new Punto3D(getX(), getY(), z);
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto3D p1 = new Punto3D(2.0,1.0,1.1);
		System.out.println(p1.toString());
		p1.setZ(5.5);
		System.out.println(p1.toString());
		p1.reset();
		System.out.println(p1.toString());
		
		
		Punto3D p2 = new Punto3D(2.2,1.1,5.5);
		
		System.out.println(p1.distanciaPuntos(p2));
		
		
		Punto3D p3 = p2.clone();
		
		System.out.println(p3.toString()); // copia el valor de p2

		System.out.println(p3.equals(p2)); //true
		
		System.out.println(p3.equals(p1)); //false
		

		
	}

}
