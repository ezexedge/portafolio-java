package abstractas;

public class Triangulo extends FiguraGeometrica{

	public Triangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("aqui deberia dibujar un" + this.getClass().getSimpleName());

	}

}
