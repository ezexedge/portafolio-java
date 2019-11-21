package clasecinco;

public class FizzBuzz {

	
	private int valor;
	
	public FizzBuzz(int valor) {
		// TODO Auto-generated constructor stub
		this.setValor(valor);
	}
	
	public FizzBuzz() {
		// TODO Auto-generated constructor stub
		this.valor = 0;
	}
	
	
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isDiv3(){
		 boolean resultado = (this.valor%3==0)? true:false;
		return resultado;
	
	}
	public boolean isDiv5(){
		 boolean resultado = (this.valor%5==0)? true:false;
			return resultado;
	}
	public boolean isDiv3y5(){
		 boolean resultado = (this.valor%5==0 && this.valor%3==0)? true:false;
			return resultado;
	}

	public void getTipo() {
		if(isDiv3()) {
		 System.out.println("fizz");
		}
		if(isDiv5()) {
			System.out.println("buzz");

		}
		
		if(isDiv3y5()) {
			System.out.println("fizzbuzz");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < 100; i++) {
			
			FizzBuzz f1 = new FizzBuzz(i);
			f1.getTipo();
		}

	}

}



