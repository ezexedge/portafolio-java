
public class Animal implements AccionesGeneral{
	private String raza;

	public Animal(String raza) {
		this.setRaza(raza);
		// TODO Auto-generated constructor stub
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
		
	}
	
	public void cazar() {
		System.out.println("el animal de raza" + this.getRaza() + "esta cazando desde la clase anaimal");
	}

	@Override
	public void desplazarce() {
		// TODO Auto-generated method stub
		System.out.println("el animal de raza" + this.getRaza() + " se esta desplazando "  );
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("el animal de raza" + this.getRaza() + " esta jugando");
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}
	
	

}
