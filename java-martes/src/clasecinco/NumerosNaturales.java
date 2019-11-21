package clasecinco;

public class NumerosNaturales {

	private int recorrer;
	
	
	public NumerosNaturales(int recorrer) {
		this.setRecorrer(recorrer);
		// TODO Auto-generated constructor stub
	}
	public NumerosNaturales() {
		this.setRecorrer(0);
	}

	
	public int getRecorrer() {
		return recorrer;
	}


	public void setRecorrer(int recorrer) {
		this.recorrer = recorrer;
	}
	
	public void bucle() {
		int acum = 0;
		for(int i = 1; i< this.getRecorrer(); i++) {
			System.out.println(acum+=i);
		}
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		NumerosNaturales n1 = new NumerosNaturales();
		n1.bucle();
		 
		
	}

}
