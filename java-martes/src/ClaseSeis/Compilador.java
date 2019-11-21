package ClaseSeis;

public class Compilador{
	
  String test;
  
  


	public Compilador(String test) {
		// TODO Auto-generated constructor stub
		this.setTest(test);
		
	}
	
	

	public String getTest() {
		return test;
	}



	@Override
	public String toString() {
		return "Compilador [test=" + test + "]";
	}



	public void setTest(String test) {
		this.test = test;
	}
	
	public static ProgramaObjeto compilar(String test) {
		if(test == null)return null;
		if(test.length() < 2) return null;
		return (test.matches("^[c](o|s|n|e)*[f]$")) ? new ProgramaObjeto(test) : null;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
