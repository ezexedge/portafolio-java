package claseOcho;

import ClaseSeis.Punto;



public class Punto2D {
	private double x;
	private double y;
	private double x1;
	private double y1;


	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
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
	public Punto2D(double x, double y) {
		this.setX(x);
		this.setY(y);
		this.setX1(x);
		this.setY1(y);
	}

	public Punto2D(){
		this(0,0);
	}

	public Punto2D(double n){
		this.setX(n);
		this.setY(n);
		this.setX1(n);
		this.setY1(n);
	}

	public Punto2D(Punto2D obj){
		this.setX(obj.getX());
		this.setY(obj.getY());
		this.setX1(obj.getX());
		this.setY1(obj.getY());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Punto2D [x=" + x + ", y=" + y + "]";
	}

	public double calcularDistancia(Punto2D obj){
		return Math.sqrt(
				Math.pow(obj.getX() - this.getX(), 2) + Math.pow(obj.getY() - this.getY(), 2));
	}

	public static double calcularDistancia(Punto2D obj1, Punto2D obj2){
		return Math.sqrt(
				Math.pow(obj1.getX() - obj2.getX(), 2) + Math.pow(obj1.getY() - obj2.getY(), 2));
	}
	
	public void reset() {
		setX(this.getX1());
		setY(this.getY1());
	}
	
	public Cuadrante getCuadrante() {
		if(this.getX() > 0 && this.getY() >0) return Cuadrante.I;
		if(this.getX() < 0 && this.getY() >0) return Cuadrante.II;
		if(this.getX() < 0 && this.getY() <0) return Cuadrante.III;
		if(this.getX() > 0 && this.getY() >0) return Cuadrante.IV;
		return Cuadrante.ORIGEN;
	}
	
	public static void main(String[] args) {
		Punto2D p1 = new Punto2D(-1,0); //creo Punto2Ds para comparar
		Punto2D p2 = new Punto2D(2);
		Punto2D p3 = new Punto2D();
		Punto2D p4 = new Punto2D(p1);
		
		//Calculo distancia entre Punto2Ds y muestro en pantalla
		System.out.println("Distancia entre Punto2Ds: "+p1.calcularDistancia(p2));
		System.out.println("Distancia entre Punto2Ds con static: "+ Punto2D.calcularDistancia(p1, p2));
		
		//Pruebo reset
		System.out.println("Punto2D 4 original: "+p4);
		p4.setX(3);
		p4.setY(4);
		System.out.println("Punto2D 4 modificado: "+p4);
		p4.reset();
		System.out.println("Punto2D 4 reseteado: "+p4);
		
		//Pruebo equals, debe dar true
		System.out.println(p4.equals(p1));
		
		//Verifico cuadrante del Punto2D, debe ser ORIGEN
		System.out.println(p3.getCuadrante());
	}

}
