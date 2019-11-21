package exception;

public class Ejemplo1 {
	public static int numerador = 10;
	public  static Integer denominador = null;
	public static float division;

	public Ejemplo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("antes de hacer la division");
		
		try {
			division = numerador / denominador;
			
		}catch(ArithmeticException ex) {
			division=0;
			System.out.println("error " + ex.getMessage());
		}catch(NullPointerException ex) {
			
			division = 1;
			System.out.println("error" + ex.getMessage());
				
		}finally {
			System.out.println("divion" + division);
			System.out.println("despues de hacer la division");
		}

	}

}
