
public class Cuadrado extends FiguraGeometrica {
protected double altura;
	public Cuadrado(double altura) {
		// TODO Auto-generated constructor stub
		this.setAltura(altura);
	}

	
	
	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
	 return this.getAltura() * this.getAltura();
	}

}
