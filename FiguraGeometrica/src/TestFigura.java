
public class TestFigura {

	public TestFigura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FiguraGeometrica figura1 = new Rectangulo(2,2);
		
		System.out.println(figura1.toString()); //4 BASE * ALTURa

		
		FiguraGeometrica figura2 = new Circulo(6); //113.04 RADIO
		
	
		System.out.println(figura2.toString());
		
		
		FiguraGeometrica figura3 =  new Cuadrado(2);
		System.out.println(figura3.toString()); //4    altura ^ 2
		
	

	}

}
