package ejerciciosLibro;

public class Numero {
	private int valor;

	public Numero(int valor) {
		// TODO Auto-generated constructor stub
		this.setValor(valor);
	}
	

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Numero sumar(int a) {
		 
		
		this.valor += a;
		return this;
		
	}
	
	public static int sumar(int a , int b) {
		return  a + b;
	}

	

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero n1 = new Numero(5);
		n1.sumar(10);
		System.out.println(n1);
		n1.sumar(22);
		System.out.println(n1);
		
		int n2  = Numero.sumar(2,3);
		System.out.println(n2);

	}

}
