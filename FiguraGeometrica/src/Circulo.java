
public class Circulo extends FiguraGeometrica {
	protected double radio;


	public Circulo(int radio) {
		this.setRadio(radio);
		// TODO Auto-generated constructor stub
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double getArea() {
		
		double PI = 3.14;
		return PI * Math.pow(this.radio, 2);

}
	
	
	}
