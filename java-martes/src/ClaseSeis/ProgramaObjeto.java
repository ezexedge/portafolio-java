package ClaseSeis;

public class ProgramaObjeto  {
	
private String frase;



	public ProgramaObjeto(String frase) {
		this.setFrase(frase);
	}
	
	public Punto ejecutar() {
		double contN = 0;
		double contS = 0;
		double contE = 0;
		double contO = 0; 
		for(int i = 1 ; i < this.frase.length() ; i++) {
			if(frase.charAt(i) == 'n') {
				contN++;
			}
			if(frase.charAt(i) == 's') {
				contS++;
			}
			if(frase.charAt(i) == 'e') {
				contE++;
			}
			if(frase.charAt(i) == 'o') {
				contO++;
			}
		}
		
		double acumY   = 0;
		double acumX = 0;
		if(contN>0) {
			
			acumY+=contN;
			
		}
		if(contS>0) {
			acumY-=contS;
		}
		
	if(contO>0) {
			
			acumX-=contO;
			
		}
		if(contE>0) {
			acumX+=contE;
		}
		
		Punto aux = new Punto(acumX,acumY);
		
		return aux;
		
	
		
		
	}
	

	
	public String getFrase() {
		return frase;
	}


	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
	


	
	public static void main(String[] args) {
			
		ProgramaObjeto p1 = Compilador.compilar("tony");
		System.out.println(p1);
		
		ProgramaObjeto p2 = Compilador.compilar("cnf");
		System.out.println(p2.ejecutar());
		
		ProgramaObjeto p3 = Compilador.compilar("cnsssf");
		System.out.println(p3.ejecutar());
		
		ProgramaObjeto p4 = Compilador.compilar("cnoooof");
		System.out.println(p4.ejecutar());
		
	
		ProgramaObjeto p5 = Compilador.compilar("cneeeesssssf");
		System.out.println(p5.ejecutar());

	}
	
}
