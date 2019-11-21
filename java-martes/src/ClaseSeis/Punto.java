package ClaseSeis;

public class Punto {
	
	private double x;
	private double y;
	private double resetX;
	private double resetY;
	

	public Punto() {
		
		
		this(0,0);
		this.setResetX(this.x);
		this.setResetY(this.y );
	

		// TODO Auto-generated constructor stub
	}
	public double getResetX() {
		return resetX;
	}
	public void setResetX(double resetX) {
		this.resetX = resetX;
	}
	public double getResetY() {
		return resetY;
	}
	public void setResetY(double resetY) {
		this.resetY = resetY;
	}
	public Punto(double x , double y) {
		this.setX(x);
		this.setY(y);
		this.setResetX(this.x);
		this.setResetY(this.y );
	
		
	}
	
	
	
	public Punto(double p) {
		this.setX(p);
		this.setY(p);
		this.setResetX(this.x);
		this.setResetY(this.y );
	}
	
	public Punto(Punto p ) {
		this.setX(p.getX());
		this.setY(getY());
	}
	

	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	public void getCant() {
		System.out.println( (this.getY()) + " - " + (this.getX()));
	}
	
	
	public double distanciaPuntos (Punto p) {
		
		double hipotenusa = Math.hypot(this.getX() - p.getX(), this.getY() - p.getY());
		return hipotenusa;

	}
	
	public static void distanciaPuntos(Punto p1, Punto p2) {
		
		double hipotenusa = Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());

		System.out.println(hipotenusa);
	}
	
	
	

	public void reset() {
		this.setX(this.getResetX());
		this.setY(this.getResetY());
	}
	
	
	

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Punto p1  = new Punto(3.0,4.4);
	p1.getCant();
	p1.setX(2.2);
	p1.setY(6.6);
	p1.getCant();
    p1.reset();
    p1.getCant();
    
    //funciona todo ok
    
    

	}

}
