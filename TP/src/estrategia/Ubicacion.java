package estrategia;


public class Ubicacion {
	private double x;
	private double y;
	private double resetX;
	private double resetY;
	
	
	
	public Ubicacion(double x, double y) {
		this.setX(x);
		this.setY(y);
		this.setResetX(x);
		this.setResetY(y);
		
	}
	
	public Ubicacion(double xy) {
		this(xy, xy);
		this.setResetX(xy);
		this.setResetY(xy);
	}
	
	public Ubicacion() {
		this(0,0);
		this.setResetX(0);
		this.setResetY(0);
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

	
	

	public void reset() {
		this.setX(this.getResetX());
		this.setY(this.getResetY());
	}
	
	
	public Ubicacion clone() {
		
		return new Ubicacion(x, y);
	}
	
	
	
	public Double distanciaPuntos(Object j) {
		Ubicacion k = (Ubicacion) j;
		Double cateto1 = Math.pow(x-k.getX(), 2);
		Double cateto2 = Math.pow(y-k.getX(), 2);
		return Math.sqrt(cateto1+cateto2);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ubicacion other = (Ubicacion) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + "]";
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
