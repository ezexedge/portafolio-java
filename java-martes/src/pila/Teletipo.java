package pila;

import java.util.ArrayList;

public class Teletipo {

	private String valor;
	
	public Teletipo(String valor) {
		this.setValor(valor);
		// TODO Auto-generated constructor stub
	}
	
	

	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}




	
	public void procesar() {
		ArrayList<Character> p1 = new ArrayList<Character>();
		for(int i = 0 ; i < valor.length() ; i++) {
			
			char c = this.getValor().charAt(i);
			p1.add(c);
			p1.remove(c);
			if(c == '/' ) {
				int valor = p1.indexOf(c);
				p1.remove(valor);
				p1.remove(valor - 1);
				
			}
			
		
			
		
			
			}
		System.out.println(p1);

					
		}
	
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teletipo p1 = new Teletipo("tony");
		p1.procesar();
		String pepa = "pepa";
		System.out.println(p1.getValor());
		System.out.println();

	}

}
