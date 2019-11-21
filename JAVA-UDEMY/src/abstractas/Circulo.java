package abstractas;

public class Circulo extends FiguraGeometrica {

	public Circulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("aqui deberia dibujar un" + this.getClass().getSimpleName());
		
	}

}
