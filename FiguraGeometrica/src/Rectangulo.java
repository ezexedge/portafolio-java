
public class Rectangulo extends FiguraGeometrica {
protected double altura;
protected double base;
	public Rectangulo(double altura, double base) {
		// TODO Auto-generated constructor stub
		this.setAltura(altura);
		this.setBase(base);
	}
	
	

	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getBase() * this.getAltura();
	}



	
}
